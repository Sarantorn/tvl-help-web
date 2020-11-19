package th.kmitl.Traveler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.kmitl.Traveler.sevice.PlaceService;

@Controller
@RequestMapping("/Restaurant")
public class RestaurantControll {

        private final PlaceService placeService;

        public RestaurantControll(PlaceService placeService) {
            this.placeService = placeService;
        }

        @GetMapping
        public String getRestaurantpage(Model model) {
            model.addAttribute("allPlace", placeService.getRest());
            return "Restaurant";
        }
}
