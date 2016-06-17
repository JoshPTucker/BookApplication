
public class Book {
	
	private String title;
	private String author;
	private String description;
	private double price;
	private boolean isInstock;
	
	//Book book=new Book();
	
	//constructor
	public Book(){
		title="";
		author=" ";
		price=0;
		description=" ";
	}
	//overloaded constructor
//	public Book(String title, String author, String description, double price){
//		this.title=title;
//		this.author=author;
//		this.price=price;
//		this.description=description;
//	}
	  
	
	//gets the author from user
	public String getAuthor(){
	
		return author;
	
	}
	//sets author
	public  void setAuthor(String author){
		this.author=author;
	}
	
	//gets title of book from user input
	public String getTitle(){
		
		return title;
		
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	//gets description of book from user input
	public String getDescription(){
		return description;
		
	}
	
	public void setDescription(String description ){
		this.description=description;
	}
	//gets price from user input
	public double getPrice(){
		return price;
		
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	public void setIsInstock(boolean isInstock){
		this.isInstock=isInstock;
	}
	public boolean checkInstock(){
		if(this.isInstock=true){
			System.out.println("Book is in stock");
			return true;
		}
		else if (this.isInstock=false){
			System.out.print("Book is not in stock");
			return false;
		}
		else return true;
	}
	
	public void getDisplayText(){
		System.out.println(author);
		System.out.println(title);
		System.out.print(description);
		
	}
}
