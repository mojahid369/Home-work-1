import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter temperature in celsius = ");
        int celsius=sc.nextInt();
        double Fahrenheit=(9.0/5)*celsius+32;
        System.out.println("Fehrenheit temperature is = "+Fahrenheit);
        sc.close();

    }
}
