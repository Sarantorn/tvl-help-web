package th.kmitl.Traveler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TempleControll {
    @RequestMapping("/Temple")
    public String getTemplePage(){
        return "Temple";
    }
}
