/**
 * Created by User on 14.10.2016.
 */
import java.util.Scanner;
public class discr {


    public static void main (String[] args) {
        double x1 = discrimp(8.0,(-6.0),1.0);
        double x2 = discrimn(8.0,(-6.0),1.0);


        System.out.println(x1);
        System.out.println(x2);

    }
    public static double discrimp (double a, double b, double c) {
        double d = Math.pow(b, 2) - 4*a*c;
        double x = ((-b) + Math.sqrt(d))/2*a;
        return x;
    }
    public static double discrimn (double a, double b, double c) {
        double d = Math.pow(b, 2) - 4*a*c;
        double x = ((-b) - Math.sqrt(d))/2*a;
        return x;
    }

}
