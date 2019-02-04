package Entities;

public class PessoaJuridica extends Pessoa {
    private Integer numeroFuncionarios;

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public PessoaJuridica(String name, double rendaanual, int numeroFuncionarios) {
        super(name, rendaanual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public double Tax() {
        if (numeroFuncionarios > 10) {
            return getRendaanual() * 0.14;
        } else {
            return getRendaanual() * 0.16;
        }
    }
}
