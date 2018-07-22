package com.example.saiapi.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

   @Autowired
   private CourseService courseService; // Dependency injection

   @RequestMapping("/courses")
   public List<Course> getAllTopics() {
      return courseService.getAllCourses();
   }

   @RequestMapping("/courses/{id}")
   public Optional<Course> getTopic(@PathVariable Integer id) {
      return courseService.getCourse(id);
   }

   @RequestMapping(method = RequestMethod.POST, value = "/courses")
   public void addTopic(@RequestBody Course course) {
      courseService.addCourse(course);
   }

   @RequestMapping(method = RequestMethod.PUT, value = "/courses/{id}")
   public void updateTopic(@RequestBody Course course, @PathVariable Integer id) {
      courseService.updateCourse(id, course);
   }

   @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
   public void deleteTopic(@PathVariable Integer id) {
      courseService.deleteCourse(id);
   }
}
