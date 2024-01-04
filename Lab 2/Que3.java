import java.util.*;
public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,ans;
        System.out.println("Enter Operator:");
        String s = sc.nextLine();
        System.out.println("Enter a:");
        a = sc.nextInt();
        System.out.println("Enter b:");
        b = sc.nextInt();
        switch (s) {
            case "+":
                ans=a+b;
                System.out.println(ans);
                break;
            case "-":
                ans=a-b;
                System.out.println(ans);
            case "*":
                ans=a*b;
                System.out.println(ans);
            case "/":
                ans=a/b;
                System.out.println(ans);
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
