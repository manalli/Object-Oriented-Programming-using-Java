import java.util.*;
public class Que1 {
    public static void main(String[] args) {
        int cl1,cl2,cl3;
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        a = sc.nextInt();
        System.out.println("Enter b:");
        b = sc.nextInt();
        c=a+b;
        cl1=Integer.parseInt(args[0]);
        cl2=Integer.parseInt(args[1]);
        cl3=cl1+cl2;
        System.out.println("Sum using scan = "+c); 
        System.out.println("Sum using command line = "+cl3);
    }
}
