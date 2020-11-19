package th.kmitl.Traveler.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Placerepository extends JpaRepository<Place, Long> {

    @Query(value = "SELECT * FROM PLACE WHERE category = :category",nativeQuery = true)
    List<Place> findByCategory(@Param("category") String Category);

}