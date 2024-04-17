package asterisc.in.model;

public class User {
	
	private int uid;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int uid, String name, String add) {
		super();
		this.uid = uid;
		this.name = name;
		this.add = add;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", add=" + add + "]";
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	private String name;
	private String add;
	
	

}
