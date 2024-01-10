import java.util.*;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total marks:");
        int total = sc.nextInt();
        System.out.println("Enter Marks in Subject 1");
        double m1 = sc.nextInt();
        System.out.println("Enter Marks in Subject 2");
        double m2 = sc.nextInt();
        System.out.println("Enter Marks in Subject 3");
        double m3 = sc.nextInt();
        System.out.println("Enter Marks in Subject 4");
        double m4 = sc.nextInt();
        System.out.println("Enter Marks in Subject 5");
        double m5 = sc.nextInt();
        double per = ((m1+m2+m3+m4+m5)/(5*total))*100;
        if (per>=60) {
            System.out.println("First Division");
        } 
        else if (per>50 && per<59){
            System.out.println("Second Division");
        }
        else if (per>40 && per<49){
            System.out.println("Third Division");
        }
        else{
            System.out.println("Fail");
        }
        
    }
}
