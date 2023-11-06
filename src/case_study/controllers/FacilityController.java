package case_study.controllers;

import case_study.models.Facility;
import case_study.models.Villa;
import case_study.services.IFacilityService;
import case_study.services.impl.FacilityService;

import java.util.Map;

public class FacilityController {
    private static IFacilityService iFacilityService = new FacilityService();

    public void addFacility(Facility facility, Facility facility1) {
        iFacilityService.addFacility(facility, facility1);
    }

    public boolean checkCode(String code) {
        return iFacilityService.checkCode(code);
    }

    public void getAll() {
        iFacilityService.getAll();
    }
}
