package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.dao;
import dto.dto;

@WebServlet("/signup")
public class signupcontroller extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		String sname = req.getParameter("sname");
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		int psd = Integer.parseInt(pwd);
		
		dto dto = new dto();
		dto.setSname(sname);
		dto.setEmail(email);
		dto.setPwd(psd);
		
		dao dao = new dao();
		dao.signuppage(dto);
	}

}
