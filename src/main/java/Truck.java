
public class Truck extends Car{
	
	private String payload;

	public Truck(String engine, String whells,String payload) {
		super(engine, whells);
		this.payload = payload;
		// TODO Auto-generated constructor stub
	}
	public void start() {
		System.out.println( "tips,  "+getEngine() + " is on and  "+ getWheels()+" are running!");
	}
	
	public void load() {
		System.out.println( payload + " is loading goods");
	}

}
