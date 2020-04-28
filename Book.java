public class Book extends Resource {
	

	private String author;
	
	
	public Book(String format, String title, String author) {
		
		super(format, title);	
		this.author= author;
	}
	@Override
	public String getDetails(){
		return super.getDetails() + " " + author;
	}
}