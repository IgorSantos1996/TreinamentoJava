package aplication;

public class Product {
    private String name;
    private double price;
    private double quantity;

    public Product() {

    }

    public Product(String nome, double preco, double quantidade) {
        this.name = nome;
        this.price = preco;
        this.quantity = quantidade;
    }

    public Product(String nome, double preco) {
        this.name = nome;
        this.price = preco;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double preco) {
        this.price = preco;
    }

    public double getPrice() {
        return this.price;
    }

    public double getQuantity() {
        return this.quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}