public class User {
	private String name;
	
	public User(String name){

		this.name = name;
	}
	
	public String getName() {

		return this.name;
	}
	public void report(){

		System.out.println("Report for user: " + name);
	}
	public void save() {
		Persister persister = new Persister(this);
		persister.save();
	}
}