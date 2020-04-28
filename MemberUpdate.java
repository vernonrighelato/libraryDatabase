import java.util.ArrayList;

public class MemberUpdate {
	
	 ArrayList<Member>members = new ArrayList<>();
	 
	 //method to update the members
	    public void sendUpdates(String theMessage){
	        for(Member member  : members){
	        	member.setUpdate(theMessage);
	        }
	    }
	    public void registerMember(Member member){
	        members.add(member);
	    }    
}
