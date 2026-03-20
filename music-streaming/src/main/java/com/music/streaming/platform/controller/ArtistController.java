package com.music.streaming.platform.controller;

import com.music.streaming.platform.dto.ArtistRequest;
import com.music.streaming.platform.model.Artist;
import com.music.streaming.platform.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music/platform/v1/artists")
public class ArtistController {
    @Autowired
    ArtistService artistService;
    @PostMapping
    public ResponseEntity<Artist> createArtist(@RequestBody ArtistRequest artistRequest){
        Artist a = artistService.createArtist(artistRequest);
        return new ResponseEntity<>(a, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Artist>> getAllArtist(){
        List<Artist> list = artistService.getAllArtists();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{artistId}")
    public ResponseEntity<Artist> getArtistById(Long ArtistId){
        Artist a = artistService.getArtistById(ArtistId);
        return new ResponseEntity<>(a, HttpStatus.OK);
    }

    @PutMapping("/{artistId}")
    public ResponseEntity<Artist> updateArtistById(Long artistId, ArtistRequest artistRequest){
        Artist a = artistService.updateArtist(artistId, artistRequest);
        return new ResponseEntity<>(a, HttpStatus.OK);
    }

    @DeleteMapping("/{artistId}")
    public ResponseEntity<Artist> deleteArtist(Long Id){
        return new ResponseEntity("No Content", HttpStatus.NO_CONTENT);
    }
}
