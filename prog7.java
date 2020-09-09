import java.util.*;
public class prog7 {
    public static void main(String args[]){
        if (args.length==0){
            System.out.println("No command line arguments");
        }else
        
        {
            for(int p=0;p<args.length;p++){
               //String args[p]=System.console().readLine();
                System.out.println(p+"th element"+args[p]);
            }
        }
    }
    
}
