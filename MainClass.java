package hotelSql;

import java.util.Scanner;



public class MainClass {
	
	static void mainMenue() {

		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t \t ********** Welcome *********** \t \t");
		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t \t ***Please Choose One Option*** \t \t");
		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t\t 1. Create Hotels Table ");
		System.out.println("\t\t 2. Create Room Type Table  ");
		System.out.println("\t\t 3. Create Rooms Table ");
		System.out.println("\t\t 4. Create Guests Table  ");
		System.out.println("\t\t 5. Create Employee Type Table  ");
		System.out.println("\t\t 6. Create Employees Table  ");
		System.out.println("\t\t 7. Insert values Hotels  ");
		System.out.println("\t\t 8. read from Hotels  ");
		System.out.println("\t\t 9. Exite ");
	
}

	 public static void main(String a[])  {
		
		 boolean isExit = true;

			while (isExit) {

				Scanner sc = new Scanner(System.in);
				mainMenue();

				int option = sc.nextInt();

				switch (option) {
				
				case 1:

					Hotel hotelTable = new Hotel ();
					hotelTable . hotelTable();
				
						break;

				case 2:
					RoomType myRoomTypeTable = new RoomType();
					myRoomTypeTable . roomTableType();
						break;
				
				case 3:
					Room myRoomTable = new Room();
					myRoomTable.roomTable();
					
					break;
					
				case 4:
					Guest myGuestTable = new Guest();
					myGuestTable.GuestsTable();
					   
						break;	
						
				case 5:
					EmployeeType myEmployeeType = new EmployeeType();
					myEmployeeType.EmployeeTableType();
		            
					break;
					
				case 6:
					Employee myEmployee = new Employee();
					myEmployee.employeeTable();
		            
					break;
					
				case 7:
					Hotel hotelTable1 = new Hotel ();
					hotelTable1.insertIntoTable();
					
					
					break;
					
				case 8:
					
					
					break;
						
					
				case 9:
						System.out.println(" See You Soon ");
						System.exit(0);
						
						break;

					}
				}
			
			
			
			
				
				isExit = false;

		 
		 
	 
			}}
	
	
	
	
	


