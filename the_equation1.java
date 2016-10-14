/**
 * Created by User on 14.10.2016.
 */
import java.util.Scanner;
public class the_equation1 {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        float x = equation(a, b);
        System.out.println("Решение уравнения такого Х равен" + x);

    }

    public static float equation(float a, float b){

    float x = (-b)/a;
    return x;

    }
}
