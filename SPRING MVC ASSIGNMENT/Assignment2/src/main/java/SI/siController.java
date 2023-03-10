package SI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class siController {
  @RequestMapping(value="/test" ,method=RequestMethod.GET)
   public String demo(Model m)
   {
	  m.addAttribute("msg","Simple Interest Calculator");
	   return "si";
   }
  @RequestMapping(value="/test2" ,method=RequestMethod.POST)
  public String demo2(@ModelAttribute("S") SiClass S,Model m)
  {
	  m.addAttribute("msg","Simple Interest Calculator");
	  m.addAttribute("si", S.toString());
	  m.addAttribute("re","Rs. "+ S.Interest());
	   return "si2";
  }
  
}
