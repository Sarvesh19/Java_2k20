package exectuter;

public class Hosting implements Cloneable {

	private Integer Id;
	private String name;
	private long websites;

	public Hosting(int id, String name, long websites) {
		this.Id = id;
		this.name = name;
		this.websites = websites;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getWebsites() {
		return websites;
	}

	public void setWebsites(long websites) {
		this.websites = websites;
	}

	@Override
	public String toString() {
		return "Hosting [Id=" + Id + ", name=" + name + ", websites=" + websites + "]";
	}

	// getters, setters and toString()
}