
public class Film extends Resource{
	
	private String director;

	public Film(String format, String title, String director) {
		super(format, title);
		this.director = director;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getDetails(){
		return super.getDetails() + " " + director;
	}
}
