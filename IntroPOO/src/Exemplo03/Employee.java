package Exemplo03;

public class Employee {
    public String name;
    public double GrossSalary;
    public double Tax;


    public double netSalary() {
        return GrossSalary - Tax;
    }

    public void IncreaseSalary(double porcentagem) {
        this.GrossSalary = this.GrossSalary + (this.GrossSalary * porcentagem / 100);
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
