package com.activity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.activity.model.Activity;
import com.activity.repo.ActivityRepo;

@Service
public class ActivityService {
	private final ActivityRepo activityRepo;

	public ActivityService(ActivityRepo activityRepo) {
		super();
		this.activityRepo = activityRepo;
	}
	
	public Activity addActivity(Activity activity) {
		return activityRepo.save(activity);
	}
	
	public Activity updateActivity(Activity activity) {
		return activityRepo.save(activity);
	}
	
	public List<Activity> findAllActivities() {
		return activityRepo.findAll();
	}
	
	public Activity findById(Long id) {
		Optional<Activity> o = activityRepo.findById(id);
		return o.isPresent() ? o.get() : null;
	}
	
	public void removeActivity(Long id) {
		activityRepo.deleteById(id);
	}
	
	

}
