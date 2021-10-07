package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import model.Cart;

public class CartCanvas extends JPanel{
    private CartPanel panel;
    private Cart totalCart = new Cart();
    private CubeShelfPanel cubeShelfPanel;
    
    public CartCanvas(CartPanel panel)
    {
        this.panel = panel;
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.black);
    }

    @Override 
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        totalCart.render(g2);
    }
}
