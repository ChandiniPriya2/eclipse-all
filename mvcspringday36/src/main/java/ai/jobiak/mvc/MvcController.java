package ai.jobiak.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {
@RequestMapping(value="ola",method=RequestMethod.GET)
public ModelAndView greet() {
	return new ModelAndView("hello","greetings","Hola,como Estas");
}
}
