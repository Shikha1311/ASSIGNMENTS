package PraticeDemo2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CTLR {
    @RequestMapping(value="/test",method=RequestMethod.GET)
    public String Demo(Model m)
    {
    	m.addAttribute("msg","WELCOME");
    	return "test";
    }
    @RequestMapping(value="/done" ,method=RequestMethod.POST)
    public String Demo2(@ModelAttribute("c") clg c,BindingResult r,Model m)
    {
    	m.addAttribute("msg","WELCOME");
    	if(r.hasErrors())
    		return "test";
    	m.addAttribute("MSG", c.toString());
    	return "test2";
    }
    
}
