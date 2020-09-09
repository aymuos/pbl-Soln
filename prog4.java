import java.util.*;
public class prog4 {
    //prog to check if a number is positive, negetive or zero
    public static void main(String args[]){
        System.out.println("Enter new number");
        Scanner myObj=new Scanner(System.in);
        String number=myObj.nextLine();
        int n=Integer.parseInt(number);

        if (n > 0){
            System.out.println("Positive");
        } else if (n <0 ){
            System.out.println("Negative");

        } else if (n == 0 ){
            System.out.println("Zero");
        }




    }
    
}
