package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
@SpringBootApplication
public class MyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProjectApplication.class, args);
    }

    @RequestMapping("/doctor/{id}")
    @ResponseBody
    public Doctor hello(@PathVariable Integer id) {

        if (id >=  9 && id <= 13){
            String name = "";
            switch(id) {
                case 9 :
                    name= "William Hartnell";
                    break;
                case 10:
                    name= "Patrick Troughton";
                    break;
                case 11:
                    name = "Jon Pertwee";
                    break;
                case 12:
                    name = "Tom Baker";
                    break;
                case 13:
                    name = "Peter Davison";
            }
            return new Doctor(name,id);
        }
        if (id >= 1 && id <= 8){
            throw new ResponseStatusException(HttpStatus.SEE_OTHER, "See Other");
        }
        else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Question Not Found");
        }
    }
}