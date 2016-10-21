package tests.springhibernate;


import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

public class Autobound {

	String[] myStringArray = new String[]{"a","b","c"};
	@InitBinder
	public void constrainParameters(WebDataBinder dataBinder) {
	    //dataBinder.setAllowedParameters( myStringArray );
	    dataBinder.setAllowedFields(myStringArray);
	}
}
