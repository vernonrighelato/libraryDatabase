
public class Member extends Observer {
	
	private String memberName;
	private String id;

	
	public Member(String memberName, String id) {
		
		this.memberName = memberName;
		this.id = id;
	}

	public String getDetails(){
		return memberName + id + super.getUpdate();
	}	
}
