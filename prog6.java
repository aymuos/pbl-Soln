import java.util.*;
public class prog6 {
    //odd or even program

    public static void main(String args[]){
        Scanner scr= new Scanner(System.in);
        int num= scr.nextInt();
        String strOutput=(num%2 == 0)? "even" : "odd" ;

        //int num=Integer.parseInt(scr.nextLine());
       // int p=(num % 2);
        //int q= 0;
        
        //p = q ? System.out.println("Even"):System.out.println("Odd");
        System.out.println("Number is : "+ strOutput);
        scr.close();

    

    }
    
}
