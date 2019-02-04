package Entities;

public class PessoaFisica extends Pessoa {

    private Double gastossaude;


    public PessoaFisica(String name, double reandanual, double gastosaude) {
        super(name, reandanual);
        this.gastossaude = gastosaude;
    }

    @Override
    public double Tax() {
        if (getRendaanual() < 20000.00) {
            return getRendaanual() * 0.15 - this.gastossaude * 0.5;
        } else {
            return getRendaanual() * 0.25 - this.gastossaude * 0.5;
        }

    }
}
