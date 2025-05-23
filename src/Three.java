import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        final double pi=3.1416;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter radius = ");
        int radius=sc.nextInt();
        double area= pi * Math.pow(radius,2);
        System.out.println("Area of a circle = " +area);
        sc.close();

    }
}
