package th.kmitl.Traveler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControll {

    @RequestMapping("/home")
    public String getHomePage(Model model)
    {
        model.addAttribute("greeting","Welcome");
        return "home";
    }
}
