package entitites;

public class BusinessAccount extends Account {
    private Double loanlimit;

    public Double getLoanlimit() {
        return loanlimit;
    }

    public void setLoanlimit(Double loanlimit) {
        this.loanlimit = loanlimit;
    }

    public BusinessAccount() {
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanlimit) {
        super(number, holder, balance);
        this.loanlimit = loanlimit;
    }

    public void loan(double amount) {
        if (amount <= loanlimit) // só emprestaamos se o valor da quantia for >= ao limite de empréstimo
            balance += amount - 10.0;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount); // usando o método withdraw da superclasse, no caso, Account
        // ainda tenho que ter um desconto 2.0 exclusivo da BussinessAccount
        balance -= 2.0;
    }
}