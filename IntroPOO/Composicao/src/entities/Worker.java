package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return this.departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public void AddContract(HourContract contract) {
        contracts.add(contract); // add um contrato na lista
    }

    public void RemoveContract(HourContract contract) {
        contracts.remove(contract);
    }

    public List<HourContract> getContracts() {
        return this.contracts;
    }

    public double Income(int ano, int mes) {
        //baseSalary + o tanto que ela ganhou nos contratos daquele mes
        double soma = this.baseSalary;
        Calendar cal = Calendar.getInstance();
        // para cada contato na minha lista de contatos,
        // vamos testar se o contato é do ano e mês passado como argumento
        for (HourContract c : contracts) {
            cal.setTime(c.getDate()); // pega a data do contrato e define essa data como data do calendario
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            // agora é testar se o ano e mês são iguais ao que informamos
            if (ano == c_year && mes == c_month) {
                soma += c.totalValues();
            }
        }
        return soma;
    }
}
