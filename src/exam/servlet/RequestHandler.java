package exam.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface RequestHandler 
{
	public String doProcess(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException;
}
