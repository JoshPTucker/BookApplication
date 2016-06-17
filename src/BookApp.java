import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String choice;
		System.out.println("Welcome" + "\n Would you like to create entry or enter and sku?");
		System.out.println("Enter \"Create\" or \" sku\"");
		choice = keyboard.next();
		
		
		if (choice.equals("create")) {
			//System.out.println("im a debug statement");
			boolean cont = true;

			while (cont) {
				Book book = new Book();

				System.out.println("Enter author name");
				book.setAuthor(keyboard.nextLine());
				
				System.out.println("Enter book title");
				book.setTitle(keyboard.nextLine());

				System.out.println("Enter Book Description");
				book.setDescription(keyboard.nextLine());
				
				System.out.print("Enter price");
				book.setPrice(keyboard.nextDouble());

				book.getDisplayText();
				System.out.print("\nWould you like to continue? " + "\n y or n?");
				if (keyboard.next().equals("y")) {
					cont = true;
				} else {
					cont = false;
				}
				
				
			}
		} else if (choice.equalsIgnoreCase("sku")) {
			Book book2=new Book();
			System.out.println("Enter sku");
			choice =keyboard.next();
		//BookDb.setSKU();
			BookDb.getbook(choice);
			
			book2.getDisplayText();
		}
		keyboard.close();
	}
}