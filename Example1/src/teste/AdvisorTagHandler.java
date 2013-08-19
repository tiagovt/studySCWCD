package teste;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class AdvisorTagHandler extends SimpleTagSupport implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String user;
	
	
	@Override
	public void doTag() throws JspException, IOException {
		getJspContext().getOut().write(" hello " + user + "</br>");
		getJspContext().getOut().write(" adivise " + getAdvice());
	}

	public String getAdvice(){
		String[] adiveString = {"Teste 1", "Teste 2", "Teste 3"};
		int random = (int) (Math.random() * adiveString.length);
		return adiveString[random];
	}
	
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
}
