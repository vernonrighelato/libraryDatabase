import java.util.ArrayList;


public class Database {
	
	private ArrayList<Resource>resources = new ArrayList<>();
	private ArrayList<Member>members = new ArrayList<>();
	
	public void addResource(Resource r){
		resources.add(r);
	}
	public void addMember(Member m){
		members.add(m);
	}
	public void printResources(){
		for(Resource r:resources){
			if(r instanceof Book){
				Book b = (Book) r;
			System.out.println(b.getDetails());
			}else if(r instanceof Film){
				Film f = (Film) r;
			System.out.println(f.getDetails());
			}
		}
	}
	public void printMembers(){
		for(Member m:members){
			System.out.println(m.getDetails());
		}
	}
}