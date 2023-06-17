import java.util.*;
public class Leap {
    static int year;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        if(year >= 1582)
        {
           if(( year % 4 ==0) && (year % 100 !=0 || year % 400 ==0 ))
            {
                System.out.println(year+" "+"is leap year:");
            }
            else
            {
                System.out.println(year+" "+ "is not leap year:");
            }
        }
        else {
            System.out.println("Ohh...! Please enter the valid year.");
        }
    }
}

