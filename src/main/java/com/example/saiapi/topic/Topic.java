package com.example.saiapi.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // JPA knows how to create a table called "topic" with 3 columns
public class Topic {

   @Id // Primary Key
   private Integer id;
   private String name;
   private String description;

   // The object is easier to initialize with a no-args constructor
   public Topic() {
   }

   public Topic(Integer id, String name, String description) {
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
