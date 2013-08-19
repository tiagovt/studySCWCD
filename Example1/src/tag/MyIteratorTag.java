package tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;


public class MyIteratorTag extends TagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 363604120300546242L;
	
	String[] movies =  new String[] {"Spiderman", "Saved", "Amelie"};
	int movieCounter;
	
	public int doStartTag() throws JspException{
		movieCounter = 0;
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public int doAfterBody() throws JspException {
		if(movieCounter < movies.length){
			pageContext.setAttribute("movie", movies[movieCounter]);
			movieCounter ++;
			return EVAL_BODY_AGAIN;
		}else{
			return SKIP_BODY;
		}
	}

	@Override
	public int doEndTag() throws JspException {
	
		return EVAL_PAGE;
	}
	
	

}
