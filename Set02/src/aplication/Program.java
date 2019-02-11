package aplication;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> set = new HashSet<>();
            String line = br.readLine(); // lê uma linha do arquivo
            while (line != null) {
                String[] fields = line.split(" "); // pegar o campo separado por virgula
                String username = fields[0]; // pega o campo nome no arquivo
                Date moment = Date.from(Instant.parse(fields[1])); // pega o (instante) data do arquivo

                set.add(new LogEntry(username, moment)); // add ao conjunto set, um novo logEntry
                line = br.readLine(); // lê mais uma linha do arquivo
            }
            System.out.println("Total users: " + set.size());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
