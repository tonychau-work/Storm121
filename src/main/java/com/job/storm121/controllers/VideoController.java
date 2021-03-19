package com.job.storm121.controllers;

import com.job.storm121.model.Video;
import com.job.storm121.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/video")
public class VideoController {
    private final VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @CrossOrigin
    @GetMapping("/all")
    public ResponseEntity<List<Video>> fetchAll() {
        List<Video> videos = videoService.findAll();
        return new ResponseEntity<>(videos, HttpStatus.OK);
    }
}
