package com.example.kafkaconsumerdatabase;

import com.example.kafkaconsumerdatabase.entity.BabouData;
import com.example.kafkaconsumerdatabase.repository.BabouDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {
    private static final Logger LOOGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

    public KafkaDatabaseConsumer(BabouDataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    private BabouDataRepository dataRepository;
    @KafkaListener(
            topics = "Babacar",
            groupId = "myGroup"
    )
    public void consume(String eventMessage){
        LOOGER.info(String.format("Message reçue ===> %s", eventMessage));
        BabouData babouData = new BabouData();
        babouData.setBabouEventData(eventMessage);
        dataRepository.save(babouData);
    }
}
