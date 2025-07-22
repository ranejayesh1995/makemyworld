package com.example.makemyworld;
import org.springframework.web.bind.annotation. GetMapping;
import org. springframework.web.bind. annotation. RestController;

@RestController
public class cruise {
    @GetMapping ("/cruise")
    public String getData(){
        return "Book your cruise from Mumbai to Pune !! ";

    }
}

