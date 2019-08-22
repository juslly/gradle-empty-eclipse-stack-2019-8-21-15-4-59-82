
public class Car {
	private String engine;
	private String wheels;
	
	
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getWheels() {
		return wheels;
	}
	public void setWheels(String wheels) {
		this.wheels = wheels;
	}
	
	public Car(String engine,String whells) {
		this.engine = engine;
		this.wheels = whells;
		
	}
	public void start() {
		System.out.println(engine + " is on and "+ wheels+" are running!");
		
	}

}
