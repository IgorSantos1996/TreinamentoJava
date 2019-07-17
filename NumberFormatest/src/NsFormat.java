import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NsFormat {
    public static void main(String[] args) {
        float valor = 123.456f;
        Locale locIT = new Locale("it");
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locIT);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(locIT);
        for (NumberFormat i : nfa) {
            System.out.println(valor);
        }
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.getMaximumFractionDigits());
        nf.setMaximumFractionDigits(5);
        System.out.println(nf.format(valor));
        String valorString = "212.456X";
        try {
            System.out.println(nf.parse(valorString));
            nf.setParseIntegerOnly(true);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
