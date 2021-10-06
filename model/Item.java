package model;

import java.awt.Graphics2D;

public abstract class Item {

    private String name; 
    private float price;
    private float weight;

    public Item(String name, float price, float weight)
    {
        this.name = name; 
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString()
    {
        return "[Item: (" + name + " , Price: "+ price + " , " + weight +")]";
    }

    public abstract void render(Graphics2D g2);
}
