package com.example.saiapi.course;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
   // getAllTopics()
   // getTopic(String id)
   // updateTopic(Course t)
   // deleteTopic(String id)
}
