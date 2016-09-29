
package homework;
import java.util.Scanner;

public class Homework {
/*
    
    */
  
    public static void main(String[] args) {
            
            System.out.println("I want to play a game.\n"
                    + "Guess what number I am thinking of\nthat is between 1 - 10");
       
         Scanner scan = new Scanner(System.in);
            boolean run = false;
            int l = 0, t = 0, g = 0; 
            //l = times played, t = off by 1, g = wins
            
        while(!run){
            int guess = scan.nextInt();        //scans for an input
            int Random = (int)(Math.random()*10 + 1);//generates a random number 
           
            System.out.printf("%s%d\n%s%d\n" , "Your number is: " ,
                    guess, "My number is:   " , Random);
         l++;  
        if (Random == guess && guess < 10)    
            System.out.println("You Win!");              
            
        else if (guess > 10 || guess < 1)
            System.out.println("Your number is way off!");
        
        else if (Random > guess)
            System.out. println("Your number is too small.");
               if (Random - 1 == guess)
                t++; //adds 1 to t if guess is 1 less than the random number
        
        else if (Random < guess)
            System.out. println("Your number is too big." );
               if (Random + 1 == guess)
                t++; //adds 1 to t if guess is 1 higher than the random number
                        
        System.out.println("Would you like to play again? y/n");
            String ans = scan.next();
             if (ans.equalsIgnoreCase("y"))
                 System.out.println("Guess again");
             else{
                  System.out.printf("%s%d%s\n%s%d%s\n%s%d%s\n" , "You played:     " , l , " times" ,
                                    "You were close: " , t , " times" , "You won:        " , g , "times"); 
                    run = true;}
             
        }    
    }
    
}
// Your name please
