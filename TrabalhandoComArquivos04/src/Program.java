import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for (File item : folders)
            System.out.println(folders);
        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");
        for (File item : files)
            System.out.println(item);
        boolean sucess = new File(strPath + "\\subdir").mkdir();
        sc.close();
    }
}
