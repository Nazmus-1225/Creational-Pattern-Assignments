package singletonPattern;

public class President {

	public static President instance;
	private String name;
	
	public String getName() {
		return name;
	}

	private President(String name) {
		this.name=name;
	}
	
	public static President getInstance(String name) {
		if(instance==null) {
			instance=new President(name);
		}
		return instance;
	}
}
