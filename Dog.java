//author Yolanda Gandy "subclass extending abstract class or superclass"

package Week6Assessment;

/**Create a subclass of Animal called Dog. Override greet to return the string
“Woof!”. It ignores the name parameter*/

public class Dog extends Animal {
	
	@Override
	public String greet(String name) { 
		return "Dog replies Woof!";
	}
}
