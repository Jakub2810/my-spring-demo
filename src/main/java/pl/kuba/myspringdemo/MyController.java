package pl.kuba.myspringdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class MyController {

    @GetMapping({"/","/home"})
    public String welcome(){
        return "welcome";
    }
}
