package com.music.streaming.platform.controller;

import com.music.streaming.platform.dto.TrackRequest;
import com.music.streaming.platform.model.Track;
import com.music.streaming.platform.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music/platform/v1/tracks")
public class TrackController {
    @Autowired
    TrackService trackService;

    @PostMapping
    public ResponseEntity<Track> createTrack(@RequestBody TrackRequest trackRequest){
        Track t = trackService.createTrack(trackRequest);
        return new ResponseEntity<>(t, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Track>> getAllTracks(){
        List<Track> list = trackService.getAllTracks();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @GetMapping("/{trackId}")
    public ResponseEntity<Track> getTrackById(@PathVariable Long trackId){
        Track t = trackService.getTrackById(trackId);
        return new ResponseEntity<>(t, HttpStatus.OK);
    }
    @PutMapping("/{trackId}")
    public ResponseEntity<Track> updateTrack(@PathVariable Long trackId, @RequestBody TrackRequest trackRequest){
        Track t = trackService.updateTrack(trackId, trackRequest);
        return new ResponseEntity<>(t, HttpStatus.OK);
    }
    @DeleteMapping("/{trackId}")
    public ResponseEntity deleteTrack(@PathVariable Long trackId){
        trackService.deleteTrack(trackId);
        return new ResponseEntity("No Content", HttpStatus.NO_CONTENT);
    }
}
