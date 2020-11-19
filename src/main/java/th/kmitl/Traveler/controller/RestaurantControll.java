package th.kmitl.Traveler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestaurantControll {
    @RequestMapping("/Restaurant")
    public String getRestaurantPage(){
        return "Restaurant";
    }
}
