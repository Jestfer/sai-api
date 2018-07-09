package com.example.saiapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {

   @Autowired
   private TopicService topicService; // Dependency injection

   @RequestMapping("/topics")
   public List<Topic> getAllTopics() {
      return topicService.getAllTopics();
   }

   @RequestMapping("/topics/{id}")
   public Optional<Topic> getTopic(@PathVariable Integer id) {
      return topicService.getTopic(id);
   }

   @RequestMapping(method = RequestMethod.POST, value = "/topics")
   public void addTopic(@RequestBody Topic topic) {
      topicService.addTopic(topic);
   }

   @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
   public void updateTopic(@RequestBody Topic topic, @PathVariable Integer id) {
      topicService.updateTopic(id, topic);
   }

   @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
   public void deleteTopic(@PathVariable Integer id) {
      topicService.deleteTopic(id);
   }
}
