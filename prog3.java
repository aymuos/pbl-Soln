import java.util.*;
class prog3{
    
    //Write a Program to accept two integers as command line arguments and print the sum of the two numbers
    // Scanner class and nextDouble or nextInt is taken as input 

    public static void main(String args[]){
      /*  Scanner scr=new Scanner(System.in) // in is standard input stream
        System.out.println("Enter 1st number");
        long a= scr.nextLong();\
*/
        //idea to convert string to int
        String num1=System.console().readLine();
        
        int number1=Integer.parseInt(num1);
        int number2=Integer.parseInt(System.console().readLine());
        int sum = number1+number2;
        System.out.println("Output is:"+sum);





    }
    
}
