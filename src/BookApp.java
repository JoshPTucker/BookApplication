import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String choice;
		System.out.println("Welcome" + "\n Would you like to create entry or enter and sku?");
		System.out.println("Enter \"Create new\" or \" sku\"");
		choice = keyboard.next();
		if (choice.equalsIgnoreCase("Create new")) {
			boolean cont = true;

			while (cont) {
				Book book = new Book();

				System.out.println("Enter author name");
				book.setAuthor(keyboard.nextLine());

				System.out.println("Enter book title");
				book.setTitle(keyboard.next());

				System.out.println("Enter Book Description");
				book.setDescription(keyboard.nextLine());
				//
				System.out.print("Enter price");
				book.setPrice(keyboard.nextDouble());

				book.getDisplayText();
				System.out.print("Would you like to continue? " + "\n y or n?");
				if (keyboard.next().equals("y")) {
					cont = true;
				} else {
					cont = false;
				}
				keyboard.close();
			}
		} else if (choice.equalsIgnoreCase("sku")) {
			System.out.println("Enter sku");
			
			//Book book2 = Book.getBook(book2.setSKU(keyboard.next()));
		}
	}
}