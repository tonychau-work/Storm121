package com.job.storm121.repositories;

import com.job.storm121.model.LandingPage;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LandingPageRepository extends CrudRepository<LandingPage, Long> {
    List<LandingPage> findAll();
}
