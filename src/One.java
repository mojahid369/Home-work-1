import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base and height :");
        int base=sc.nextInt();
        int height=sc.nextInt();
        double area= 0.5 * base *height;
        System.out.println("Area of triangle = " +area);
        sc.close();
    }
}
