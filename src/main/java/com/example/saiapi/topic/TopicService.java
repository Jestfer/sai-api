package com.example.saiapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

   @Autowired
   private TopicRepository topicRepository; // Injects an instance of the topicRepository to the service

   public List<Topic> getAllTopics() {
      List<Topic> topics = new ArrayList<>();
      topicRepository.findAll()
      .forEach(topics::add); // Lambdas
      return topics;
   }

   public Optional<Topic> getTopic(String id) {
      return topicRepository.findById(id);
   }

   public void addTopic(Topic topic) {
      topicRepository.save(topic);
   }

   public void updateTopic(String id, Topic topic) {
      topicRepository.save(topic); // topic instance knows which ID it is if row exists... so we just update it
   }

   public void deleteTopic(String id) {
      topicRepository.deleteById(id);
   }
}
