
public class LibraryDatabaseSystem {
	
	public static void main(String[] args) {
		
		Database database = new Database();
		MemberUpdate memberUpdate = new MemberUpdate();
		UserInterface ui = new UserInterface(database ,memberUpdate);
		ui.run();
	}
}