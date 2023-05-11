package it.step.advanced;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@GetMapping("/root")
    public String admin(){
    return "root";
    }

    @GetMapping("/user")
    public String user(){
        return "user";
    }

    @GetMapping("/root/1")
    public String root1(){
        return "root1";
    }


    @GetMapping("/guest")
    public String guest(){
        return "guest";
    }

    @GetMapping("/common")
    public String common(){
        return "common";
    }
}
