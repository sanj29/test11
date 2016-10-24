package tests.springhibernate;


import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

public class Autobound {

	private static final String[] myStringArray = new String[]{"a","b","c"};
	@InitBinder
	public void constrainParameters(WebDataBinder dataBinder) {
	    dataBinder.setDisallowedFields( myStringArray );
	    dataBinder.setAllowedFields(myStringArray);
	    //dataBinder.set
	}
	
	public void constrainParameters1(WebDataBinder dataBinder) {
		dataBinder.setDisallowedFields( myStringArray );
	    dataBinder.setAllowedFields(myStringArray);
	    //dataBinder.set
	}
}
