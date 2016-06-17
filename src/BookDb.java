
public class BookDb {
	private static String sku=" ";
	
	public  String getSKU(){
		return sku;
	}
	public void setSKU(String sku){
		this.sku = sku;
	}
	
	public static Book  getbook(String Sku){
		Book b = new Book();
		
		b.setTitle(sku);
			if (sku.equals("Java1001")){
				b.setAuthor("Kathy Sierra and Bert Bates");
				b.setDescription("Easy to read Java workbook");
				b.setPrice(47.50);
				b.setTitle("Head First Java");
				b.setIsInstock(true);
			}
			else if (sku.equals("Java1002")){
				b.setAuthor("Bruce Eckel");
				b.setDescription("Details about Java under the hood");
				b.setPrice(20.00);
				b.setTitle("Thinking in Java");
				b.setIsInstock(true);
			}
			else if (sku.equals("Orcl1003")){
				b.setAuthor("Jeanne Boyarsky");
				b.setDescription("Everything you need to know in one place");
				b.setPrice(45.00);
				b.setTitle("OCP: Oracle Certified Professional Java SE");
				b.setIsInstock(true);
			}
			else if (sku.equals("Python1004")){
				b.setAuthor("Al Sweigart");
				b.setDescription("Fun with Python");
				b.setPrice(10.50);
				b.setTitle("Automate the Boring Stuff with Python");
				b.setIsInstock(true);
			}
			else if (sku.equals("Zombie1005")){
				b.setAuthor("Simon Monk");
				b.setDescription(" 	Defend Your Base with Simple Circuits, "
						+ "Arduino, and Raspberry Pi");
				b.setPrice(16.50);
				b.setTitle("The Maker's Guide to the Zombie Apocalypse");
				b.setIsInstock(true);
			}
			else if (sku.equals("Rasp1006")){
				b.setAuthor("Donald Norris");
				b.setDescription("A dozen fiendishly fun projects "
						+ "for the Raspberry Pi!");
				b.setPrice(14.75);
				b.setTitle("Raspberry Pi Projects for the Evil Genius");
				b.setIsInstock(true);
			}
//			else if (sku.equals("Java1001")){
//				b.setAuthor("");
//				b.setDescription(description);
//				b.setPrice(price);
//				b.setTitle(title);
//				b.setIsInstock(true);
//			}
			return b;
		
	}
	
}
