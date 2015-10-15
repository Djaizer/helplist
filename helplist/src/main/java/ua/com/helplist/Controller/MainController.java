package ua.com.helplist.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.com.helplist.DaoImpl.VolunteerDao;

@Controller
@RequestMapping(value = "/")
public class MainController {
	
	@Autowired
	private VolunteerDao vd;
	
	@RequestMapping(value = "main", method = RequestMethod.GET)
	public String main(ModelMap model) {
		model.addAttribute("msg", "Main: Hello, World! () ");
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap model) {
		model.addAttribute("msg", "Hello, World! () ");
		return "index";
	}

	public VolunteerDao getVd() {
		return vd;
	}

	public void setVd(VolunteerDao vd) {
		this.vd = vd;
	}
	
	
}
