package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MenuControllerr {
	@PostMapping("/menu")
	public void menu(HttpServletRequest req,HttpServletResponse resp)
	{
		try {
			PrintWriter pw=resp.getWriter();
			
		  Cookie[] cookies= req.getCookies();
		
			for(Cookie c:cookies)
			{
				String userp=c.getName();
			String value=	c.getAttribute("userpwd");
				System.out.println(userp);
				if(userp.equals("userpwd"))
				{
					pw.print("welcome");
					
				}
				else
				{
					pw.print("login again");
					return;
					
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
