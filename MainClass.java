package hotelSql;

import java.util.Scanner;

public class MainClass {

	static void mainMenue() {

		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t \t ********** Welcome *********** \t \t");
		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t \t ***Please Choose One Option*** \t \t");
		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t\t 1. Insert 10,000 hotels ");
		System.out.println("\t\t 2. Insert 1 hotel");
		System.out.println("\t\t 3. Print 10 hotels ");
		System.out.println("\t\t 4. make Is Active False first 10 ");
		System.out.println("\t\t 5. Print hotel information by user input  ");
		
//		System.out.println("\t\t 3. Create Rooms Table ");
//		System.out.println("\t\t 4. Create Guests Table  ");
//		System.out.println("\t\t 5. Create Employee Type Table  ");
//		System.out.println("\t\t 6. Create Employees Table  ");
		System.out.println("\t\t 7. Insert values Hotels  ");
		System.out.println("\t\t 8. Read from Hotels Table  ");
		System.out.println("\t\t 9. Read from Hotels Table By Id ");
		System.out.println("\t\t 10. Update from Hotels Table By Id ");
		System.out.println("\t\t 11. Delete from Hotels Table By Id ");
		System.out.println("\t\t 12. Update value is active in one column ");
		System.out.println("\t\t 13. Exite ");
	}

	public static void main(String a[]) {

		Hotel hotelTable = new Hotel();

		boolean isExit = true;

		while (isExit) {

			Scanner sc = new Scanner(System.in);
			mainMenue();

			int option = sc.nextInt();

			int num;
//			int top = 0;
			switch (option) {

			case 1:
				System.out.println(" Enter The Numbers Of Hotal You Want ");
				num = sc.nextInt();
				hotelTable.insertMoreHotels(num);

				break;

			case 2:
// one hotel

				hotelTable.insertMoreHotels(1);
				
//				RoomType myRoomTypeTable = new RoomType();
//				myRoomTypeTable.roomTableType();
				break;

			case 3:

				hotelTable.printTenHotels(10);
//				Room myRoomTable = new Room();
//				myRoomTable.roomTable();

				break;

			case 4:
				
				hotelTable.makeIsActiveFalseById();
//				Guest myGuestTable = new Guest();
//				myGuestTable.GuestsTable();

				break;

			case 5:
				System.out.println(" Enter The Numbers Of Hotal You Want To Print ");
				int n = sc.nextInt();
				hotelTable.printTenHotels( n );
				
//				EmployeeType myEmployeeType = new EmployeeType();
//				myEmployeeType.EmployeeTableType();

				break;

			case 6:
				Employee myEmployee = new Employee();
				myEmployee.employeeTable();
				break;

			case 7:
				hotelTable.insertIntoTable();
				break;

			case 8:
				hotelTable.readFromTable();
				break;

			case 9:
				hotelTable.getById();
				break;

			case 10:

				hotelTable.updateById();
				break;

			case 11:

				hotelTable.deleteById();
				break;
			case 12:

				hotelTable.makeIsActiveFalseById();
				break;

			case 13:
				System.out.println(" See You Soon ");
				System.exit(0);

				break;

			}
		}

		isExit = false;

	}
}
