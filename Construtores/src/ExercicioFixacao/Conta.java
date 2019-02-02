package ExercicioFixacao;

public class Conta {
    private String numeroconta;
    private String titular;
    private double saldo;


    public Conta(String numeroconta, String titular) {
        this.numeroconta = numeroconta;
        this.titular = titular;

    }

    public Conta(String numeroconta, String titular, double deposito_inicial) {
        this.numeroconta = numeroconta;
        this.titular = titular;
        Depositar(deposito_inicial); // chamada do método depositar

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

    public String getNumeroconta() {
        return this.numeroconta;
    }

    public void Depositar(double quantia) {
        this.saldo += quantia;
    }

    public void Sacar(double sacar) {
        this.saldo = this.saldo - sacar + 5.0;

    }

    public String toString() {
        return "Account " + getNumeroconta() + ", Holder: " + getTitular() + ", Saldo: $" + String.format("%.2f", getSaldo());
    }

}
