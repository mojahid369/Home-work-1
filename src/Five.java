import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter arm = ");
        int arm =sc.nextInt();
        double area =(Math.sqrt(3)/4)* Math.pow(arm,2);
        System.out.println("Area of equilateral triangle = "+ area);
        sc.close();

    }
}
