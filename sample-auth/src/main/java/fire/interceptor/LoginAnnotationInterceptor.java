package fire.interceptor;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import fire.authority.Login;
import fire.authority.ResultTypeEnum;
import fire.controller.util.SessionHelper;
import fire.entity.User;
/**
 * 检查是否已经登录
 * @author jf
 *
 */
public class LoginAnnotationInterceptor extends HandlerInterceptorAdapter {

	final Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		HandlerMethod handler2 = (HandlerMethod) handler;
		Login login = handler2.getMethodAnnotation(Login.class);

		if (null == login) {
			// 没有声明权限,放行
			return true;
		}

		HttpSession session = request.getSession();
		User user = (User) session.getAttribute(SessionHelper.UserHandler);

		if (null == user) {
			// 需要登录
			if (login.value() == ResultTypeEnum.page) {
				//采用传统页面进行登录提示
				request.getRequestDispatcher("/login.jsp?oprst=false&opmsg=请登录!").forward(request, response);
			} else if (login.value() == ResultTypeEnum.json) {
				//采用ajax方式的进行登录提示
				response.setCharacterEncoding("utf-8");
				response.setContentType("text/html;charset=UTF-8");
				OutputStream out = response.getOutputStream();
				PrintWriter pw = new PrintWriter(new OutputStreamWriter(out,"utf-8"));
				pw.println("{\"result\":false,\"code\":11,\"errorMessage\":\"您未登录,请先登录\"}");
				pw.flush();
				pw.close();
			}
			return false;

		}

		return true;

	}

}
