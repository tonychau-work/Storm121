package com.job.storm121.repositories;


import com.job.storm121.model.Video;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VideoRepository extends CrudRepository<Video, Long> {
    List<Video> findAll();
}
