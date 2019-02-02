package Exemplo03;

public class Room {
    private String nome;
    private String email;


    public String getNome() {
        return nome;
    }

    public Room(String nome, String email) {
        this.nome = nome;
        this.email = email;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return this.nome + this.email;
    }
}
