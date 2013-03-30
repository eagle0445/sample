package fire.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fire.controller.util.SessionHelper;
import fire.entity.User;


@Controller("loginController")
@RequestMapping(value="/login")
public class LoginController {

	final Logger logger = LoggerFactory.getLogger(getClass());
	
	/**
	 * @param sentence
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/login.spr", method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("user")User user, String validcode, HttpSession session) throws Exception {
		ModelAndView mav = new ModelAndView();
		session.setAttribute(SessionHelper.UserHandler, user);
		mav.setViewName("redirect:/mg/userIndex.jsp");
		mav.addObject("opmsg", "登录成功!");
		logger.info("登录成功!");
		return mav;
	}
	

}
