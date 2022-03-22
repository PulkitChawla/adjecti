package com.adj.oexam;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface RequestHandler  {
	public String doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException ;
}
