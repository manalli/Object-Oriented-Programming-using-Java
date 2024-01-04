import java.util.*;
public class Que5 {
    public static void main(String[] args) {
        double f,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit:");
        f = sc.nextInt();
        c = (f-32)*5/9;
        System.out.println("Temperature in Celsius="+c);
    }
}