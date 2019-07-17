import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {
    public static void main(String[] args) throws IOException {
        File diretorio = new File("Folder");
        boolean criado = diretorio.mkdir();
        System.out.println("Diretorio criado!" + criado);
        File arquivo = new File("arquivo.txt");
        boolean newfile = arquivo.createNewFile();
        System.out.println("Arquivo criado " + newfile);
        File arquivoNovoNome = new File(diretorio, "arquivo renomeado.txt");
        boolean renamed = arquivo.renameTo(arquivoNovoNome);
        System.out.println("Renomeado " + renamed);
        File diretorioRenomeado = new File("folder2");
        boolean diretorioRenamed = diretorioRenomeado.renameTo(diretorioRenomeado);
        System.out.println("diretorio renomeado: " + diretorioRenamed);
        buscarArquivo();

    }

    public static void buscarArquivo() {
        File file = new File("src");
        String[] list = file.list();
        for (String arquivo : list) {
            System.out.println(arquivo);
        }
    }
}
