import java.util.Scanner;

public class IT24104328Lab5Q2{
  
    public static void main(String[] args){
		
		int number;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the new numbers : "  );
        number = scanner.nextInt();
		
		switch(number){
			
			    case 0:
			System.out.println();
			System.out.print("No prize");
			
			    break;
				
				case 1:
			System.out.println();
            System.out.print("prize is a : pen");

                break;

                case 2:
			System.out.println();
            System.out.print("prize is a : Umbrella");
 
                break;

                case 3:
			System.out.println();
            System.out.print("prize is a : Bag");

                break;

                case 4:
			System.out.println();
            System.out.print("prize is a : Travelling Chair");	

                break;

                default:

            if(number>=5){

            System.out.println();
			System.out.println("prize is a : Headphone") ;}

            else {
        
        System.out.print("input must be a number 0 or greater")	;}

        scanner.close();

    }
    }
}         
        
      


     		
				
			
			
		
		