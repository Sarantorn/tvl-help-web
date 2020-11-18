package th.kmitl.Traveler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.kmitl.Traveler.model.Place;
import th.kmitl.Traveler.sevice.PlaceService;

@Controller
@RequestMapping("/place")
public class PlaceControll {

    private final PlaceService placeService;

    public PlaceControll(PlaceService placeService) {
        this.placeService = placeService;
    }

    @GetMapping
    public String getPlacepage(Model model) {
        model.addAttribute("allPlace", placeService.getCustomers());
        return "place";
    }

    @PostMapping
    public String registerCustomer(Place place, Model model){
        placeService.createPlace(place);
        model.addAttribute("allPlace", placeService.getCustomers());
        return "redirect:place";
    }
}


