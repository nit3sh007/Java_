import java.io.*;
class BioData{
    
    public static void main(String args[]) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("enter employee id");
            int id = Integer.parseInt(br.readLine());
        
        System.out.print("enter your name");
            String name= br.readLine();
        
        System.out.print("enter your salary");
            float sal= Float.parseFloat(br.readLine());
          
        System.out.print("enter gender(n/f)");
            char Gen=br.readLine().charAt(0);
 
                System.out.println("id"+":"+id);
        
                System.out.println("gender"+":"+Gen);
        
                System.out.println("name"+":"+name);
        
                System.out.println("sal"+":"+sal);
        
    }
    
}