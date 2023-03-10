package Practice;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class interceptor extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		    throws Exception {
		Calendar cal = Calendar.getInstance();
		int d=cal.get(cal.DAY_OF_WEEK);
		if(d==10)
		{
			response.getWriter().write("This site is closed on sunday.................");
			return false;
			
		}
		else
			return true;
		}


}
