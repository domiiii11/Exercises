package edu.Domile;

public class CookingMeasurement {

    private String unit;
    private float amount;

    public CookingMeasurement(String unit, float amount) {
        this.unit = unit;
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CookingMeasurement{" +
                "unit='" + unit + '\'' +
                ", amount=" + amount +
                '}';
    }
}
