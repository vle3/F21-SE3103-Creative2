package model;

import java.awt.Graphics2D;

public abstract class Item {

    private String name; 
    private double price;
    private double weight;
    private double maxLoad;
    private double depth;

    public Item(String name, double price, double weight , double maxLoad, double depth)
    {
        this.name = name; 
        this.price = price;
        this.weight = weight;
        this.maxLoad = maxLoad;
        this.depth = depth;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
    public double getDepth() {
        return depth;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + " , Price: "+ price + " , Ship weight: " + weight +"" + '\n';
    }

    public abstract void render(Graphics2D g2);
    public abstract void renderSample(Graphics2D g2);
}
