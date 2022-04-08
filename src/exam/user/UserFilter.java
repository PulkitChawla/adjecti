package exam.user;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

//@WebFilter("/index")
public class UserFilter extends HttpFilter implements Filter {

	public UserFilter() {
		super();
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		HttpSession session=req.getSession();
		User user=(User)session.getAttribute("current_user");
		//System.out.println("User printing------------"+user);
		if(user!=null) {
			
			chain.doFilter(req, res);
		}
		else {
			res.sendRedirect("login.jsp");
		}
		//Recent added code
		
		
			chain.doFilter(request, response);
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		System.out.println("In User Filter class");
//		String userId = request.getParameter("userId");
////		String name = request.getParameter("name");
//		String password = request.getParameter("pwd");
//		System.out.println(userId + "  : " + password);
//
//		User user = null;
//		try {
//			user = UserService.getUserByLoginId(userId, password);
//
//			System.out.println("+++++++++++++++++++++" + user);
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		if (user == null) {
//			HttpServletResponse hr = (HttpServletResponse) response;
//			hr.sendRedirect("login.jsp");
//
//		} else {
//			HttpServletRequest hr = (HttpServletRequest) request;
//
//			HttpSession session = hr.getSession();
//
//			session.setAttribute("current_user", user);	
//			RequestDispatcher rq = request.getRequestDispatcher("index.jsp");
//			rq.forward(request, response);
//			chain.doFilter(request, response);	
//		}

	}
	private boolean needsAuthentication(String url) {
        String[] validNonAuthenticationUrls ={ "index.jsp", "addExam.jsp","deleteById.jsp","editExam.jsp" };
        for(String validUrl : validNonAuthenticationUrls) {
            if (url.endsWith(validUrl)) {
                return false;
            }
        }
        return true;
    }
	
	public void init(FilterConfig fConfig) throws ServletException {

	}

}
