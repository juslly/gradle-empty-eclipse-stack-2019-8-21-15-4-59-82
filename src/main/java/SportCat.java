
public class SportCat extends Car{
	
	private String lights;

	public SportCat(String engine, String whells,String lights) {
		super(engine, whells);
		this.lights = lights;
		// TODO Auto-generated constructor stub
	}
	public void start() {
		System.out.println(lights + "  are shining, "+getEngine() + " is on and  "+ getWheels()+" are running!");
	
	}

}
