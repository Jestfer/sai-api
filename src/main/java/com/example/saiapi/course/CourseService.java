package com.example.saiapi.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

   @Autowired
   private CourseRepository courseRepository; // Injects an instance of the courseRepository to the service

   public List<Course> getAllCourses() {
      List<Course> courses = new ArrayList<>();
      courseRepository.findAll() // returns an iterable, so we need to iterate and add each one to courses
      .forEach(courses::add); // Lambdas

      return courses;
   }

   public Optional<Course> getCourse(Integer id) {
      return courseRepository.findById(id);
   }

   public void addCourse(Course course) {
      courseRepository.save(course);
   }

   public void updateCourse(Integer id, Course course) {
      courseRepository.save(course); // course instance knows which ID it is if row exists... so we just update it
   }

   public void deleteCourse(Integer id) {
      courseRepository.deleteById(id);
   }
}