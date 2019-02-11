package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> votos = new LinkedHashMap<>();
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine(); // lê uma linha do arquivo
            while (line != null) { // enquanto não cheguei no fim do arquivo
                String[] fields = line.split(","); // pegar um campo do arquivo
                String name = fields[0]; // name vai para a primeira posição
                int count = Integer.parseInt(fields[1]); // count vai para a segunda posição
                if (votos.containsKey(name)) { // se o meu map contém essa chave
                    int voto_ate_momento = votos.get(name);
                    votos.put(name, count + voto_ate_momento);
                } else {
                    votos.put(name, count);
                }

                line = br.readLine();
            }

            for (String key : votos.keySet()) {
                System.out.println(key + ": " + votos.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


        sc.close();
    }
}