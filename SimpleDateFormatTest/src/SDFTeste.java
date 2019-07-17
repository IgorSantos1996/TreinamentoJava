import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SDFTeste {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String mascara = "Atlanta yyyy.MM.dd G 'as' HH:mm:ss z";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        System.out.println(formatador.format(c.getTime()));

    }
}
