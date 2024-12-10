package ch18.com.controller;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher; // javax.servlet....
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import ch18.com.model.LoginBean;
import ch18.com.model.loginBean;


public class ControllerServlet extends HttpServlet {
	
	private static final long serialVerionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) {
		throws ServletException, IOException {
		
		res.setContentType("text/html; charset=utf-8");
		String id = req.getParameter("id");
		String pw = req.getParameter("password");
		
		loginBean bean = new LoginBean();
		bean.setId(id);
		bean.setPassword(pw);
		req.setAttrivute("bean", bean);
		
		boolean status = bean.validate();
		
		
		if (status) { 
			RequestDispatcher rd = req.getRequestDispatcher("mvc_success.jsp");
			rd.forward(req, res);
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("mvc_error.jsp");
			rd.forward(req, res);
		}
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpSercetResponse res)
		throws ServletException, IOException {
			doPost(req, res);
	}

}
