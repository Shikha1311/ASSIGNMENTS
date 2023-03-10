package internationalization;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
   @RequestMapping("/en")
   public String demo()
   {
	   return "english";
   }
   @RequestMapping("/fr")
   public String demo2()
   {
	   return "french";
   }
   @RequestMapping("/vi")
   public String demo3()
   {
	   return "Vietnamese";
   }
}
