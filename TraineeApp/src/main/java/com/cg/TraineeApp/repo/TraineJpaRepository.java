package com.cg.TraineeApp.repo;

import com.cg.TraineeApp.entity.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TraineJpaRepository extends JpaRepository<Trainee, Integer> {
    public List<Trainee> findByTraineeName(String name);
}
