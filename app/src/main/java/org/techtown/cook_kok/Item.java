package org.techtown.cook_kok;

public class Item {
    String foodListName;
    int foodListImage;

    public Item(String foodname,int foodimage)
    {
        this.foodListImage =foodimage;
        this.foodListName =foodname;
    }
    public String getfoodName()
    {
        return foodListName;
    }

    public int getfoodImage()
    {
        return foodListImage;
    }
}