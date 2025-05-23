import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter sides a, b, and c: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float s=(a+b+c)/2;
        double area =Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of a triangle = "+ area);
        sc.close();

    }
}
