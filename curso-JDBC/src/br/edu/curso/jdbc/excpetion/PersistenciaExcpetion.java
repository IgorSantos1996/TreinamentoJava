package br.edu.curso.jdbc.excpetion;

public class PersistenciaExcpetion extends Exception {
    private static final long serilVersionUID = -8796457926599751430L;


    public PersistenciaExcpetion(String mensagem, Exception e) {
        super(mensagem, e);
    }

    public PersistenciaExcpetion(String msg) {
        super(msg);
    }
}
