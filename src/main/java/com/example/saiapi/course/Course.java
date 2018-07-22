package com.example.saiapi.course;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

   @Id
   private Integer id;
   private String name; // Pass if VARCHAR, length...
   private String description;

   public Course() {
   }

   public Course(Integer id, String name, String description) {
      this.id = id;
      this.name = name;
      this.description = description;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }
}