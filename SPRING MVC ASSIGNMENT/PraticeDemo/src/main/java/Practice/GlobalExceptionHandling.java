package Practice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
public class GlobalExceptionHandling {
	@ExceptionHandler(NullPointerException.class)
	public String handle()
	{
		return "NullPointerException";
	}
}
