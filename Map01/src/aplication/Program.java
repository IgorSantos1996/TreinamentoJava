package aplication;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String, String> Cookies = new TreeMap<>();
        // o TreeMap ordena pela chave

        //chave valor
        Cookies.put("username", "Maria");
        Cookies.put("email", "maria@gmail.com");
        Cookies.put("phone", "999729712");

        System.out.println("Contains 'phone' key: " + Cookies.containsKey("phone"));
        System.out.println("Phone number: " + Cookies.get("phone"));
        System.out.println("Email: " + Cookies.get("email"));

        Cookies.remove("email"); // removendo do meu map aquela entrada cuja chave é o e-mail
        Cookies.put("phone", "999718888");
        System.out.println("ALL COOKIES: ");
        for (String key : Cookies.keySet()) {
            System.out.println(key + " : " + Cookies.get(key));

        }
    }
}
