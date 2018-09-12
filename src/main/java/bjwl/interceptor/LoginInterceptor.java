package bjwl.interceptor;

import bjwl.controller.LoginStata;
import bjwl.controller.WXLoginController;
import bjwl.pojo.Loginstate;
import bjwl.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

	@Autowired
	LoginService loginService;
	@Autowired
    LoginStata loginStata;


	@Override
	public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
		
		//获取请求的url
		String url = request.getRequestURI();
		//判断url是否是公开 地址（实际使用时将公开 地址配置配置文件中）
		//这里公开地址是登陆提交的地址
		if(url.indexOf("wXLoginController/decodeUserInfo")>=0){
			//如果进行登陆提交，放行
			return true;
		}
        int sessionId=1;
        String re_session= request.getParameter("rd_session");
        System.out.println(re_session+"#########################");
        if (re_session!=null){
            sessionId=loginService.selectByResession(re_session);
        }
        System.out.println(sessionId);
        if(sessionId==0){
            loginStata.getState("false");
            return false;
        }else
            return true;
	}
	//进入Handler方法之后，返回modelAndView之前执行
	//应用场景从modelAndView出发：将公用的模型数据(比如菜单导航)在这里传到视图，也可以在这里统一指定视图
	@Override
	public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
		System.out.println("HandlerInterceptor1...postHandle");
	}

	//执行Handler完成执行此方法
	//应用场景：统一异常处理，统一日志处理
	@Override
	public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		System.out.println("HandlerInterceptor1...afterCompletion");
	}


}
