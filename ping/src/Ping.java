import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ping {
    public static void main(String[] args) throws IOException {
        ProcessBuilder builder = new ProcessBuilder();
        builder.command("ping www.google.com");
        builder.redirectErrorStream(true);

        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while ((line = r.readLine()) != null)
            System.out.println(line);

    }
}
