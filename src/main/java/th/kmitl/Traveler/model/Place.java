package th.kmitl.Traveler.model;

import javax.persistence.*;
@Entity
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String place_name;
    private String linkmap;
    private String linkimg;
    private String category;
    private String description;

    public Place() {
    }

    public Place(String place_name, String linkmap, String linkimg, String category,String description) {
        this.place_name = place_name;
        this.linkmap = linkmap;
        this.linkimg = linkimg;
        this.category = category;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLinkmap() {
        return linkmap;
    }

    public void setLinkmap(String linkmap) {
        this.linkmap = linkmap;
    }

    public String getLinkimg() {
        return linkimg;
    }

    public void setLinkimg(String linkimg) {
        this.linkimg = linkimg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
