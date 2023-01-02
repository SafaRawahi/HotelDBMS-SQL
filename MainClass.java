package hotelSql;

import java.util.Scanner;

public class MainClass {
	
	static void mainMenue() {

		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t \t ********** Welcome *********** \t \t");
		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t \t ***Please Choose One Option*** \t \t");
		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t\t 1. Create Student Table ");
		System.out.println("\t\t 2. Create Subject Table  ");
		System.out.println("\t\t 3. Select Top 10 Students  ");
		System.out.println("\t\t 4. Student And Subject Menue  ");
		System.out.println("\t\t 5. Exite ");
	
}

	 public static void main(String a[])  {
		
		 boolean isExit = true;

			while (isExit) {

				Scanner sc = new Scanner(System.in);
				mainMenue();

				int option = sc.nextInt();

				switch (option) {
				
				case 1:


				
						
						break;

				case 2:
            
            
						break;
					
				
				case 3:
					
					
					
					break;				
					
				case 4:
					
				            
						break;	
						
						
				case 5:
						System.out.println(" See You Soon ");
						System.exit(0);
						
						break;

					}
				}
				
				isExit = false;

		 
		 
	 
			}}
	
	
	
	
	


