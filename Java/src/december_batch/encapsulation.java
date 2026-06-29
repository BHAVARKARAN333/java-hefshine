package december_batch;

class demo12{
	
	private int id;
	private String name;
	private float f;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getF() {
		return f;
	}
	public void setF(float f) {
		this.f = f;
	}
}

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo12 d = new demo12();
		d.setId(11);
		System.out.println(d.getId());
		d.setName("karan");
		System.out.println(d.getName());
		d.setF((float) 1.12);
		System.out.println(d.getF());

	}

}
