package th.kmitl.Traveler.sevice;

import org.springframework.stereotype.Service;
import th.kmitl.Traveler.model.Place;
import th.kmitl.Traveler.model.Placerepository;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.mindrot.jbcrypt.BCrypt;

@Service
public class PlaceService {

    private Placerepository repository;

    public PlaceService(Placerepository repository) {
        this.repository = repository;
    }

    public List<Place> getPlace(){
        return repository.findAll();
    }



}


