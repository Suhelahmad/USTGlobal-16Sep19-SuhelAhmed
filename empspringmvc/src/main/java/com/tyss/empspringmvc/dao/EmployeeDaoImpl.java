package com.tyss.empspringmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;


import org.springframework.stereotype.Repository;
import com.tyss.empspringmvc.dto.EmployeeBean;
@Repository
public class EmployeeDaoImpl implements EmployeeDAO {
@PersistenceUnit
	private EntityManagerFactory factory ;

	public EmployeeBean login(int id, String password) {

		String query = "from EmployeeBean where id=:id and password=:password";
		EntityManager entityManager = factory.createEntityManager();
		TypedQuery<EmployeeBean> q = entityManager.createQuery(query, EmployeeBean.class);
		q.setParameter("id", id);
		q.setParameter("password", password);
		try {
			EmployeeBean bean = q.getSingleResult();
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public int register(EmployeeBean bean) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		try {

			entityManager.persist(bean);
			entityTransaction.commit();
			return bean.getId();

		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		
	}

	public boolean deleteEmployee(int id) {

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		
			EmployeeBean bean = entityManager.find(EmployeeBean.class, id);
			entityManager.remove(bean);
			entityTransaction.commit();
			return true;
		
			
		
		
		
	}

	public EmployeeBean searchEmployee(int id) {
		EntityManager entityManager = factory.createEntityManager();
		return entityManager.find(EmployeeBean.class, id);

	}

	public boolean updateEmployee(EmployeeBean bean) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		EmployeeBean employeeBean = entityManager.find(EmployeeBean.class, bean.getId());
		employeeBean.setName(bean.getName());
		employeeBean.setGender(bean.getGender());
		employeeBean.setPassword(bean.getPassword());
		employeeBean.setDoj(bean.getDoj());
		entityTransaction.commit();

		return true;
	}

	public boolean changePassword(int id, String password) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		EmployeeBean bean = entityManager.find(EmployeeBean.class, id);
		bean.setPassword(password);
		entityTransaction.commit();
		return true;
	}

}
