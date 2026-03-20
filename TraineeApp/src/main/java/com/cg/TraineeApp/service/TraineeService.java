package com.cg.TraineeApp.service;

import com.cg.TraineeApp.dto.EntityMapper;
import com.cg.TraineeApp.dto.TraineeDTO;
import com.cg.TraineeApp.entity.Trainee;
import com.cg.TraineeApp.repo.TraineJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TraineeService implements ITraineeService {

    @Autowired
    private TraineJpaRepository repo;

    @Override
    public List<TraineeDTO> getAllTrainee() {
        List<Trainee> t = repo.findAll();
        List<TraineeDTO> trainees = new ArrayList<>();
        t.forEach(e->trainees.add(EntityMapper.toDTO(e)));
        return trainees;
    }

    @Override
    public List<TraineeDTO> getTraineeByName(String name) {
        List<Trainee> t = repo.findByTraineeName(name);
        List<TraineeDTO> trainees = new ArrayList<>();
        t.forEach(e->trainees.add(EntityMapper.toDTO(e)));
        return trainees;
    }

    @Override
    public TraineeDTO getTaineeById(int Id) {
        Trainee t = repo.findById(Id).orElse(null);
        TraineeDTO trainee = EntityMapper.toDTO(t);
        return trainee;
    }

    @Override
    public String deleteTraineeById(int Id) {
        Trainee t = repo.findById(Id).orElse(null);
        if (t != null) {
            repo.deleteById(Id);
            return "Deleted";
        } else {
            return "Trainee not exist";
        }
    }

    @Override
    public TraineeDTO updateTrainee(TraineeDTO t) {
        Trainee t1 = repo.findById(t.getTraineeId()).orElse(null);
        if (t1 != null) {
            repo.saveAndFlush(EntityMapper.toEntity(t));
            return t;
        } else {
            return null;
        }
    }

    @Override
    public TraineeDTO insertTrainee(TraineeDTO dto) {
            Trainee t = repo.save(EntityMapper.toEntity(dto));
            return EntityMapper.toDTO(t);
        }
}