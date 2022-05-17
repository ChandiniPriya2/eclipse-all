package ai.jobiak.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UpdateController {
	@Autowired
	Update update;

	public UpdateController(Update update) {
		
		this.update = update;
	}
	@RequestMapping(value="update", method=RequestMethod.POST)
	public String message(User1 user1,ModelMap map) {
		update.updateRow(user1.getId(),user1.getSalary());
		
		map.put("id",user1.getId());
        map.put("salary",user1.getSalary());
	
		return "updatejdbc";
		
	}
	
}
