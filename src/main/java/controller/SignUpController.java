package controller;



import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.RollbackException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import model.entity.Users;
import service.Signup;

@Controller
public class SignUpController {
	RequestDispatcher login;
	RequestDispatcher signup;
	PrintWriter pw;
	
	@Autowired
	Signup singupserv;
	
	@PostMapping("/signupForm")
	public void signUpform(HttpServletRequest req,ServletResponse resp)
	{
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		Users user=new Users(name,email,password);
		 login=req.getRequestDispatcher("index.jsp");
		 signup=req.getRequestDispatcher("Signup.jsp");
		try {
		 pw=resp.getWriter();
		
			if(singupserv.signUp(user))
			{
				login.forward(req, resp);
				pw.print("<script>window.alert('"+name+"' Signup successfully)");
				
			}
			
		}
		catch(RollbackException | IOException | ServletException re)
		{
			try {
				signup.include(req, resp);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
	     
		
	
	}
	

}
