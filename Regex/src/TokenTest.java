public class TokenTest {
    public static void main(String[] args) {
        String nomes = "Wiliian, Paulo, Joana, Camila,  Ana, Jhon, Matheus ";
        String[] tokens = nomes.split(",");
        for (String r : tokens) {
            System.out.println(r.trim());
        }
    }
}
