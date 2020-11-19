package th.kmitl.Traveler.sevice;

import org.springframework.data.jpa.repository.Query;
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

    public List<Place> getTemple(){
        return repository.findByCategory("วัด");
    }


    public List<Place> getRest(){return  repository.findByCategory("ร้านอาหาร");}

    public List<Place> getCafe(){return  repository.findByCategory("คาเฟ่");}

    public List<Place> getNature(){return  repository.findByCategory("ธรรมชาติ");}

    public List<Place> getHotel(){return  repository.findByCategory("ที่พัก");}





}


