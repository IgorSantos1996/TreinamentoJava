package Wio;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            boolean newfile = file.createNewFile();
            System.out.println("Permissão de leitura?: " + file.canRead());
            System.out.println("Path: " + file.getPath());
            System.out.println("diretorio: " + file.isDirectory());
            System.out.println("Last modified: " + new Date(file.lastModified()));
            boolean existe = file.exists();
            if (existe) {
                System.out.println("Deletado?: " + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
