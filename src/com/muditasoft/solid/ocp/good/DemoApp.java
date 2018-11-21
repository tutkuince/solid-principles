package com.muditasoft.solid.ocp.good;

public class DemoApp {
    public static void main(String[] args) {
        HealthInsuranceSurveyor healthInsuranceSurveyor=new HealthInsuranceSurveyor();
        ClaimApprovalManager claim1=new ClaimApprovalManager();
        claim1.processClaim(healthInsuranceSurveyor);
        VehicleInsuranceSurveyor vehicleInsuranceSurveyor=new VehicleInsuranceSurveyor();
        ClaimApprovalManager claim2=new ClaimApprovalManager();
        claim2.processClaim(vehicleInsuranceSurveyor);
    }
}
