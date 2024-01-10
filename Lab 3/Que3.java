import java.util.*;
public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a = sc.nextInt();
        System.out.println("Enter number 2:");
        int b = sc.nextInt();
        System.out.println("Enter number 3:");
        int c = sc.nextInt();
        if(a==b && b==c){
            System.out.println("a=b=c");
        }
        else{
        if (a>b) {
            if (a>c) {
                System.out.println("Maximum="+a);
            }
            else if(a==c){
                System.out.println("a=c");
            }
            else{
                System.out.println("Maximum="+c);
            }
        }
        else if(a==b){
                System.out.println("a=b");
        }
        else{
            if (b>c) {
                System.out.println("Maximum="+b);
            }
            else if(b==c){
                System.out.println("b=c");
            }
            else{
                System.out.println("Maximum="+c);
            }
        }
    }
    }
}
