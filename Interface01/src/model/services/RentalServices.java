package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalServices {
    private Double pricePerHour;
    private Double pricePerDay;
    private TaxService taxServices;


    public RentalServices(Double pricePerHour, Double pricePerDay,TaxService taxServices) {
        super();
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxServices = taxServices;
    }

    public void processInvoice(CarRental carRental) {
        long t1 = carRental.getStart().getTime(); // pega o valor em milisegundos da minha data
        long t2 = carRental.getFinish().getTime();
        double hours = (t2 - t1) / 1000 / 60 / 60;
        double basicPayment;
        //divide por 1000 para transformar em segundos, depois divide por 60 para converter para minutos
        //e divide por 60 para converter para horas
        if (hours <= 12.0) {
            // calcula preço basico em horas
            basicPayment = (double) Math.ceil(hours) * pricePerHour;
        } else {
            // calcular o preco basico em dias
            basicPayment = (double) Math.ceil(hours / 24) * pricePerDay;
        }
        // para calcular o imposto vamos usar o taxService
        // a linha abaixo calcula o valor do imposto a pagar a partir do pagamento básico
        double tax = taxServices.tax(basicPayment);
        // um novo objeto nota de pagamento e estamos associando ele ao aluguel
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
