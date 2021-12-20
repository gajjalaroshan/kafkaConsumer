package com.bakkt.kafka.listener;

import org.slf4j.Logger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@ComponentScan(basePackages = "com.example")
@Slf4j
public class KafkaEventListener {

	@KafkaListener(topics = "Test-Topic", groupId="group_id")
	public void consume(String message) {
		System.out.println("Consumed message: " + message);
	}

}
