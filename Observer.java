public abstract class Observer {

	String message;

	public void setUpdate(String message) {
		this.message = message;
	}

	public String getUpdate() {
		return message;
	}
}
