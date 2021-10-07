package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import model.FloatShelf;

public class FloatShelfCanvas extends JPanel 
{
    private FloatShelfPanel panel ;
    private FloatShelf floatShelf = new FloatShelf("LACK", 15, 7, 22, 10, 43, 2);

    public FloatShelfCanvas(FloatShelfPanel panel)
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
        floatShelf.render(g2);
        floatShelf.renderSample(g2);
    }

    public FloatShelf getFloatShelf() {
        return floatShelf;
    }
    
}
