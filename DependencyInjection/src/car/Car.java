/*
 * Example of Dependency Injection
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package car;


import engine.Engine;

/***
 * Model a Car on a used car lot
 * @author nicomp
 *
 */
public class Car {
	private Engine engine;
	
	/***
	 * Constructor
	 * @param engine The engine that the car object will have
	 * @throws Exception 
	 */
	public Car(Engine engine) throws Exception {
		engine = new Engine(engine);	// Use the Engine copy constructor
	}
}
