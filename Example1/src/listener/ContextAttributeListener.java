package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ContextAttributeListener implements
		ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		System.out.println("tributo adicionado no contexto");
		System.out.println("Name " + arg0.getName());
		System.out.println("Source " + arg0.getSource());
		System.out.println("Value " + arg0.getValue());
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		System.out.println("tributo removido no contexto");
		System.out.println("Name " + arg0.getName());
		System.out.println("Source " + arg0.getSource());
		System.out.println("Value " + arg0.getValue());

	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		System.out.println("tributo substituido no contexto");
		System.out.println("Name " + arg0.getName());
		System.out.println("Source " + arg0.getSource());
		System.out.println("Value " + arg0.getValue());

	}

}
