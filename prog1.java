import java.util.Scanner;
 class prog1{
 	public static void main(String args[]){
 		/*  Write a Program that accepts two Strings as command line arguments and generate the output in the required format. 

Example1)
If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangalore.

 */

 		/* new scanner class
 		Scanner in= new Scanner(System.in);

 		String s=in.nextline();
 		use this to create new value in string

 		*/
 		/*2nd way is by using a console class 

 		String name= System.console().readLine();
 		System.out.println("name");
 		*/

 		//System.out.println(args[0] +"\t"+ "Technologies"+"\t"+ args[1]);

 		 String name1=System.console().readLine();
 		 String name2= System.console().readLine();
 		 System.out.println(name1 + " Technologies "+name2);

 		 //Difference between the 2 is that they wait for the user to input values before providing the output


 	}
 }