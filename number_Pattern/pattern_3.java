import java.util.Scanner;

public class pattern_3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        //Taking rows value from the user
 
        System.out.println("How many rows you want in this pattern?");
 
        int rows = sc.nextInt();
 
        System.out.println("Here is your pattern....!!!");
 
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }
 
            System.out.println();
        }
 
        //Close the resources
 
        sc.close();
    }
    
}
