package Practice;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Test {
	@ModelAttribute
	public void demo3(Model m)
	{
		m.addAttribute("name","Form for Practice");
	}
	@RequestMapping(value="/demo", method=RequestMethod.GET)
   public String demo(Model m)
   {   m.addAttribute("name","Details From : ");
	   return "demo";
   }
	@RequestMapping(value="/Done",method=RequestMethod.POST)
	   public String demo1(@Valid @ModelAttribute("s") Student s,BindingResult r,Model m)
	   {
		if(r.hasErrors())
			return "demo";
		    m.addAttribute("msg",s.toString());
		   return "index";
	   }

}

