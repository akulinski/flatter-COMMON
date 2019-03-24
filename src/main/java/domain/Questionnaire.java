package domain;


import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Questionnaire.
 */

@Data
public class Questionnaire implements Serializable {

    private static final long serialVersionUID = 1L;
    

    private Long id;

    private Boolean pets;

    private Boolean smokingInside;

    private Boolean isFurnished;

    private Integer roomAmountMin;

    private Integer roomAmountMax;

    private Double sizeMin;

    private Double sizeMax;

    private Integer constructionYearMin;

    private Integer constructionYearMax;

    private String type;

    private Double totalCostMin;

    private Double totalCostMax;

    private User user;

    public Questionnaire() {

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getPets() {
        return pets;
    }

    public void setPets(Boolean pets) {
        this.pets = pets;
    }

    public Boolean getSmokingInside() {
        return smokingInside;
    }

    public void setSmokingInside(Boolean smokingInside) {
        this.smokingInside = smokingInside;
    }

    public Boolean getFurnished() {
        return isFurnished;
    }

    public void setFurnished(Boolean furnished) {
        isFurnished = furnished;
    }

    public Integer getRoomAmountMin() {
        return roomAmountMin;
    }

    public void setRoomAmountMin(Integer roomAmountMin) {
        this.roomAmountMin = roomAmountMin;
    }

    public Integer getRoomAmountMax() {
        return roomAmountMax;
    }

    public void setRoomAmountMax(Integer roomAmountMax) {
        this.roomAmountMax = roomAmountMax;
    }

    public Double getSizeMin() {
        return sizeMin;
    }

    public void setSizeMin(Double sizeMin) {
        this.sizeMin = sizeMin;
    }

    public Double getSizeMax() {
        return sizeMax;
    }

    public void setSizeMax(Double sizeMax) {
        this.sizeMax = sizeMax;
    }

    public Integer getConstructionYearMin() {
        return constructionYearMin;
    }

    public void setConstructionYearMin(Integer constructionYearMin) {
        this.constructionYearMin = constructionYearMin;
    }

    public Integer getConstructionYearMax() {
        return constructionYearMax;
    }

    public void setConstructionYearMax(Integer constructionYearMax) {
        this.constructionYearMax = constructionYearMax;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getTotalCostMin() {
        return totalCostMin;
    }

    public void setTotalCostMin(Double totalCostMin) {
        this.totalCostMin = totalCostMin;
    }

    public Double getTotalCostMax() {
        return totalCostMax;
    }

    public void setTotalCostMax(Double totalCostMax) {
        this.totalCostMax = totalCostMax;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Questionnaire{" +
                "id=" + id +
                ", pets=" + pets +
                ", smokingInside=" + smokingInside +
                ", isFurnished=" + isFurnished +
                ", roomAmountMin=" + roomAmountMin +
                ", roomAmountMax=" + roomAmountMax +
                ", sizeMin=" + sizeMin +
                ", sizeMax=" + sizeMax +
                ", constructionYearMin=" + constructionYearMin +
                ", constructionYearMax=" + constructionYearMax +
                ", type='" + type + '\'' +
                ", totalCostMin=" + totalCostMin +
                ", totalCostMax=" + totalCostMax +
                ", user=" + user +
                '}';
    }
}
