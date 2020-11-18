package th.kmitl.Traveler.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Placerepository extends JpaRepository<Place, Long> {

}