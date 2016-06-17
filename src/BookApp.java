import java.util.Scanner;
public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book=new Book();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter author name");
		book.setAuthor(keyboard.next());
		
		System.out.println("Enter book title");
		book.setTitle(keyboard.next());
		book.getDisplayText();
	}

}
