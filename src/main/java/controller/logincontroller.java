package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.dao;
import dto.dto;

@WebServlet("/loginup")
public class logincontroller extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		String sname = req.getParameter("sname");
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		int psd = Integer.parseInt(pwd);
		
		dao dao = new dao();
		dto d2 = dao.fetch(email);
		
		if(d2 != null) {
			if(d2.getPwd()==psd) {
//				resp.getWriter().print("welcome to home page");
				resp.sendRedirect("https://www.facebook.com");
			}
			else {
				resp.getWriter().print("enter proper password");
			}
		}
		else
		{
			resp.getWriter().print("<h1> account not found, please signup </h1><a href='signuppage.html'> click hear to sign up </a>");
		}
	}
}
