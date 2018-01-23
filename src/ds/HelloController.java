package ds;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		String hello = arg0.getParameter("hello");
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("hello",hello);
		return mav;
	}

}
