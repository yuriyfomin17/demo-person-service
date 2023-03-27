package com.example.demopersonservice;

import com.example.demopersonservice.dto.Person;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
@Slf4j
@RequiredArgsConstructor
public class Controller {
    private final PersonService personService;
    @PostMapping
    public void changePerson(@RequestBody Person person){
        personService.updatePerson(person);

    }
}
