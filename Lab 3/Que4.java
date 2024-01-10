import java.util.*;
public class Que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Enter a Number:");
        int x = sc.nextInt();
        for(int i=2;i<x/2;i++) {
            if (x%i==0) {
                count++;
            }   
        }
        if (count==0) {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
