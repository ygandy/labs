//author Yolanda Gandy "subclass extending abstract class or superclass"

package Week6Assessment;

/** Now create a subclass of Animal called Parrot. Override greet to return the string
“Hello [name]!” including the name passed in.*/

public class Parrot extends Animal{

	@Override
	public String greet(String name) {
		return "Parrot replies, Hello " + name + "!";
	}
}
