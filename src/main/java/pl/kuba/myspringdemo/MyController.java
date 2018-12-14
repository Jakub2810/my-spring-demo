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

    @GetMapping("/me")
    public String me(Model model){
        model.addAttribute("name","Jakub");
        model.addAttribute("surname","Barszczyk");

        return "me";
    }

    @GetMapping("/car")
    public String myFavoriteCar(Model model){

        model.addAttribute("branch", "saab");
        model.addAttribute("model", "93");

        return "car";
    }
}
