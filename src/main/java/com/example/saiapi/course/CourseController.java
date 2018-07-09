package com.example.saiapi.course;

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

   @RequestMapping(method = RequestMethod.POST, value = "/courses")
   public void addCourse(@RequestBody Course topic) {
      courseService.addCourse(topic);
   }

   @RequestMapping(method = RequestMethod.PUT, value = "/courses/{id}")
   public void updateCourse(@RequestBody Course topic, @PathVariable Integer id) {
      courseService.updateCourse(id, topic);
   }

   @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
   public void deleteCourse(@PathVariable Integer id) {
      courseService.deleteCourse(id);
   }
}
