package com.example.saiapi.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Integer> {
   // getAllTopics()
   // getTopic(String id)
   // updateTopic(Topic t)
   // deleteTopic(String id)
}
