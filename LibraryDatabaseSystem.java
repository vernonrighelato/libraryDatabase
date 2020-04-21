
public class LibraryDatabaseSystem {
	
	public static void main(String[] args) {
		
		Database db = new Database();
		UserInterface ui = new UserInterface(db);
		ui.run();
	}
}