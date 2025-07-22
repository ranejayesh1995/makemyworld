package com.example.makemyworld;
import org.springframework.web.bind.annotation. GetMapping;
import org. springframework.web.bind. annotation. RestController;


@RestController
public class yatch {
    @GetMapping ("/yatch")
    public String getData(){
        return "Book your yatch from Mumbai to Pune !! ";

    }
}
