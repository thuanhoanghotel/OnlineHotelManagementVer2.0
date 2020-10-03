package com.thuanhoang.hotelManagement.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roomType")
public class RoomTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String roomType;
    private int price;
    private String description;
    private String size;
    private int numberOfPerson;

    @OneToMany(mappedBy = "roomTypeEntity")
    private List<RoomEntity> roomEntity;

    public RoomTypeEntity(int id, String roomType, int price, String description, String size, int numberOfPerson, List<RoomEntity> roomEntity) {
        this.id = id;
        this.roomType = roomType;
        this.price = price;
        this.description = description;
        this.size = size;
        this.numberOfPerson = numberOfPerson;
        this.roomEntity = roomEntity;
    }

    public RoomTypeEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }
}
