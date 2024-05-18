package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import model.dao.SignUpDao;
import model.entity.Users;

@Component
public class Signup {
	@Autowired
	SignUpDao sdao;
	
	public boolean signUp(Users user)
	{
		return sdao.signup(user);
	}

	
	

}
