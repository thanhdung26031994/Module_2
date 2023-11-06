package case_study.services.impl;

import case_study.models.Facility;
import case_study.models.Villa;
import case_study.repositories.IFacilityRepository;
import case_study.repositories.impl.FacilityRepository;
import case_study.services.IFacilityService;

import java.util.Map;

public class FacilityService implements IFacilityService {
    private static IFacilityRepository iFacilityRepository = new FacilityRepository();


    @Override
    public void addFacility(Facility facility, Facility facility1) {
        iFacilityRepository.addFacility(facility, facility1);
    }

    @Override
    public boolean checkCode(String code) {
        return iFacilityRepository.checkCode(code);
    }

    @Override
    public void getAll() {
        iFacilityRepository.getAll();
    }
}
