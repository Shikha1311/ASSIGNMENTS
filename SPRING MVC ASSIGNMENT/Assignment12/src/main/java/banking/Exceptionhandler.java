package banking;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class Exceptionhandler {
	@ExceptionHandler(Exception.class)
	public String handle()
	{
		return "Exception";
	}
}
