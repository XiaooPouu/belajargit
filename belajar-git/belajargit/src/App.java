import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Masukan Nama : ");
    String name = scanner.next();

    System.out.print("Hola " + name + "Selamat Datang!");
    System.out.println("Apa Kabar?");
    }
}
