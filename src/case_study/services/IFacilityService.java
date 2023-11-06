package case_study.services;

import case_study.models.Facility;
import case_study.models.Villa;

import java.util.Map;

public interface IFacilityService {

    void addFacility(Facility facility, Facility facility1);

    boolean checkCode(String code);

    void getAll();
}
