
public abstract class Resource {
	
	private String format;
	private String title;
	
	public Resource(String format, String title) {
		
		this.format = format;
		this.title = title;
	}
	public String getDetails(){
		return format + " " + title;
	}
}
