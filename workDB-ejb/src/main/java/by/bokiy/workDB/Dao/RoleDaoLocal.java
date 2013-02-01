package by.bokiy.workDB.Dao;

import by.bokiy.workDB.Entity.Role;


public interface RoleDaoLocal {
	
	public void create(Role entity);
	public void remove(Role entity);
	public Role find(Object id);

}
