package th.kmitl.Traveler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CafeControll {
     @RequestMapping("/Cafe")
    public String getCafePage(Model model){
         return "Cafe";
     }

}
