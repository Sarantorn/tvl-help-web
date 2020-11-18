package th.kmitl.Traveler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControll {

    @RequestMapping("/home")
    public String getHomePage() {
        return "home";
    }
}
