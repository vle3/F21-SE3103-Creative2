package model;

import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.Color;

public class FloatShelf  extends Item{
    private double length;
    private double thickness;
    public static Cart floatCart = new Cart();

    public FloatShelf(String name, double price, double weight, double maxLoad, double depth, double length, double thickness)
    {
        super(name, price, weight, maxLoad, depth);
        this.length = length;
        this.thickness = thickness;
    }

    @Override
    public void render(Graphics2D g2) {
        g2.setColor(Color.YELLOW);
        g2.setFont(new Font("New Courier" , Font.BOLD, 14));
        g2.drawString(super.toString(), 50, 80);
        g2.drawString(this.toString(), 50 , 100);
        
    }

    @Override
    public void renderSample(Graphics2D g2) {
        g2.setColor(Color.white);
        int x0 = 50;
        int x1 = 60;
        int x2 = 70;
        int y0 = 145;
        int y1 = 150;
        int y2 = 155;
        int y3 = 160;         
        g2.drawRect(x1, y1, 300, 10);
        g2.drawLine(x0, y0, x1, y1);
        g2.drawLine(x0, y2, x1, y3);
        g2.drawLine(x0, y0, x0, y2);
        g2.drawLine(x0, y0, x0 + 300, y0);
        g2.drawLine(x0 + 300, y0, x1 + 300, y1);
    }

    @Override
    public String toString()
    {
        // String result = super.toString() + '\n' + "\n W x H x D: " + width + " x " + height + " x " +  super.getDepth(); 
        String result = " Lenghth: " + length + " Thickness " + thickness ;
        return result;
        // return  super.toString() 
        // + '\n' + " W x H x D: " + width + " x " + height + " x " +  super.getDepth();
    }
    public static Cart getFloatCart() {
        return floatCart;
    }
}
