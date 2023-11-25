package umu.tds.apps.AppMusic.repository;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import umu.tds.apps.AppMusic.NotImplementedExcepcion;

public abstract class AbstractRepository<T> {
	private final SessionFactory sessionFactory;
	private final Class<T> entityType;
	
	protected AbstractRepository(SessionFactory sessionFactory, Class<T> entityType) {
		this.sessionFactory = sessionFactory;
		this.entityType = entityType;
	}
	
	public T get(int id)
	{
		Session session = sessionFactory.openSession();
		T entity = session.get(entityType, id);
		session.close();
		return entity;
	}
	
	public Set<T> get(){
		Session session = sessionFactory.openSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<T> criteriaQuery = builder.createQuery(entityType);
		criteriaQuery.select(criteriaQuery.from(entityType));
		Set<T> objects = new TreeSet<T>(session.createQuery(criteriaQuery).getResultList());
		session.close();
		return objects;
	}
	
	public void add(T entity) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();
		session.close();
	}
	
	public void update(T updateEntity)
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			T entity = session.get(entityType, getEntityId(updateEntity));
			entity = updateEntity(entity, updateEntity);
			session.save(entity);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void delete(int id)
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		T entity = session.get(entityType, id);
		session.delete(entity);
		transaction.commit();
		session.close();
	}
	
	protected int getEntityId (T entity) throws Exception
	{
		throw new NotImplementedExcepcion();
	}
	
	protected T updateEntity(T entity, T updateEntity) throws Exception
	{
		throw new NotImplementedExcepcion();
	}

}
