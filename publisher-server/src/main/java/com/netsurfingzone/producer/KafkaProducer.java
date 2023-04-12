package com.netsurfingzone.producer;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netsurfingzone.constant.ApplicationConstant;
import com.netsurfingzone.dto.Student;

@RestController
@RequestMapping("/produce")
public class KafkaProducer {

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;

	@PostMapping("/message")
	public String sendMessage(@RequestBody Student message) {
        String messageId = UUID.randomUUID().toString();
		try {
			kafkaTemplate.send(ApplicationConstant.TOPIC_NAME, messageId, message);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "json message sent succuessfully";
	}

}
