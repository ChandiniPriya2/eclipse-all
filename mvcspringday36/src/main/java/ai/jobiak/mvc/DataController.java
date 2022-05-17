package ai.jobiak.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DataController {
	@Autowired
	SignupDAO insert;
	
	public DataController(SignupDAO inesrt) {
		
		this.insert = insert ;
	}

	@RequestMapping(value="insert", method=RequestMethod.POST)
	public String message(User1 user1,ModelMap map) {
		insert.insertRow(user1.getId(),user1.getName(),user1.getSalary());
		
		map.put("id",user1.getId());
		map.put("Name", user1.getName());
		map.put("salary",user1.getSalary());
	
		return "jdbc";
		
	}
}
