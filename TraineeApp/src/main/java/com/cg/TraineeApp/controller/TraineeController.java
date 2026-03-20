package com.cg.TraineeApp.controller;

import com.cg.TraineeApp.dto.TraineeDTO;
import com.cg.TraineeApp.entity.Trainee;
import com.cg.TraineeApp.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TraineeController {
    @Autowired
    TraineeService traineeService;

    @GetMapping("/trainee")
    public ResponseEntity<List<TraineeDTO>> getAllTrainee(){
        List<TraineeDTO> t = traineeService.getAllTrainee();
        return new ResponseEntity<List<TraineeDTO>>(t, HttpStatus.OK);
    }

    @GetMapping("/trainee/{name}")
    public ResponseEntity<List<TraineeDTO>> getTraineeByName(@PathVariable String name){
        List<TraineeDTO> t = traineeService.getTraineeByName(name);
        if(t!=null){
            return new ResponseEntity<List<TraineeDTO>>(t, HttpStatus.OK);
        }else {
            return new ResponseEntity("Employee not found", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/trainee/id/{id}")
    public ResponseEntity<TraineeDTO> getTraineeById(@PathVariable int id){
        TraineeDTO t = traineeService.getTaineeById(id);
        if (t!= null){
            return new ResponseEntity<TraineeDTO>(t, HttpStatus.OK);
        }else {
            return new ResponseEntity("Trainee not found", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/trainee/delete/{id}")
    public ResponseEntity deleteTraineeById(@PathVariable int id){
        String message = traineeService.deleteTraineeById(id);
        return new ResponseEntity(message, HttpStatus.OK);
    }

    @PutMapping("/trainee/update")
    public ResponseEntity<TraineeDTO> updateTrainee(@RequestBody TraineeDTO t){
        TraineeDTO t1 = traineeService.updateTrainee(t);
        if(t1 != null){
            return new ResponseEntity<TraineeDTO>(t1, HttpStatus.OK);
        }else {
            return new ResponseEntity("Trainee not exist", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/trainee")
    public TraineeDTO createTrainee(@RequestBody TraineeDTO t){
            return traineeService.insertTrainee(t);
    }

}
