package model.dao;

import org.springframework.stereotype.Component;


import model.entity.Users;

@Component
public class LoginDao extends HibernateDao {
	
	
	public Users loginValidate(Users user)
	{ 
		
	    Users result=em.find(Users.class, user.getId());
	   
	    if(result!=null)
	    {
	    	
	    	if(result.getPassword().equals(user.getPassword())){
	    		
	    		return result;
	    	}
	    }
	    return null;
	    
	}

}
