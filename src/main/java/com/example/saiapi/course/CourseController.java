package com.example.saiapi.course;

import com.example.saiapi.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

   @Autowired
   private CourseService courseService; // Dependency injection

   @RequestMapping("/topics/{id}/courses")
   public List<Course> getAllCourses(@PathVariable Integer id) {
      return courseService.getAllCourses();
   }

   @RequestMapping("/topics/{topicId}/courses/{id}")
   public Optional<Course> getCourse(@PathVariable Integer id) {
      return courseService.getCourse(id);
   }

   @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
   public void addCourse(@RequestBody Course course, @PathVariable Integer topicId) {
      course.setTopic(new Topic(topicId, "", ""));
      courseService.addCourse(course);
   }

   @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
   public void updateCourse(@RequestBody Course course, @PathVariable Integer topicId, Integer id) {
      course.setTopic(new Topic(topicId, "", ""));
      courseService.updateCourse(id, course);
   }

   @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
   public void deleteCourse(@RequestBody Course course, @PathVariable Integer topicId, Integer id) {
      course.setTopic(new Topic(topicId, "", ""));
      courseService.deleteCourse(id);
   }
}
