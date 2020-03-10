/*
 * Example of Dependency Injection
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */

package engine;

public class Engine {
	private String name;
	private int displacement;
	/**
	 * Copy Constructor
	 * @param engine
	 * @throws Exception 
	 */
	public Engine(Engine engine) throws Exception {
		setName(engine.getName());
		setDisplacement(engine.getDisplacement());
	}
	
	public Engine(String name, int displacement) throws Exception {
		setName(name);
		setDisplacement(displacement);
	}
	public String getName() {return name;}
	public int getDisplacement() {return displacement;}
	
	private void setName(String name) throws Exception {
		if (name.trim().length() == 0) {
			throw new Exception("Engine name cannot be blank");
		}
	}
	private void setDisplacement(int displacement) throws Exception {
		if (displacement < 0) {
			throw new Exception("Engine displacement cannot be zero or negative");
		}
	}
}
