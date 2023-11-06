package case_study.utils.write_read;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class WriteAndReadFacility {
    private static final String PATH = "src/case_study/data/facility.csv";

    public static void writeToFile(Map<Facility, Integer> facilityMap){
        File file = new File(PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            Set<Facility> facilitySet = facilityMap.keySet();
            for (Facility facility: facilitySet){
                try {
                    if (facility instanceof Villa){
                        bufferedWriter.write(facility.getCode() +
                                "," + facility.getServiceName() +
                                "," + facility.getAcreage() +
                                "," + facility.getCostsRental() +
                                "," + facility.getMaxPeople() +
                                "," + facility.getTypeRental() +
                                "," + ((Villa) facility).getStandardsRoom() +
                                "," + ((Villa) facility).getFloorsOfNumber() +
                                "," + ((Villa) facility).getAreaPoolSwimming());
                        bufferedWriter.newLine();
                    }
                    if (facility instanceof House){
                        bufferedWriter.write(facility.getCode() +
                                "," + facility.getServiceName() +
                                "," + facility.getAcreage() +
                                "," + facility.getCostsRental() +
                                "," + facility.getMaxPeople() +
                                "," + facility.getTypeRental()+
                                "," + ((House)facility).getStandardsRoom()+
                                "," + ((House)facility).getFloorsOfNumber());
                        bufferedWriter.newLine();
                    }
                    if (facility instanceof Room){
                        bufferedWriter.write(facility.getCode() +
                                "," + facility.getServiceName() +
                                "," + facility.getAcreage() +
                                "," + facility.getCostsRental() +
                                "," + facility.getMaxPeople() +
                                "," + facility.getTypeRental()+
                                "," + ((Room)facility).getIncludedServiceFree());
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.flush();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                assert fileWriter != null;
                fileWriter.close();
                assert bufferedWriter != null;
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Map<Facility, Integer> readToFile(){
        Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        Facility facility = null;
        try {
            fileReader = new FileReader(PATH);
            bufferedReader = new BufferedReader(fileReader);
            String temp = "";
            String[] temStr;
            while ((temp = bufferedReader.readLine()) != null){
                temStr = temp.split(",");
                if (temStr.length == 10){
                    facility = new Villa(temStr[0],
                            temStr[1],
                            Float.parseFloat(temStr[2]),
                            Double.parseDouble(temStr[3]),
                            Integer.parseInt(temStr[4]),
                            temStr[5],
                            temStr[6],
                            Integer.parseInt(temStr[7]),
                            Float.parseFloat(temStr[8]));
                    facilityMap.put(facility, (int) Float.parseFloat(temStr[9]));
                }else if (temStr.length == 9){
                    facility = new House(temStr[0],
                            temStr[1],
                            Float.parseFloat(temStr[2]),
                            Double.parseDouble(temStr[3]),
                            Integer.parseInt(temStr[4]),
                            temStr[5],
                            temStr[6],
                            Integer.parseInt(temStr[7]));
                    facilityMap.put(facility, (int) Float.parseFloat(temStr[8]));
                }else if (temStr.length == 8){
                    facility = new Room(temStr[0],
                            temStr[1],
                            Float.parseFloat(temStr[2]),
                            Double.parseDouble(temStr[3]),
                            Integer.parseInt(temStr[4]),
                            temStr[5],
                            temStr[6]);
                    facilityMap.put(facility, (int) Float.parseFloat(temStr[7]));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return facilityMap;
    }
}
