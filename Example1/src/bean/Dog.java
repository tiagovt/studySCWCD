package bean;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Application Lifecycle Listener implementation class SessionChangeValueListene
 * 
 * @author tiagovaz
 */
public class Dog implements HttpSessionBindingListener {

	private String name;
	private int age;
	
    public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
     * Default constructor. 
     */
    public Dog() {
        
    }

	/**
     * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
     */
    public void valueUnbound(HttpSessionBindingEvent arg0) {
        System.out.println("valor unbound");
        System.out.println("name " + arg0.getName());
        System.out.println("value " + arg0.getValue());
    }

	/**
     * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
     */
    public void valueBound(HttpSessionBindingEvent arg0) {
    	System.out.println("valor bound");
        System.out.println("name " + arg0.getName());
        System.out.println("value " + arg0.getValue());
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
