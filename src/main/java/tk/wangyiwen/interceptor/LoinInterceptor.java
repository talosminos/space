package tk.wangyiwen.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

import tk.wangyiwen.entity.User;

/**
 * 拦截用户是否登录
 * @author Administrator
 *
 */
public class LoinInterceptor extends MethodFilterInterceptor {

	//写拦截器的逻辑
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		//判断session里面是否有user
		//得到session
		HttpServletRequest request = ServletActionContext.getRequest();
		User user = (User) request.getSession().getAttribute("user");
		if(user!=null) {
			//登录状态
			return invocation.invoke();
		}else {
			//未登录
			//不是登录状态不执行Action里面的方法
			//到resilt标签里面找到名称是login的值，到配置路径里面
			return "login";
		}
	}
}
