import java.util.Scanner;

public class Twe {
    public static void main(String[] args) {
        final double pi=3.1416;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter radius = ");
        int radius=sc.nextInt();
        double volume = (4.0 / 3) * pi * Math.pow(radius, 3);
        System.out.println("volume of a ball = "+volume);
        sc.close();
    }
}
