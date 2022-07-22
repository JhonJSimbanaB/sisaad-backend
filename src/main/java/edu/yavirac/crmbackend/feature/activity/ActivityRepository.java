package edu.yavirac.crmbackend.feature.activity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ActivityRepository extends CrudRepository<Activity , Long> {
    
    List<Activity> findAll();

}

