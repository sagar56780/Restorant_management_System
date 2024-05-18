package model.dao;
import javax.persistence.RollbackException;

import org.springframework.stereotype.Component;

import model.entity.Users;

@Component
public class SignUpDao extends HibernateDao {
	
	public boolean signup(Users user) throws RollbackException 
	{
	
		et.begin();
		em.persist(user);
		
		et.commit();
		
		return true;
		
	
		
		
		
		 
		
	}
	
	

}
