package excel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
   @RequestMapping("/emp")
   public String demo()
   {
	 return "excel";
   }
}
