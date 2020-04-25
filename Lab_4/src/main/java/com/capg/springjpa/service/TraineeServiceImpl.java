package com.capg.springjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springjpa.entities.Trainee;
import com.capg.springjpa.repos.TraineeRepository;

@Service
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	private TraineeRepository traineeRepository;

	@Override
	public Trainee newTrainer(Trainee trainee) {
		return traineeRepository.addTrainee(trainee);
	}

	@Override
	public Trainee retrieveTrainee(int id) {
		return traineeRepository.getTrainee(id);
	}



	@Override
	public void traineeDelete(int id) {
		
			Trainee savedTrainee=traineeRepository.findId(id);
			if(savedTrainee!=null) {
				traineeRepository.delete(id);
			}
		
		
	}

	@Override
	public Trainee findTrainee(int traineeId) {
		Trainee savedTrainee=traineeRepository.findId(traineeId);
		return savedTrainee;
	}
	@Override
	public void modifyTrainee(Trainee t) {
		Trainee savedTrainee=traineeRepository.findId(t.getTraineeId());
		if(savedTrainee!=null) {
			traineeRepository.modify(t);
		}
	}
	
	@Override
	public List<Trainee> getAllTrainee() {
		return traineeRepository.findAll();
	}
	
}
