package com.music.streaming.platform.controller;

import com.music.streaming.platform.dto.PlayListRequest;
import com.music.streaming.platform.model.PlayList;
import com.music.streaming.platform.service.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/music/platform/v1/playlists")
public class PlayListController {
    @Autowired
    PlayListService pls ;

    @PostMapping
    public ResponseEntity<PlayList> createPlayList(@RequestBody PlayListRequest playListRequest){
        PlayList p = pls.createPlayList(playListRequest);
        return new ResponseEntity<>(p, HttpStatus.OK);

    }
    @GetMapping("/{artistId}")
    public PlayList getPlayLisyById(@PathVariable Long artistId){
        PlayList p = pls.getPlayListById(artistId);
        return p;
    }
    @DeleteMapping("/{artistId}")
    public ResponseEntity deletePlayList(@PathVariable Long artistId){
        pls.deletePlayList(artistId);
        return new ResponseEntity("NO Content", HttpStatus.NO_CONTENT);

    }
}
