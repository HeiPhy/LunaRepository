/**
 * Created by Samir on 12.06.14.
 */
import java.util.Scanner;
public class MyScanner {


        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Servus zum Testprogramm!");
            System.out.println("Bitte geben Sie Ihren Vorname ein:");
            String vorname = s.nextLine();
            System.out.println("Bitte geben Sie Ihren Nachname ein:");
 
      
            s.close();
        }



}
