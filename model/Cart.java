package model;

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;

public class Cart {
    private static  int itemQty = 0 ;
    private static double shipweight = 0 ;
    private static double price = 0;

    public Cart addCart(Cart cubeCart, Cart floatCart)
    {
        var result = new Cart();
        result.itemQty = cubeCart.getItemQty() + floatCart.getItemQty();
        result.shipweight = cubeCart.getShipweight() + floatCart.getShipweight();
        result.price = cubeCart.getPrice() + floatCart.getPrice();
        return result;
    }
    public void render(Graphics2D g2)
    {
        String m1 = "Total Item: " + itemQty;
        String m2 = "Total Ship Weights: " + shipweight + "lbs";
        String m3 = "Total Price: $" + price;
        g2.setColor(Color.YELLOW);
        g2.setFont(new Font("New Courier" , Font.BOLD, 14));
        g2.drawString(m1, 100, 100);
        g2.drawString(m2, 100 , 130);
        g2.drawString(m3, 100 , 160);
    }

    public int getItemQty() {
        return itemQty;
    }
    public double getPrice() {
        return price;
    }
    public double getShipweight() {
        return shipweight;
    }
    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setShipweight(double shipweight) {
        this.shipweight = shipweight;
    }
}
