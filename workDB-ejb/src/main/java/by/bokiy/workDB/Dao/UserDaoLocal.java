package by.bokiy.workDB.Dao;

import javax.ejb.Local;

import by.bokiy.workDB.Entity.User;

@Local
public interface UserDaoLocal {
	public void create(User user);
	public void remove(User user);
	public User find(Object id);

}
