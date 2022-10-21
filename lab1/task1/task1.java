package task1;

public class task1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 12;
        System.out.println("Enter x:");
        System.out.println(x);
        System.out.println("Enter y:");
        System.out.println(y);
        System.out.println("Result: " + ((1 + Math.pow(2, Math.sin(x+y)))/(2 + Math.abs(x - (2*x)/(1 + x*x*y*y))) + x));
    }
}