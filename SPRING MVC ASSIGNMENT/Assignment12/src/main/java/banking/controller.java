package banking;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class controller {
  @RequestMapping(value="/bank" ,method=RequestMethod.GET)
  public String demo()
  {
	  return "detail";
  }
  @RequestMapping(value="/bank2" ,method=RequestMethod.POST)
  public String demo2(@Valid @ModelAttribute("U") USER U)
  {
	  return "detail2";
  }
}
