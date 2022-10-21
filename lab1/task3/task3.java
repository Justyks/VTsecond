package task3;

public class task3 {
    public static void main(String[] args) {
       
        double a = 32.5;
        double h = 5.6;
        double b = 235.65;
        double i = a;
     
        System.out.println("Enter a:");
        System.out.println(a);

        System.out.println("Enter b:");
        System.out.println(b);

        System.out.println("Enter h:");
        System.out.println(h);

        
        while (i <= b){
            System.out.printf("tg(%.4f) = %.4f \n", i, Math.tan(i) );
            i+=h;
        }
    }
}