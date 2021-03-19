package com.job.storm121.services;

import com.job.storm121.model.LandingPage;
import com.job.storm121.model.Video;
import com.job.storm121.repositories.LandingPageRepository;
import com.job.storm121.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class LandingPageService {
    private final LandingPageRepository landingPageRepository;
    private final VideoRepository videoRepository;

    @Autowired
    public LandingPageService(LandingPageRepository landingPageRepository, VideoRepository videoRepository) {
        this.landingPageRepository = landingPageRepository;
        this.videoRepository = videoRepository;
    }

    public List<LandingPage> findAll() {
        return landingPageRepository.findAll();
    }

    public List<Video> findAllVideoByLandingPage(long landingPageId) {
        return landingPageRepository.findById(landingPageId).orElseThrow().getVideos();
    }
}
