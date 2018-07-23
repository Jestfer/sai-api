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
      return courseService.getAllCourses(id);
   }

   // Course by name
   @RequestMapping("/courses/name/{name}")
   // Query parameters, not recommended for GET requests: @RequestMapping("/courses?name={name}")
   public List<Course> getCourseByName(@PathVariable String name) {
      return courseService.getCourseByName(name);
   }

   // Course by id
   @RequestMapping("/courses/id/{id}")
   public Optional<Course> getCourse(@PathVariable Integer id) {
      return courseService.getCourse(id);
   }

   @RequestMapping(method = RequestMethod.POST, value = "/courses")
   public void addCourse(@RequestBody Course course) {
      courseService.addCourse(course);
   }

   @RequestMapping(method = RequestMethod.PUT, value = "/courses/{id}")
   public void updateCourse(@RequestBody Course course, @PathVariable Integer id) {
      courseService.updateCourse(id, course);
   }

   @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
   public void deleteCourse(@PathVariable Integer id) {
      courseService.deleteCourse(id);
   }
}
