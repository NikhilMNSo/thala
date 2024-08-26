/**
 * thala
 */
import java.util.Scanner;

public class thala {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");

        String msd = scanner.nextLine();


        scanner.close();
        if (msd.length() == 7) 
        {
            for(int i = 0; i<msd.length(); i++)
            {
                System.out.print(msd.charAt(i));
                if(i<msd.length() - 1)
                {
                    System.out.print("+");
                    
                }
                 
               
            }
             System.out.print("="+msd.length()+" Thala for a reason");
           
        }
        else
        {
            for(int i = 0; i<msd.length(); i++)
            {
                System.out.print(msd.charAt(i));
                if(i<msd.length() - 1)
                {
                    System.out.print("+");
                    
                }
                
            }
            System.out.print("="+msd.length()+" Thala for No reason");
        }
            

}
}
