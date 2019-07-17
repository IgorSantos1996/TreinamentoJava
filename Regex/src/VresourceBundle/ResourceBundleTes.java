package VresourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTes {
    public static void main(String[] args) {
        //System.out.println(Locale.getDefault());
        ResourceBundle rb = ResourceBundle.getBundle("Messages", new Locale("pt", "BR"));
        System.out.println(rb.getString("show"));
        System.out.println(rb.getString("good.morning"));

    }
}
