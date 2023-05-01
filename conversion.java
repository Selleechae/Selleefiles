import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("TYPE THE NUMBER OF THE SHAPE TO CALCULATE THE AREA OF \n[1] SQUARE \n[2] CIRCLE: ");
        
int select = input.nextInt();
if (select == 1 ){
        	System.out.println("CHOOSE WHAT TO CALCULATE OF SQUARE \n[1] VOLUME \n[2] AREA: ");
        int choose = input.nextInt();
        if (choose == 1){
         	System.out.println("Enter the Length: ");
         	double s1 = input.nextDouble();
         	System.out.println("Enter the Width: ");
    	     double s2 = input.nextDouble();
    	     System.out.println("Enter the Length: ");
    	     double s3 = input.nextDouble();
    	     double volume = s1*s2*s3;
    	     System.out.println("The volume of your square is: "+ volume );
         }
         else if (choose == 2){
         	System.out.println("Enter the value of the 1st side: ");
         	double s1 = input.nextDouble();
    	     System.out.println("Enter the value of the 2nd side: ");
    	     double s2 = input.nextDouble();
    	     double area = s1*s2;
    	     System.out.println("The area of the square is: " + area);
         }
           else{
           	
           	System.out.println("Wrong input!");
         }
}
else if (select == 2){
   System.out.println("AREA OF THE CIRCLE");
   
   System.out.println("Enter the radius of the circle: ");
   double circle = input.nextDouble();
   double area = 3.141592653*(circle*circle);
   System.out.println("The area of the circle is: "+ area );
}
else{
	System.out.println("Invalid Input!");
	}
	}
}
