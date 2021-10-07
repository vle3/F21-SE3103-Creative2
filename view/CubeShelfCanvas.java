package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.jar.Attributes.Name;

import javax.swing.JPanel;

import model.CubeShelf;
import model.Item;

public class CubeShelfCanvas extends JPanel{
    private CubeShelfPanel panel;
    private CubeShelf cubeShelf = new CubeShelf("EKET", 20 , 10, 15, 13, 13, 13);
    
    public CubeShelfCanvas(CubeShelfPanel panel)
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
        cubeShelf.render(g2);
        cubeShelf.renderSample(g2);
    }
    public CubeShelf getCubeShelf() {
        return cubeShelf;
    }
}

