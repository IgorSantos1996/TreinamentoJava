import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {
        File file = new File("arquivo.txt");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter br = new BufferedWriter(fw);
            br.write("Escrevendo uma mensagem no arquivo\nE pulando uma linha 3 ");
            br.newLine();
            br.write("E pulando uma linha 3");
            br.flush();
            br.close();


            FileReader fr = new FileReader(file);
            BufferedReader br1 = new BufferedReader(fr);
            String s = null;
            while ((s = br1.readLine()) != null) {
                System.out.println(s);
            }
            br1.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
