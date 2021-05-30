package modelo;

public abstract class Shape {
	
	protected String type;
	private String id;
	
	public Shape() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

	public String getType() {
		return type;
	}
	
	public abstract Shape clone();
}
