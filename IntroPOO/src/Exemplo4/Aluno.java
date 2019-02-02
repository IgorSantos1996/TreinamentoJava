package Exemplo4;

public class Aluno {
    public String nome;
    public double grade;
    public double grade2;
    public double grade3;

    public double FinalGrade() {
        return grade + grade2 + grade3;
    }

    public double MissingPoints() {
        if (FinalGrade() > 6.0) {
            return 60.0 - FinalGrade();
        } else {
            return 0.0;
        }
    }
}
