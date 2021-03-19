package com.job.storm121.controllers;

import com.job.storm121.model.LandingPage;
import com.job.storm121.model.Video;
import com.job.storm121.services.LandingPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/landingpage")
public class LandingPageController {
    private final LandingPageService landingPageService;

    @Autowired
    public LandingPageController(LandingPageService landingPageService) {
        this.landingPageService = landingPageService;
    }

    @CrossOrigin
    @GetMapping("/all")
    public ResponseEntity<List<LandingPage>> fetchAll() {
        List<LandingPage> landingPages = landingPageService.findAll();
        return new ResponseEntity<>(landingPages, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/videos/{landingPageId}")
    public ResponseEntity<List<Video>> fetchVideosByLandingPage(@PathVariable long landingPageId) {
        List<Video> videos = landingPageService.findAllVideoByLandingPage(landingPageId);
        return new ResponseEntity<>(videos, HttpStatus.OK);
    }
}
