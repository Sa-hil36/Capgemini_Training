package com.cg.TraineeApp.service;

import com.cg.TraineeApp.dto.TraineeDTO;
import com.cg.TraineeApp.entity.Trainee;

import java.util.List;

public interface ITraineeService {
    public List<TraineeDTO> getAllTrainee();
    public List<TraineeDTO> getTraineeByName(String name);
    public TraineeDTO getTaineeById(int Id);
    public String deleteTraineeById(int Id);
    public TraineeDTO updateTrainee(TraineeDTO t);
    public TraineeDTO insertTrainee(TraineeDTO t);
}
