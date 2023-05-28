package dao;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import dto.Admin_dto;

public class Admin_dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");

	public void save(Admin_dto student) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		entityManager.close();
	}

	public List<Admin_dto> findAll() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		TypedQuery<Admin_dto> query = entityManager.createQuery("SELECT s FROM Admin_dto s", Admin_dto.class);
		return query.getResultList();
	}

	public void update(Admin_dto student) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();

	}

	public Optional<Admin_dto> findByUSN(int usn) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			Admin_dto student = entityManager
					.createQuery("SELECT s FROM Admin_dto s WHERE s.universitySeatNumber = :usn", Admin_dto.class)
					.setParameter("usn", usn).getSingleResult();
			return Optional.ofNullable(student);
		} catch (NoResultException e) {
			return Optional.empty();
		} finally {
			entityManager.close();
		}
	}

	public void deleteByUSN(int usn) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		Admin_dto student = entityManager.find(Admin_dto.class, usn);

		if (student != null) {
			entityManager.remove(student);
		}

		entityTransaction.commit();
		entityManager.close();
	}

	public Admin_dto check(int usn) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Admin_dto.class, usn);
	}

	public Admin_dto find(int usn, Date dob) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		return entityManager.createQuery("select s from Admin_dto s where s.universitySeatNumber = ?1 and s.dob = ?2",
				Admin_dto.class).setParameter(1, usn).setParameter(2, dob).getSingleResult();
	}

}
