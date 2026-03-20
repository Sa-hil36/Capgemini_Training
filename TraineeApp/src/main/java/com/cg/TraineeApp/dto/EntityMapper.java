package com.cg.TraineeApp.dto;

import com.cg.TraineeApp.entity.Trainee;

public class EntityMapper {

        public static TraineeDTO toDTO(Trainee t) {
            TraineeDTO dto = new TraineeDTO(t.getTraineeId(), t.getTraineeName(), t.getTraineeDomain(), t.getTraineeLocation());
            return dto;
        }

        public static Trainee toEntity(TraineeDTO dto) {
            Trainee t = new Trainee(dto.getTraineeName(), dto.getTraineeLocation(), dto.getTraineeDomain());
            return t;
        }
    }

