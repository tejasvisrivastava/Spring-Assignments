package com.capg.springjpa.service;

import java.util.List;

import com.capg.springjpa.entities.Trainee;

public interface TraineeService {
	Trainee newTrainer(Trainee trainee);
	Trainee retrieveTrainee(int id);
	void traineeDelete(int id);
	 Trainee findTrainee(int traineeId);
	  void modifyTrainee(Trainee t);
	   List<Trainee> getAllTrainee();
}
