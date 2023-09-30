

// Scan 3 lines and print them in reverse sequence 
// 1. Int
// 2. Double
// 3. String

// If you use the nextLine() method immediately following the nextInt() method, 
// recall that nextInt() reads integer tokens; because of this, the last newline
// character for that line of integer input is still queued in the input buffer 
// and the next nextLine() will be reading the remainder of the integer line 
(which is empty).
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        // Write your code here.
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}







// INPUT: STRIN MAX LENGTH = 15, INT = 3
// java 100
// cpp 65
// python 50


// OUTPUT STRING 15 JUSTIFY
// ================================
// java           100 
// cpp            065 
// python         050 
// ================================
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                // System.out.printf(s1);
                System.out.printf("%-14s %03d %n", s1, x);
                // System.out.printf("%-15s%03d %n", s1, x);
                
            }
            System.out.println("================================");

    }
}
