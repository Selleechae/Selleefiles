import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LocalTime time = LocalTime.now();
		LocalDate date = LocalDate.now();
		
		int giant = 165;
		int venti = 125;
		int grande = 105;
		int oreo = 20;
		int cheesecake = 20;
		int creamcheese = 25;
		int creampuff = 25;
		int per1 = 25;
		int per2 = 50;
		int per3 = 75;
		int per4 = 100;
		
        System.out.println("===========================================================");
		System.out.println("\n                     ------------IKIGAI MILKTEA♨︎------------   " + 
		                   "                        Japan' s Premium Milk Tea ");
		System.out.println("\n===========================================================");
		
		System.out.println("  \n☘︎FLAVORS☘︎    ");
		
		System.out.println("      ---CHOCOLATE HOTFUDGE            ---MATCHA");
		System.out.println("      ---DARK CHOCOLATE                 ---RED VELVET");
		System.out.println("      ---COOKIES N' CREAM   ");
		
		System.out.println("\nSIZES: \n         GIANT             " +
		                   "   VENTI                 "+
		    "GRANDE          Php 165          " +      
		                   "      Php 125               Php 105");
		                   
		 System.out.println("\nADD ONS:\n         Creampuff          " + 
		                    "   Php 25\n         Creamcheese          " +
		                     " Php 25\n         Cheesecake             Php 20");
		System.out.println("\n___________________________________________________________");
		
	    
		System.out.println("\nWhat flavor would you like to buy?");
		int flavor = input.nextInt();
		
		int i = 0;
		int price = 0;
		int total = 0;
		int qty = 0;
		int sum = 0;
		int size,add,percent,cash,quant,quanty,change,another,add_size;
		char choose,sugar,addition,add_flavor;
		switch (flavor){
			case 1: //CHOCOLATE HOTFUDGE
			
		    System.out.println("CHOCOLATE HOTFUDGE");
		    System.out.println("What size do you want?");
		    size = input.nextInt();
		     if (size == 1){
		    	System.out.println("Price per cup: " + giant);
		    }
		    else if (size == 2){
		    	System.out.println("Price per cup: " + venti);
		    }
		    else if(size == 3){
		    	System.out.println("Price per cup: " + grande);
		    }
		    else{
		    	System.out.println("Invalid Input");
		    	}
		    	System.out.println("Enter Quantity:");
	            quant = input.nextInt();
		     
	            System.out.println("Would you like to add sugar? [Y/N]");
	    	       sugar = input.next().charAt(0);
	    	    
	       	    if (sugar == 'Y'){
	       	    	System.out.println("Please select sugar percentage:  " + per1 + "  " + per2 + "  " + per3 + "  " + per4);
		    	       percent = input.nextInt();
		    	       if (percent == per1){
		    	       	System.out.println("Sugar Percentage of " +per1+"%");
		    	       	}
		    	       else if (percent == per2){
		    	       	System.out.println("Sugar Percentage of "+per2+"%");
		    	       	}
		    	       else if (percent == per3){
		    	       	System.out.println("Sugar Percentage of "+per3+"%");
		    	       	}
		    	       else if (percent == per4){
		    	       	System.out.println("Sugar Percentage of "+per4+"%");
		    	       	}
		    	       else{
		    	       	System.out.println("Invalid Input");
		    	       	}
		    	       
		    	
		    	       System.out.println("\nWould you like to add an Add On? [Y/N]");
		       	    choose = input.next().charAt(0);
		    	
		    	       if(choose == 'Y'){
		    	       	System.out.println("ADDS ON: \n[1]creampuff \n[2]creamcheese \n[3]cheesecake ");
		    		       add = input.nextInt();
		    		
		    	       switch (add){
		    	       	case 1: //CREAMPUFF
		    	    		    total += (giant+creampuff);
		    	    		    System.out.println("Product :    Chocolate Hotfudge");
		    		        	System.out.println("Price : "+giant);
		    	        		System.out.println("Quantity :           "+quant);
		    		        	System.out.println("Add on :         creampuff");
		    	        		System.out.println("Sugar :           "+percent+"%");
		    	        		sum = total * quant;
		    	        		break;
		    	        	 case 2: //CREAMCHEESE
		    		        	total += (giant+creampuff);
		    		        	System.out.println("Product :    Chocolate Hotfudge");
		    		        	System.out.println("Price : "+giant);
		    	        		System.out.println("Quantity :           " +qty);
		    		        	System.out.println("Add on :         creampuff");
		    	        		System.out.println("Sugar :           "+percent+"%");
		    	        		sum = total * quant;
		    	        		break;
		    	        	case 3: //CHEESECAKE
		    		        	total += (giant+creampuff);
		    		        	System.out.println("Product :    Chocolate Hotfudge");
		    		        	System.out.println("Price : "+giant);
		    	        		System.out.println("Quantity :           " +quant);
		    		        	System.out.println("Add on :         creampuff");
		    	        		System.out.println("Sugar :           "+percent+"%");
		    	        		sum = total * quant;
		    	        		break;
		    	        	default:
		    	        	    System.out.println("Invalid Input!");
		    	       	}
		    	       	}
		    	       else if(choose == 'N'){
		    	       	System.out.println("Product :    Chocolate Hotfudge");
		    		    System.out.println("Price : "+giant);
		    	    	System.out.println("Quantity :           "+quant);
		        		sum = total*quant;
		        		}
		              else{
		              	System.out.println("Invalid Input");
		        		}
		        		sum += (total * quant);
		        		System.out.println("The total amount: "+sum);
		    	        System.out.println("Enter Cash");
		                cash = input.nextInt();
		                
		                if(cash >= sum){
		                change = cash-sum;
		            	System.out.println("\n============================================================");
		    		   System.out.println("                              IKIGAI MILKTEA");
		    		   System.out.print("                --This will serve as your Official Receipt--            ");
		    		   System.out.println("\n============================================================");
		           	System.out.println("DATE: "+date +"\nTIME: "+time);
		    		   System.out.println("\nChocolate Hotfudge                                 "+giant);
		    		   System.out.println("                                 "+quant+"x"+giant);
		    	   	System.out.println("Add on :                         "+creampuff);
		    		    	
		    		   System.out.println("\nTOTAL:                          "+sum);
		    	   	System.out.println("CASH:                            "+cash);
		    	   	System.out.println("____________________________________________________________");
		    	   	System.out.println("CHANGE:                  "+change);
		    	   	}
		    	   	else{
		    	   	      	System.out.println("You don't have enough cash");
		    			        	}
		    	        		break;
	       	    	}
			}
	}
