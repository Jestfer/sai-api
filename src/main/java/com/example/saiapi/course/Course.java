package com.example.saiapi.course;

import com.example.saiapi.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // JPA knows how to create a table called "topic" with 3 columns
public class Course {

   @Id // Primary Key
   private Integer id;
   private String name; // Pass if VARCHAR, length...
   private String description;

   private Topic topic;

   public Topic getTopic() {
      return topic;
   }

   public void setTopic(Topic topic) {
      this.topic = topic;
   }

   // The object is easier to initialize with a no-args constructor
   public Course() {
   }

   public Course(Integer id, String name, String description, Integer topicId) {
      this.id = id;
      this.name = name;
      this.description = description;
      this.topic = new Topic(topicId, "", "");
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
