package com.capg.mvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capg.mvc.entities.Trainee;
@Repository
public class TraineeRepositoryImpl implements TraineeRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		entityManager.persist(trainee);
		return trainee;
	}

	@Override
	public Trainee getTrainee(int id) {
		Trainee trainee=entityManager.find(Trainee.class,id);
		return trainee;
	}

	@Override
	public void delete(int id) {
		Trainee trainee=entityManager.find(Trainee.class, id);
		entityManager.remove(trainee);
	}

	@Override
	public Trainee findId(int traineeId) {
		Trainee t=entityManager.find(Trainee.class, traineeId);
		return t;
	}
	@Override
	public void modify(Trainee trainee) {
		entityManager.merge(trainee);
	}
	@Override
	public List<Trainee> findAll() {
		Query query = entityManager.createQuery("select t from Trainee t", Trainee.class);
		List<Trainee> allTrainee = query.getResultList();
		return allTrainee;
	}

	
}
