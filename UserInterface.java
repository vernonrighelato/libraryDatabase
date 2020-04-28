import java.util.Scanner;

public class UserInterface {
	
	private Database database;
	private MemberUpdate memberUpdate;
	private boolean running = true;	
	
	public UserInterface(Database database, MemberUpdate memberUpdate) {		
		this.database = database;
		this.memberUpdate = memberUpdate;
	}
	
	enum Type {
		BOOK, FILM, MEMBER;
	}	
	
	public void run(){
		Scanner inputInt = new Scanner(System.in);		
		System.out.println("Welcome to the library database");
		
		while(running){
			System.out.println("select an option \n 1: add a book \n 2: Add a film \n "
					+ "3: Add a member \n 4: print resources \n 5: print members \n "
					+ "6: send message to members \n 7: quit the program");
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
				database.printResources();
				break;
			case 5:
				database.printMembers();
				break;
			case 6:
				updateMembers();
				break;			
			case 7:
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
			database.addResource(new Book(format, theName, author));
			break;
		case FILM:
			format = "film";
			System.out.println("Enter film title");
			theName = input.nextLine();
			System.out.println("Enter director");
			String director = input.nextLine();
			database.addResource(new Book(format, theName, director));
			break;
		case MEMBER:
			System.out.println("Enter member name");
			theName = input.nextLine();
			System.out.println("Enter member ID");
			String id = input.nextLine();
			Member member = new Member(theName, id);
			database.addMember(member);
			memberUpdate.registerMember(member);
		}
	}
	private void updateMembers(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a message to send to members");
		String theMessage = input.nextLine();
		memberUpdate.sendUpdates(theMessage);
		System.out.println("Message " + theMessage + " sent to all members");
	}
}
