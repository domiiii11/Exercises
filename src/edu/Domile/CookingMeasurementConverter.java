package edu.Domile;

public class CookingMeasurementConverter {

    public static CookingMeasurement convert(CookingMeasurement originalMeasurement, String unit){
       float mlUnit= originalMeasurement.getAmount() * Cooking.Amounts.convertUnit(originalMeasurement.getUnit());
       float otherUnit = mlUnit/Cooking.Amounts.convertUnit(unit);
       return new CookingMeasurement(unit, otherUnit);
    }
}
