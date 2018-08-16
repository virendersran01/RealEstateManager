package com.diegomfv.android.realestatemanager.data.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;
import java.util.List;

/**
 * Created by Diego Fajardo on 05/08/2018.
 */

@Entity (tableName = "realstate")
public class RealState {

    @PrimaryKey (autoGenerate = true)
    private int id;

    private String type;

    @ColumnInfo(name = "surface_area")
    private float surfaceArea;

    @ColumnInfo(name = "number_or_rooms")
    private int numberOfRooms;

    private String description;

    @ColumnInfo(name = "images")
    private List<Image> listOfImages;

    private String address;

    @ColumnInfo(name = "nearby_points_of_interest")
    private List<Place> listOfNearbyPointsOfInterest;

    //true: available; false: sold
    private boolean status;

    @ColumnInfo(name = "date_put")
    private String datePut;

    //If the propery has not been sold, this would be ""
    @ColumnInfo(name = "date_sale")
    private String dateSale;

    //email of the agent
    private String agent;

    //////////////////////////////////////////////////////

    /** Used for when reading from the table
     * */
    public RealState(int id, String type, float surfaceArea, int numberOfRooms, String description,
                     List<Image> listOfImages, String address, boolean status, String datePut,
                     String dateSale, String agent) {
        this.id = id;
        this.type = type;
        this.surfaceArea = surfaceArea;
        this.numberOfRooms = numberOfRooms;
        this.description = description;
        this.listOfImages = listOfImages;
        this.address = address;
        this.status = status;
        this.datePut = datePut;
        this.dateSale = dateSale;
        this.agent = agent;
    }

    /** Used to insert a new object in the Object Relational Mapping Library
     * */
    // Use the Ignore annotation so Room knows that it has to use the other constructor instead
    @Ignore
    private RealState (final Builder builder) {
        this.type = builder.type;
        this.surfaceArea = builder.surfaceArea;
        this.numberOfRooms = builder.numberOfRooms;
        this.description = builder.description;
        this.listOfImages = builder.listOfImages;
        this.address = builder.address;
        //this.listOfNearbyPointsOfInterest = builder.listOfNearbyPointsOfInterest;
        this.status = builder.status;
        this.datePut = builder.datePut;
        this.dateSale = builder.dateSale;
        this.agent = builder.agent;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(float surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Image> getListOfImages() {
        return listOfImages;
    }

    public void setListOfImages(List<Image> listOfImages) {
        this.listOfImages = listOfImages;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Place> getListOfNearbyPointsOfInterest() {
        return listOfNearbyPointsOfInterest;
    }

    public void setListOfNearbyPointsOfInterest(List<Place> listOfNearbyPointsOfInterest) {
        this.listOfNearbyPointsOfInterest = listOfNearbyPointsOfInterest;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDatePut() {
        return datePut;
    }

    public void setDatePut(String datePut) {
        this.datePut = datePut;
    }

    public String getDateSale() {
        return dateSale;
    }

    public void setDateSale(String dateSale) {
        this.dateSale = dateSale;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public static class Builder {

        private String type;
        private float surfaceArea;
        private int numberOfRooms;
        private String description;
        private List<Image> listOfImages;
        private String address;
        private List<Place> listOfNearbyPointsOfInterest;
        private boolean status;
        private String datePut;
        private String dateSale;
        private String agent;

        public Builder setType (String string) {
            this.type = type;
            return this;
        }

        public Builder setSurfaceArea (float surfaceArea) {
            this.surfaceArea = surfaceArea;
            return this;
        }

        public Builder setNumberOfRooms (int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
            return this;
        }

        public Builder setDescription (String description) {
            this.description = description;
            return this;
        }

        public Builder setImages (List<Image> listOfImages) {
            this.listOfImages = listOfImages;
            return this;
        }

        public Builder setAddress (String address) {
            this.address = address;
            return this;
        }

        public Builder setNearbyPointsOfInterest (List<Place> listOfNearbyPointsOfInterest){
            this.listOfNearbyPointsOfInterest = listOfNearbyPointsOfInterest;
            return this;
        }

        public Builder setStatus (boolean status) {
            this.status = status;
            return this;
        }

        public Builder setDatePut (String datePut) {
            this.datePut = datePut;
            return this;
        }

        public Builder setDateSale (String dateSale) {
            this.dateSale = dateSale;
            return this;
        }

        public Builder setAgent (String agent) {
            this.agent = agent;
            return this;
        }

        public RealState build() {
            return new RealState(this);
        }

    }

    @Override
    public String toString() {
        return "RealState{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", surfaceArea=" + surfaceArea +
                ", numberOfRooms=" + numberOfRooms +
                ", description='" + description + '\'' +
                ", listOfImages=" + listOfImages +
                ", address='" + address + '\'' +
                ", listOfNearbyPointsOfInterest=" + listOfNearbyPointsOfInterest +
                ", status=" + status +
                ", datePut='" + datePut + '\'' +
                ", dateSale='" + dateSale + '\'' +
                ", agent='" + agent + '\'' +
                '}';
    }
}