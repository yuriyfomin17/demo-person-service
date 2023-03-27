package com.example.demopersonservice;

import com.example.demopersonservice.dto.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final StreamBridge streamBridge;
    public void updatePerson(Person person){
        streamBridge.send("persons-topic", person);
    }
}
