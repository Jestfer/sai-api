package com.example.saiapi.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Integer> {

   // method to run a query and get all courses for a topicId
   public List<Course> findByTopicId(Integer topicId);

   // method to filter by name... custom but JPA helps with it
   public List<Course> findByName(String name);
}
