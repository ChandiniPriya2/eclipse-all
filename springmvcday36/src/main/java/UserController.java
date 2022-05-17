

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class UserController {
	@RequestMapping(value="",method=RequestMethod.GET)
	public String message(ModelMap map) {
		map.put("user","john");
		map.put("password", "admin");
		map.put("otp", "3467");
		return "user";
	}
	
}
