package umu.tds.apps.AppMusic.repository;

import org.hibernate.SessionFactory;

import umu.tds.apps.AppMusic.model.User;

public class UserRepository extends AbstractRepository<User>{
	public UserRepository(SessionFactory sessionFactory, Class<User> entityType) {
		super(sessionFactory, entityType);
	}
}
