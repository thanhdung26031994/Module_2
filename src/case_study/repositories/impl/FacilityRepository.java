package case_study.repositories.impl;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.repositories.IFacilityRepository;
import case_study.utils.write_read.WriteAndReadFacility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FacilityRepository implements IFacilityRepository {
    public static Map<Facility, Integer> facilityIntegerMap() {
        return WriteAndReadFacility.readToFile();
    }

    @Override
    public void addFacility(Facility facility, Facility facility1) {
        Map<Facility, Integer> facilityIntegerMap1 = facilityIntegerMap();
        Facility facility2;
        if (facility instanceof Villa) {
            facility2 = new Villa(facility1.getCode(),
                    facility1.getServiceName(),
                    facility1.getAcreage(),
                    facility1.getCostsRental(),
                    facility1.getMaxPeople(),
                    facility1.getTypeRental(),
                    ((Villa) facility).getStandardsRoom(),
                    ((Villa) facility).getFloorsOfNumber(),
                    ((Villa) facility).getAreaPoolSwimming());
            facilityIntegerMap1.put(facility2, facilityIntegerMap1.getOrDefault(facility2, -1) + 1);
            WriteAndReadFacility.writeToFile(facilityIntegerMap1);
        }else if (facility instanceof House){
            facility2 = new House(facility1.getCode(),
                    facility1.getServiceName(),
                    facility1.getAcreage(),
                    facility1.getCostsRental(),
                    facility1.getMaxPeople(),
                    facility1.getTypeRental(),
                    ((House)facility).getStandardsRoom(),
                    ((House)facility).getFloorsOfNumber());
            facilityIntegerMap1.put(facility2,facilityIntegerMap1.getOrDefault(facility2,-1)+ 1);
            WriteAndReadFacility.writeToFile(facilityIntegerMap1);
        }else if (facility instanceof Room){
            facility2 = new Room(facility1.getCode(),
                    facility1.getServiceName(),
                    facility1.getAcreage(),
                    facility1.getCostsRental(),
                    facility1.getMaxPeople(),
                    facility1.getTypeRental(),
                    ((Room)facility).getIncludedServiceFree());
            facilityIntegerMap1.put(facility2, facilityIntegerMap1.getOrDefault(facility2, -1)+1);
            WriteAndReadFacility.writeToFile(facilityIntegerMap1);
        }
    }

    @Override
    public boolean checkCode(String code) {
        Set<Facility> facilitySet = facilityIntegerMap().keySet();
        for (Facility facility: facilitySet ){
            if (facility.getCode().toLowerCase().contentEquals(code.toLowerCase())){
                return true;
            }
        }
        return false;
    }

    @Override
    public void getAll() {
        Map<Facility, Integer> facilityIntegerMap = facilityIntegerMap();
        Set<Facility> facilitySet = facilityIntegerMap.keySet();
        for (Facility facility: facilitySet){
            System.out.println(facility);
        }
    }
}
