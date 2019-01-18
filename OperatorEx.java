import java.util.*;
import java.util.Scanner;

class OperatorEx {
    
    
    public static void main(String args[]){
    //Taking value in  a variable 
    /*    String a,b;
        
        a  ="NItesh"; 
        b  ="Kumar";     
        
        System.out.print("My Name is " +a +" "+ b);  */
      //using imput as a string   
    /*    String  a;
        
        Scanner scan = new Scanner(System.in);
            
        System.out.print("enter your String ");
         a =scan.nextLine();
        
        System.out.print("Output is "+" "+ a);
            */
        //taking input ad a decimal
       /*
        float a,b;
          a = 2.0f;
          b = 2.0f;
        
        System.out.print("double value is"+ a +b ); 
        */
        //type conversion
      /*  double z=90.0;
        int x= (int)z;
        System.out.print("float no"+"  " +x);
    */    
        //increment operator
    /*   int a = 15,c;
          c =  ++a + ++a + ++a;
        
        System.out.print(c+"\n"); */
        
       /* int a = 10,c;
        c= a++ + a++ + a++ ;
        System.out.print(c);
        */
    // note: In pre(++x) increment fist increse value than put value
    // note: In post(x++) increment first use given value and then increase the value     
        int a = 4, x;
        x = ++a + a++ + ++a + ++a;
        System.out.print(x);
        
        
        
        
        
        
        
        
    }
    
}
