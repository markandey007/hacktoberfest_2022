import java.util.Scanner;
import java.awt.Robot;
import java.io.IOException;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

class TicTacToe
{
	
	public static void clearScreen()throws AWTException {  
      Robot rb = new Robot();
	  rb.keyPress(KeyEvent.VK_C);
	  rb.keyRelease(KeyEvent.VK_C);
	  rb.keyPress(KeyEvent.VK_L);
	  rb.keyRelease(KeyEvent.VK_L);
	  rb.keyPress(KeyEvent.VK_S);
	  rb.keyRelease(KeyEvent.VK_S);
	  rb.keyPress(KeyEvent.VK_ENTER);
	  rb.keyRelease(KeyEvent.VK_ENTER);
}
	
	
	public static void game()
	   {
	   System.out.println("\n************************************************************************************************************************");
       System.out.println("\t\t\t\t\t\t   TicTacToe Game \n ");
	   int Player1score = 0;
	   int Player2score = 0;
	   System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
	   System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
	   String arr[][] = {
		   {"1","2","3"},
		   {"4","5","6"},
		   {"7","8","9"}
		};
		
		
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[0][0]+"\t | \t"+arr[0][1]+"\t | \t"+arr[0][2]);
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[1][0]+"\t | \t"+arr[1][1]+"\t | \t"+arr[1][2]);
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[2][0]+"\t | \t"+arr[2][1]+"\t | \t"+arr[2][2]);
        System.out.println("\t\t\t\t\t\t | \t\t |");
	
    try
    {
	Scanner sc = new Scanner(System.in);
	System.out.println("Player 1 : ");
    int choice = sc.nextInt();
	 //String numberAsString = new Integer(arr[0][0]).toString();
	
	switch(choice)
	{
		case 1: arr[0][0] = "X";
		        break;
				
		case 2: arr[0][1] = "X";
		        break;
				
		case 3: arr[0][2] = "X";
		        break;
				
        case 4: arr[1][0] = "X";
		        break;
				
		case 5: arr[1][1] = "X";
		        break;
				
		case 6: arr[1][2] = "X";
		        break;		
				
		case 7: arr[2][0] = "X";
		        break;
				
		case 8: arr[2][1] = "X";
		        break;
				
		case 9: arr[2][2] = "X";
		        break;
	
		default: System.out.println("Invalid Key Is Pressed");
	}
	
	    System.out.println("\n************************************************************************************************************************");
	    System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
	    System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score); 
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[0][0]+"\t | \t"+arr[0][1]+"\t | \t"+arr[0][2]);
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[1][0]+"\t | \t"+arr[1][1]+"\t | \t"+arr[1][2]);
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[2][0]+"\t | \t"+arr[2][1]+"\t | \t"+arr[2][2]);
        System.out.println("\t\t\t\t\t\t | \t\t |");  
	
	
	System.out.println("Player 2 : ");
	int choice1 = sc.nextInt();
    
	
	 //String numberAsString = new Integer(arr[0][0]).toString();
	
	switch(choice1)
	{
		case 1: arr[0][0] = "O";
		        break;
				
		case 2: arr[0][1] = "O";
		        break;
				
		case 3: arr[0][2] = "O";
		        break;
				
        case 4: arr[1][0] = "O";
		        break;
				
		case 5: arr[1][1] = "O";
		        break;
				
		case 6: arr[1][2] = "O";
		        break;		
				
		case 7: arr[2][0] = "O";
		        break;
				
		case 8: arr[2][1] = "O";
		        break;
				
		case 9: arr[2][2] = "O";
		        break;
	
		default: System.out.println("Invalid Key Is Pressed");
	}	
		
		System.out.println("\n************************************************************************************************************************");
	    System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
   	    System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
        System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[0][0]+"\t | \t"+arr[0][1]+"\t | \t"+arr[0][2]);
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[1][0]+"\t | \t"+arr[1][1]+"\t | \t"+arr[1][2]);
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[2][0]+"\t | \t"+arr[2][1]+"\t | \t"+arr[2][2]);
        System.out.println("\t\t\t\t\t\t | \t\t |");
	
	
	
	System.out.println("Player 1 : ");
	int choice2 = sc.nextInt();
    
	
	 //String numberAsString = new Integer(arr[0][0]).toString();
	
	switch(choice2)
	{
		case 1: arr[0][0] = "X";
		        break;
				
		case 2: arr[0][1] = "X";
		        break;
				
		case 3: arr[0][2] = "X";
		        break;
				
        case 4: arr[1][0] = "X";
		        break;
				
		case 5: arr[1][1] = "X";
		        break;
				
		case 6: arr[1][2] = "X";
		        break;		
				
		case 7: arr[2][0] = "X";
		        break;
				
		case 8: arr[2][1] = "X";
		        break;
				
		case 9: arr[2][2] = "X";
		        break;
	
		default: System.out.println("Invalid Key Is Pressed");
	}	
		
		System.out.println("\n************************************************************************************************************************");
	    System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
	    System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
        System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[0][0]+"\t | \t"+arr[0][1]+"\t | \t"+arr[0][2]);
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[1][0]+"\t | \t"+arr[1][1]+"\t | \t"+arr[1][2]);
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[2][0]+"\t | \t"+arr[2][1]+"\t | \t"+arr[2][2]);
        System.out.println("\t\t\t\t\t\t | \t\t |");
	
	
	
	
	
	System.out.println("Player 2 : ");
	int choice3 = sc.nextInt();
    
	
	 //String numberAsString = new Integer(arr[0][0]).toString();
	
	switch(choice3)
	{
		case 1: arr[0][0] = "O";
		        break;
				
		case 2: arr[0][1] = "O";
		        break;
				
		case 3: arr[0][2] = "O";
		        break;
				
        case 4: arr[1][0] = "O";
		        break;
				
		case 5: arr[1][1] = "O";
		        break;
				
		case 6: arr[1][2] = "O";
		        break;		
				
		case 7: arr[2][0] = "O";
		        break;
				
		case 8: arr[2][1] = "O";
		        break;
				
		case 9: arr[2][2] = "O";
		        break;
	
		default: System.out.println("Invalid Key Is Pressed");
	}	
		
		System.out.println("\n************************************************************************************************************************");
	    System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
     	System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
        System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[0][0]+"\t | \t"+arr[0][1]+"\t | \t"+arr[0][2]);
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[1][0]+"\t | \t"+arr[1][1]+"\t | \t"+arr[1][2]);
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[2][0]+"\t | \t"+arr[2][1]+"\t | \t"+arr[2][2]);
        System.out.println("\t\t\t\t\t\t | \t\t |");
	
	
	
	
	
	
	System.out.println("Player 1 : ");
	int choice5 = sc.nextInt();
    
	
	 //String numberAsString = new Integer(arr[0][0]).toString();
	
	switch(choice5)
	{
		case 1: arr[0][0] = "X";
		        break;
				
		case 2: arr[0][1] = "X";
		        break;
				
		case 3: arr[0][2] = "X";
		        break;
				
        case 4: arr[1][0] = "X";
		        break;
				
		case 5: arr[1][1] = "X";
		        break;
				
		case 6: arr[1][2] = "X";
		        break;		
				
		case 7: arr[2][0] = "X";
		        break;
				
		case 8: arr[2][1] = "X";
		        break;
				
		case 9: arr[2][2] = "X";
		        break;
	
		default: System.out.println("Invalid Key Is Pressed");
	}	
		
		System.out.println("\n************************************************************************************************************************");
	    System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
	    System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
        System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[0][0]+"\t | \t"+arr[0][1]+"\t | \t"+arr[0][2]);
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[1][0]+"\t | \t"+arr[1][1]+"\t | \t"+arr[1][2]);
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[2][0]+"\t | \t"+arr[2][1]+"\t | \t"+arr[2][2]);
        System.out.println("\t\t\t\t\t\t | \t\t |");
	
	
