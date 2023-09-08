package com.activity.activities;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activity.model.Activity;
import com.activity.service.ActivityService;

@RestController
@RequestMapping("/activity")
public class ActivityResource {
	private final ActivityService activityService;

	public ActivityResource(ActivityService activityService) {
		this.activityService = activityService;
	}
	
	@GetMapping
	public ResponseEntity<List<Activity>> getAllActivities() {
		List<Activity> activities = activityService.findAllActivities();
		return new ResponseEntity<>(activities, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Activity> getActivityById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(activityService.findById(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteActivityById(@PathVariable("id") Long id) {
		activityService.removeActivity(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Activity> createActivity(@RequestBody Activity activity) {
		return new ResponseEntity<>(activityService.addActivity(activity), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateActivity(@RequestBody Activity activity) {
		return new ResponseEntity<>(activityService.updateActivity(activity), HttpStatus.OK);
	}

}
