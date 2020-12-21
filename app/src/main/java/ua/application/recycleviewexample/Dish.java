package ua.application.recycleviewexample;

import java.util.ArrayList;
import java.util.List;

public class Dish {
    private String name;
    private String price;
    private String amount;
    private int photoId;


    public Dish(String name, String price, String amount, int photoId) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.photoId = photoId;
    }

    public String getAmount() { return amount; }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getPhotoId() {
        return photoId;
    }
}
