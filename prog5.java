import java.util.*;
public class prog5 {

    // Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.
    public static void main(String args[]){
    Scanner uti= new Scanner(System.in);
        int j=Integer.parseInt(uti.nextLine());
        int k=Integer.parseInt(uti.nextLine());
       // System.out.println(j + "\n" + k);

        if((j%10)==(k%10)){
            System.out.println("SAME LAST DIGIT");


        }




    }

    
}
