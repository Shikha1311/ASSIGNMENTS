package LOGIN;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class loginController {
	@RequestMapping(value="/login" ,method=RequestMethod.GET)
     public String demo()
     {
    	 return "login";
     }
	@RequestMapping(value="/login22" ,method=RequestMethod.POST)
    public String demo1(@ModelAttribute("l") loginClass2 l,BindingResult r,Model m)
    {
		if(r.hasErrors())
			return "error";
		m.addAttribute("name",l.toString());
   	 return "login2";
    }
}
