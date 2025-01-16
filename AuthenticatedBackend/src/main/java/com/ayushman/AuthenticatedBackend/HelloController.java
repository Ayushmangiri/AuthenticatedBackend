package com.ayushman.AuthenticatedBackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class HelloController {
    // public static HelloController greet()
        @GetMapping ("/")
        public String greet(){
            return "Hello , Welcome to Ayushman.com";
        
        }
    }
