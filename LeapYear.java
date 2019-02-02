import java.io.*;
import java.util.*;
class LeapYear{
    public static void main(String args[]) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.print("enter your year to check");
            int year= Integer.parseInt(br.readLine());
    //   if it is century year and divisible by 400 
        if(year%100==0 && year % 400==0)
            System.out.print("Leap Year");
        //if it is not century but divisible by 4
        else if(year%100!=0 && year %4 ==0)
            System.out.print("is a leap year");
        else
            System.out.print("is not leap year");
    
    }
 
    
}
