import java.util.Scanner;

public class UserInterface {
	
	private Database db;
	private boolean running = true;	
	
	public UserInterface(Database db) {		
		this.db = db;
	}
	
	public void run(){
		Scanner inputInt = new Scanner(System.in);		
		System.out.println("Welcom to the library database");
		
		while(running){
			System.out.println("select an option \n 1: add a book \n 2: Add a film \n "
					+ "3: Add a member \n 4: print resources \n 5: print members \n 6: quit the program");
			int selection = inputInt.nextInt();
			switch(selection){
			case 1:
				addBook();	
				break;	
			case 2:
				addFilm();	
				break;		
			case 3:
				addMember();
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
	private void addBook(){		
		Scanner inputString = new Scanner(System.in);
		String format = "Book";
		System.out.println("Enter book title");
		String bookTitle = inputString.nextLine();
		System.out.println("Enter author");
		String author = inputString.nextLine();
		db.addResource(new Book(format, bookTitle, author));		
	}
	private void addFilm(){		
		Scanner inputString = new Scanner(System.in);
		String format ="Film";
		System.out.println("Enter film title");
		String filmTitle = inputString.nextLine();
		System.out.println("Enter director");
		String director = inputString.nextLine();
		db.addResource(new Film(format, filmTitle, director));		
	}
	private void addMember(){
		Scanner inputString = new Scanner(System.in);
		System.out.println("Enter member name");
		String memberName = inputString.nextLine();
		System.out.println("Enter member id");
		String memberId = inputString.nextLine();
		db.addMember(new Member(memberName, memberId));		
	}
}
