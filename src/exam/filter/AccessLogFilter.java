package exam.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

import exam.conn.Conn;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Servlet Filter implementation class FirstFilter
 */
//@WebFilter("*.do")
public class AccessLogFilter extends HttpFilter implements Filter {

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("--------------------------------- Filter ----------------------------------------");
		
			InetAddress ipAddress = InetAddress.getLocalHost();
			String ip = ipAddress.getHostAddress();
 
			LocalDateTime now = LocalDateTime.now();
			String date_and_time = "Date : " + now.getDayOfMonth() + "-" + now.getMonth() + "-" + now.getYear()
					+ ", Time : " + now.getHour() + " : " + now.getMinute() + " : " + now.getSecond();

			HttpServletRequest r = (HttpServletRequest) request;
			String uri = r.getScheme() + "://" + r.getServerName() + ":" + r.getServerPort() + r.getRequestURI();
			AccessLogService.service(ip,date_and_time,uri);


		// pass the request along the filter chain
		chain.doFilter(request, response);

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	public void destroy() {

	}
	// https://cloud.google.com/appengine/docs/flexible/java/configuring-the-web-xml-deployment-descriptor#:~:text=To%20map%20a%20URL%20to,element.
}
