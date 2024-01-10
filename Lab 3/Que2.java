import java.util.*;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for string or 2 for number:");
        int x = sc.nextInt();
            String str = "Radar", reverseStr = "";
            int strLength = str.length();
            int num = 3553, reversedNum = 0, remainder;
            int originalNum = num;
            if (x==1) {
                while (num != 0) {
                remainder = num % 10;
                reversedNum = reversedNum * 10 + remainder;
                num /= 10;
                }
                if (originalNum == reversedNum) {
                System.out.println(originalNum + " is Palindrome.");
                }
                else {
                System.out.println(originalNum + " is not Palindrome.");
                }
            }
            else{          
                for (int i = (strLength - 1); i >=0; --i) {
                  reverseStr = reverseStr + str.charAt(i);
                }
            
                if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
                  System.out.println(str + " is a Palindrome String.");
                }
                else {
                  System.out.println(str + " is not a Palindrome String.");
                }
            }
            }
              
          }
