package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Studentdetails;;

public class Studentdao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void save(Studentdetails student)
	{
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}
	public Studentdetails fetch(String name)
	{
		
		List<Studentdetails> list=entityManager.createQuery("select x from Studentdetails x where name=?1").setParameter(1, name).getResultList();
		if(list.isEmpty())
		{
			return null;
		}
		else
		{
			return list.get(0);
		}
	}
	public Studentdetails fetch(int id) {
		List<Studentdetails> list=entityManager.createQuery("select x from Studentdetails x where id=?1").setParameter(1, id).getResultList();
		if(list.isEmpty())
		{
			return null;
		}
		else
		{
			return list.get(0);
		}
	}
	public List<Studentdetails> fetch()
	{
		List<Studentdetails> list=entityManager.createQuery("select x from Studentdetails x ").getResultList();
		return list;
	}
	public void update(Studentdetails student)
	{
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
	}
	public void delete(int id) {
		entityTransaction.begin();
		entityManager.remove(entityManager.find(Studentdetails.class, id));
		entityTransaction.commit();
		
	}
}