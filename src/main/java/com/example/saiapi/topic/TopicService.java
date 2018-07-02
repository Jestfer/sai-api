package com.example.saiapi.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

   private List<Topic> topics = Arrays.asList(
      new Topic("spring", "Spring Framework", "Spring Framework Desc"),
      new Topic("java", "Core Java", "Core Java Desc"),
      new Topic("javascript", "JavaScript", "JavaScript Desc")
   );

   public List<Topic> getAllTopics() {
      return topics;
   }

   public Topic getTopic(String id) {
      return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get(); // Lambda...
   }
}
