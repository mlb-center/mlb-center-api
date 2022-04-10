package com.rubenleerentveld.mlbcenter.Controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class StatisticsController {

    @RequestMapping("/Teams")
    public ResponseEntity<?> get(){
        return new ResponseEntity<>("NYY, CAR", HttpStatus.OK);
    }
    
}
