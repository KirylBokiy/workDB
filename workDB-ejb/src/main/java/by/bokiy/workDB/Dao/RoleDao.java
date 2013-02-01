package by.bokiy.workDB.Dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import by.bokiy.workDB.Entity.Role;

@Stateless
public class RoleDao extends AbstractFacade<Role> implements RoleDaoLocal {
	
	@PersistenceContext(unitName = "ejb")
	private EntityManager em;
	
	RoleDao(Class<Role> entity){
		super(entity);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
