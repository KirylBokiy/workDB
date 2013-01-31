package by.bokiy.workDB.Dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import by.bokiy.workDB.Entity.User;

@Stateless
public class UserDao extends AbstractFacade<User> implements UserDaoLocal  {
	
	
	protected UserDao(Class<User> entity) {
		super(entity);
		// TODO Auto-generated constructor stub
	}

	@PersistenceContext(name = "ejb")
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

	

}
