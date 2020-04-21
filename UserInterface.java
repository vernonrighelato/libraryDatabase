import java.util.Scanner;

public class UserInterface {
	
	private Database db;
	private boolean running = true;	
	
	public UserInterface(Database db) {		
		this.db = db;
	}
	
	enum Type {
		BOOK, FILM, MEMBER;
	}	
	
	public void run(){
		Scanner inputInt = new Scanner(System.in);		
		System.out.println("Welcome to the library database");
		
		while(running){
			System.out.println("select an option \n 1: add a book \n 2: Add a film \n "
					+ "3: Add a member \n 4: print resources \n 5: print members \n 6: quit the program");
			int selection = inputInt.nextInt();
			switch(selection){
			case 1:			
				addToDatabase(Type.BOOK);
				break;	
			case 2:
				addToDatabase(Type.FILM);
				break;		
			case 3:
				addToDatabase(Type.MEMBER);
				break;
			case 4:
				db.printResources();
				break;
			case 5:
				db.printMembers();
				break;
			case 6:
				System.out.println("Exiting program. Bye!");
				inputInt.close();
				running = false;
				break;
			default :
				System.out.println("Invalid option");					
			}			
		}		
	}	
	private void addToDatabase(Type t){
		Scanner input = new Scanner(System.in);
		String theName;		
		String format;
		switch(t){
		case BOOK:
			format = "book";
			System.out.println("Enter book title");
			theName = input.nextLine();
			System.out.println("Enter author");
			String author = input.nextLine();
			db.addResource(new Book(format, theName, author));
			break;
		case FILM:
			format = "film";
			System.out.println("Enter film title");
			theName = input.nextLine();
			System.out.println("Enter director");
			String director = input.nextLine();
			db.addResource(new Book(format, theName, director));
			break;
		case MEMBER:
			System.out.println("Enter member name");
			theName = input.nextLine();
			System.out.println("Enter member ID");
			String id = input.nextLine();
			db.addMember(new Member(theName, id));
		}
	}
}
