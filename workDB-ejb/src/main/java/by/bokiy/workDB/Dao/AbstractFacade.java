package by.bokiy.workDB.Dao;

import javax.persistence.EntityManager;

public abstract class AbstractFacade<T> {
	
	
	protected abstract EntityManager getEntityManager();
	
	private Class<T> entity;
	
	public AbstractFacade(Class<T> entity){
		this.entity  = entity;
	}
	
	public void create(T entity){
		getEntityManager().persist(entity);
		getEntityManager().flush();
	}
	
	public void remove(T entity){
		getEntityManager().remove(entity);
		getEntityManager().flush();
	}
	
	public T find (Object id ){
		return getEntityManager().find(entity, id);
	}

}
