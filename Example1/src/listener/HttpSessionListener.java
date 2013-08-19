package listener;

import javax.servlet.http.HttpSessionEvent;

import java.util.Date;

/**
 * Application Lifecycle Listener implementation class HttpSessionListener
 *
 */
public class HttpSessionListener implements javax.servlet.http.HttpSessionListener {

    /**
     * Default constructor. 
     */
    public HttpSessionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0) {
        System.out.println("Sessao criada " + new Date());
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0) {
        System.out.println("sessao destruida " + new Date());
        System.out.println("sessao criada em  " + new Date(arg0.getSession().getLastAccessedTime()));
    }
	
}
