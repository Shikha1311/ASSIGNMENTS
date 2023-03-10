package Practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class controller {
     @RequestMapping(value="/r",method=RequestMethod.GET)
     public String d()
     {
    	 return "demo";
     }
     @RequestMapping(value="/r2",method=RequestMethod.POST)
     public String d2()
     {
    	 return "demo2";
     }
}
