package com.activity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.activity.model.Activity;

public interface ActivityRepo extends JpaRepository<Activity, Long> {

}
