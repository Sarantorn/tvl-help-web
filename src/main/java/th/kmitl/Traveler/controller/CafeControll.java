package th.kmitl.Traveler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.kmitl.Traveler.sevice.PlaceService;

@Controller
@RequestMapping("/Cafe")
public class CafeControll {

    private final PlaceService placeService;

    public CafeControll(PlaceService placeService) {
        this.placeService = placeService;
    }

    @GetMapping
    public String getRestaurantpage(Model model) {
        model.addAttribute("allPlace", placeService.getCafe());
        return "Cage";
    }

}
