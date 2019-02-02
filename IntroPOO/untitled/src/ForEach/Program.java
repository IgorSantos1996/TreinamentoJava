package ForEach;

public class Program {
    public static void main(String[] args) {
        String[] vect = new String[]{"Maria", "Bob", "Alex"};

        for (int i = 0; i < vect.length; i++)
            System.out.println(vect[i]);
        for ( String item: vect)
            System.out.println(item);
    }
}
