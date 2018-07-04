package com.example.saiapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

   @Autowired
   private TopicRepository topicRepository; // Injects an instance of the topicRepository to the service

   public List<Topic> getAllTopics() {
      List<Topic> topics = new ArrayList<>();
      topicRepository.findAll() // returns an iterable, so we need to iterate and add each one to topics
      .forEach(topics::add); // Lambdas

      return topics;
   }

   public Topic getTopic(Integer id) {
      return topicRepository.findOne(id);
   }

   public void addTopic(Topic topic) {
      topicRepository.save(topic);
   }

   public void updateTopic(Integer id, Topic topic) {
      topicRepository.save(topic); // topic instance knows which ID it is if row exists... so we just update it
   }

   public void deleteTopic(Integer id) {
      topicRepository.delete(id);
   }
}
