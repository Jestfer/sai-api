package com.example.saiapi.course;

import com.example.saiapi.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "course")
public class Course {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(columnDefinition = "serial")
   private Integer id;
   private String name; // Pass if VARCHAR, length...
   private String description;

   @ManyToOne
   private Topic topic;

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

   public Topic getTopic() {
      return topic;
   }

   public void setTopic(Topic topic) {
      this.topic = topic;
   }
}
