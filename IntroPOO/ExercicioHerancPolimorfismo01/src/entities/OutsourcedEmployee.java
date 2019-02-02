package entities;

public class OutsourcedEmployee extends Employee {

    private Double addtionalCharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, int hours, double valueperhours, double addtionalCharge) {
        super(name, hours, valueperhours);
        this.addtionalCharge = addtionalCharge;
    }

    public Double getAddtionalCharge() {
        return addtionalCharge;
    }

    public void setAddtionalCharge(Double addtionalCharge) {
        this.addtionalCharge = addtionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + addtionalCharge * 1.1;
    }
}