/*	
		
	if(arr[0][0] == "X" || arr[0][1] == "X" || arr[0][2] == "X")
	{
		if(arr[1][0] == "X" || arr[1][1] == "X" || arr[1][2] == "X")
		{
			if(arr[2][0] == "X" || arr[2][1] == "X" || arr[2][2] == "X")
			{
				if(arr[0][0] == "X" || arr[1][0] == "X" || arr[2][0] == "X")
				{
				
                   if(arr[0][1] == "X" || arr[1][1] == "X" || arr[2][1] == "X")
				{
				
                    if(arr[0][2] == "X" || arr[1][2] == "X" || arr[2][2] == "X")
				{
					
				       if(arr[0][0] == "X" || arr[1][1] == "X" || arr[2][2] == "X")
				{
				
                         if(arr[0][2] == "X" || arr[1][1] == "X" || arr[2][0] == "X")
				{
					         score += score;
				             System.out.println("Player 1 is Won The Match");
							 System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+score);
					
					
				}
				
				}
				
				}
				
				}
				
				}
			}
		}
	}
	*/
	
	
	if(arr[0][0] == "X" && arr[0][1] == "X" && arr[0][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][0] == "O" && arr[0][1] == "O" && arr[0][2] == "O")
	{
		
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);

		
	}else if(arr[1][0] == "X" && arr[1][1] == "X" && arr[1][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[1][0] == "O" && arr[1][1] == "O" && arr[1][2] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[2][0] == "X" && arr[2][1] == "X" && arr[2][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[2][0] == "O" && arr[2][1] == "O" && arr[2][2] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][0] == "X" && arr[1][0] == "X" && arr[2][0] == "X")
	{
	    Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	
	}else if(arr[0][0] == "O" && arr[1][0] == "O" && arr[2][0] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[0][1] == "X" && arr[1][1] == "X" && arr[2][1] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[0][1] == "O" && arr[1][1] == "O" && arr[2][1] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][2] == "X" && arr[1][2] == "X" && arr[2][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][2] == "O" && arr[1][2] == "O" && arr[2][2] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][0] == "X" && arr[1][1] == "X" && arr[2][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][0] == "O" && arr[1][1] == "O" && arr[2][2] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[0][2] == "X" && arr[1][1] == "X" && arr[2][0] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[0][2] == "O" && arr[1][1] == "O" && arr[2][0] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else
	{
		
	}
	
	
	
		System.out.println("Player 2 : ");
	int choice6 = sc.nextInt();
    
	
	 //String numberAsString = new Integer(arr[0][0]).toString();
	
	switch(choice6)
	{
		case 1: arr[0][0] = "O";
		        break;
				
		case 2: arr[0][1] = "O";
		        break;
				
		case 3: arr[0][2] = "O";
		        break;
				
        case 4: arr[1][0] = "O";
		        break;
				
		case 5: arr[1][1] = "O";
		        break;
				
		case 6: arr[1][2] = "O";
		        break;		
				
		case 7: arr[2][0] = "O";
		        break;
				
		case 8: arr[2][1] = "O";
		        break;
				
		case 9: arr[2][2] = "O";
		        break;
	
		default: System.out.println("Invalid Key Is Pressed");
	}	
		
		System.out.println("\n************************************************************************************************************************");
	    System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
     	System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
        System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[0][0]+"\t | \t"+arr[0][1]+"\t | \t"+arr[0][2]);
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[1][0]+"\t | \t"+arr[1][1]+"\t | \t"+arr[1][2]);
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[2][0]+"\t | \t"+arr[2][1]+"\t | \t"+arr[2][2]);
        System.out.println("\t\t\t\t\t\t | \t\t |");
	

	if(arr[0][0] == "X" && arr[0][1] == "X" && arr[0][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][0] == "O" && arr[0][1] == "O" && arr[0][2] == "O")
	{
		
		Player2score += 1;
		System.out.println("Player Two has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);

		
	}else if(arr[1][0] == "X" && arr[1][1] == "X" && arr[1][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[1][0] == "O" && arr[1][1] == "O" && arr[1][2] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[2][0] == "X" && arr[2][1] == "X" && arr[2][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[2][0] == "O" && arr[2][1] == "O" && arr[2][2] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][0] == "X" && arr[1][0] == "X" && arr[2][0] == "X")
	{
	    Player1score += 1;
		System.out.println("Player one has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	
	}else if(arr[0][0] == "O" && arr[1][0] == "O" && arr[2][0] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[0][1] == "X" && arr[1][1] == "X" && arr[2][1] == "X")
	{
		Player1score += 1;
		System.out.println("Player one has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[0][1] == "O" && arr[1][1] == "O" && arr[2][1] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][2] == "X" && arr[1][2] == "X" && arr[2][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][2] == "O" && arr[1][2] == "O" && arr[2][2] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][0] == "X" && arr[1][1] == "X" && arr[2][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][0] == "O" && arr[1][1] == "O" && arr[2][2] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[0][2] == "X" && arr[1][1] == "X" && arr[2][0] == "X")
	{
		Player1score += 1;
		System.out.println("Player one has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[0][2] == "O" && arr[1][1] == "O" && arr[2][0] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else
	{
		
	}
	
	
		System.out.println("Player 1 : ");
	int choice7 = sc.nextInt();
    
	
	 //String numberAsString = new Integer(arr[0][0]).toString();
	
	switch(choice7)
	{
		case 1: arr[0][0] = "X";
		        break;
				
		case 2: arr[0][1] = "X";
		        break;
				
		case 3: arr[0][2] = "X";
		        break;
				
        case 4: arr[1][0] = "X";
		        break;
				
		case 5: arr[1][1] = "X";
		        break;
				
		case 6: arr[1][2] = "X";
		        break;		
				
		case 7: arr[2][0] = "X";
		        break;
				
		case 8: arr[2][1] = "X";
		        break;
				
		case 9: arr[2][2] = "X";
		        break;
	
		default: System.out.println("Invalid Key Is Pressed");
	}	
		
		System.out.println("\n************************************************************************************************************************");
	    System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
     	System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
        System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[0][0]+"\t | \t"+arr[0][1]+"\t | \t"+arr[0][2]);
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[1][0]+"\t | \t"+arr[1][1]+"\t | \t"+arr[1][2]);
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[2][0]+"\t | \t"+arr[2][1]+"\t | \t"+arr[2][2]);
        System.out.println("\t\t\t\t\t\t | \t\t |");
	

	if(arr[0][0] == "X" && arr[0][1] == "X" && arr[0][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][0] == "O" && arr[0][1] == "O" && arr[0][2] == "O")
	{
		
		Player2score += 1;
		System.out.println("Player Two has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);

		
	}else if(arr[1][0] == "X" && arr[1][1] == "X" && arr[1][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[1][0] == "O" && arr[1][1] == "O" && arr[1][2] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[2][0] == "X" && arr[2][1] == "X" && arr[2][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[2][0] == "O" && arr[2][1] == "O" && arr[2][2] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][0] == "X" && arr[1][0] == "X" && arr[2][0] == "X")
	{
	    Player1score += 1;
		System.out.println("Player one has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	
	}else if(arr[0][0] == "O" && arr[1][0] == "O" && arr[2][0] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[0][1] == "X" && arr[1][1] == "X" && arr[2][1] == "X")
	{
		Player1score += 1;
		System.out.println("Player one has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[0][1] == "O" && arr[1][1] == "O" && arr[2][1] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][2] == "X" && arr[1][2] == "X" && arr[2][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][2] == "O" && arr[1][2] == "O" && arr[2][2] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][0] == "X" && arr[1][1] == "X" && arr[2][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][0] == "O" && arr[1][1] == "O" && arr[2][2] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[0][2] == "X" && arr[1][1] == "X" && arr[2][0] == "X")
	{
		Player1score += 1;
		System.out.println("Player one has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[0][2] == "O" && arr[1][1] == "O" && arr[2][0] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two has won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else
	{
		
	}
	
	
	
		System.out.println("Player 2 : ");
	int choice8 = sc.nextInt();
    
	
	 //String numberAsString = new Integer(arr[0][0]).toString();
	
	switch(choice8)
	{
		case 1: arr[0][0] = "O";
		        break;
				
		case 2: arr[0][1] = "O";
		        break;
				
		case 3: arr[0][2] = "O";
		        break;
				
        case 4: arr[1][0] = "O";
		        break;
				
		case 5: arr[1][1] = "O";
		        break;
				
		case 6: arr[1][2] = "O";
		        break;		
				
		case 7: arr[2][0] = "O";
		        break;
				
		case 8: arr[2][1] = "O";
		        break;
				
		case 9: arr[2][2] = "O";
		        break;
	
		default: System.out.println("Invalid Key Is Pressed");
	}	
		
		System.out.println("\n************************************************************************************************************************");
	    System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
     	System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
        System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[0][0]+"\t | \t"+arr[0][1]+"\t | \t"+arr[0][2]);
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[1][0]+"\t | \t"+arr[1][1]+"\t | \t"+arr[1][2]);
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[2][0]+"\t | \t"+arr[2][1]+"\t | \t"+arr[2][2]);
        System.out.println("\t\t\t\t\t\t | \t\t |");
	

	if(arr[0][0] == "X" && arr[0][1] == "X" && arr[0][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][0] == "O" && arr[0][1] == "O" && arr[0][2] == "O")
	{
		
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);

		
	}else if(arr[1][0] == "X" && arr[1][1] == "X" && arr[1][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[1][0] == "O" && arr[1][1] == "O" && arr[1][2] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[2][0] == "X" && arr[2][1] == "X" && arr[2][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[2][0] == "O" && arr[2][1] == "O" && arr[2][2] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][0] == "X" && arr[1][0] == "X" && arr[2][0] == "X")
	{
	    Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	
	}else if(arr[0][0] == "O" && arr[1][0] == "O" && arr[2][0] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[0][1] == "X" && arr[1][1] == "X" && arr[2][1] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[0][1] == "O" && arr[1][1] == "O" && arr[2][1] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][2] == "X" && arr[1][2] == "X" && arr[2][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][2] == "O" && arr[1][2] == "O" && arr[2][2] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][0] == "X" && arr[1][1] == "X" && arr[2][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][0] == "O" && arr[1][1] == "O" && arr[2][2] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[0][2] == "X" && arr[1][1] == "X" && arr[2][0] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[0][2] == "O" && arr[1][1] == "O" && arr[2][0] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else
	{
		
	}
	
	
	
		System.out.println("Player 1 : ");
	int choice9 = sc.nextInt();
    
	
	 //String numberAsString = new Integer(arr[0][0]).toString();
	
	switch(choice9)
	{
		case 1: arr[0][0] = "X";
		        break;
				
		case 2: arr[0][1] = "X";
		        break;
				
		case 3: arr[0][2] = "X";
		        break;
				
        case 4: arr[1][0] = "X";
		        break;
				
		case 5: arr[1][1] = "X";
		        break;
				
		case 6: arr[1][2] = "X";
		        break;		
				
		case 7: arr[2][0] = "X";
		        break;
				
		case 8: arr[2][1] = "X";
		        break;
				
		case 9: arr[2][2] = "X";
		        break;
	
		default: System.out.println("Invalid Key Is Pressed");
	}	
		
		System.out.println("\n************************************************************************************************************************");
	    System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
     	System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
        System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[0][0]+"\t | \t"+arr[0][1]+"\t | \t"+arr[0][2]);
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[1][0]+"\t | \t"+arr[1][1]+"\t | \t"+arr[1][2]);
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t | \t\t |");
		System.out.println("\t\t\t\t\t"+arr[2][0]+"\t | \t"+arr[2][1]+"\t | \t"+arr[2][2]);
        System.out.println("\t\t\t\t\t\t | \t\t |");
	

	if(arr[0][0] == "X" && arr[0][1] == "X" && arr[0][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][0] == "O" && arr[0][1] == "O" && arr[0][2] == "O")
	{
		
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);

		
	}else if(arr[1][0] == "X" && arr[1][1] == "X" && arr[1][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[1][0] == "O" && arr[1][1] == "O" && arr[1][2] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[2][0] == "X" && arr[2][1] == "X" && arr[2][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[2][0] == "O" && arr[2][1] == "O" && arr[2][2] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][0] == "X" && arr[1][0] == "X" && arr[2][0] == "X")
	{
	    Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	
	}else if(arr[0][0] == "O" && arr[1][0] == "O" && arr[2][0] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[0][1] == "X" && arr[1][1] == "X" && arr[2][1] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[0][1] == "O" && arr[1][1] == "O" && arr[2][1] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][2] == "X" && arr[1][2] == "X" && arr[2][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][2] == "O" && arr[1][2] == "O" && arr[2][2] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][0] == "X" && arr[1][1] == "X" && arr[2][2] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
		
	}else if(arr[0][0] == "O" && arr[1][1] == "O" && arr[2][2] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[0][2] == "X" && arr[1][1] == "X" && arr[2][0] == "X")
	{
		Player1score += 1;
		System.out.println("Player one is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else if(arr[0][2] == "O" && arr[1][1] == "O" && arr[2][0] == "O")
	{
		Player2score += 1;
		System.out.println("Player Two is won");
		System.out.println("\t Player 1 = X \t\t\t\t\t\t\t\t\t\t Player 1 Score = "+Player1score);
		System.out.println("\t Player 2 = O \t\t\t\t\t\t\t\t\t\t Player 2 Score = "+Player2score);
		System.exit(0);
	}else
	{
		/*System.out.println("Do You Want To Continue Then Press Y If No The Press Any Key");
		String yes = sc.next();
		if(yes == "Y" || yes == "y")
		{
			game();
		}*/			
	}
	
	
   }
	catch( Exception e)
	{
		System.out.println("Wrong Input Entered");
	}
	
	
	
	}
   public static void main(String args[]) throws IOException, InterruptedException, AWTException, IllegalMonitorStateException
   {   
	Scanner sc = new Scanner(System.in);
	TicTacToe ge = null;
	ge.game();
	//ge.clearScreen();

	System.out.println("Do You Want To Continue Then Press Y If No The Press Any Key");
	char yes = sc.next().charAt(0);
	if(yes == 'Y' || yes == 'y')
	{
		 //TimeUnit.SECONDS.wait(10);
		//ge.clearScreen();
		//Thread.sleep(4000);
		ge.game();
		
		
    }
	else
	{
		ge.clearScreen();
	}
	
	
	
   }
}
