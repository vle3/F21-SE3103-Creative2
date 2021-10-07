package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuScreen {
    private JFrame window;

    public MenuScreen(JFrame window)
    {
        this.window = window;
    }

    public void init()
    {
        Container cp = window.getContentPane();
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout( new GridLayout(3,1));
        menuPanel.setPreferredSize(new Dimension(400,200));

        JButton cubeButton = new JButton("Cube Shelf");
        JButton floatButton = new JButton("Float Shelf");
        JButton cartButton = new JButton("Cart");
        menuPanel.add(cubeButton);
        menuPanel.add(floatButton);
        menuPanel.add(cartButton);
        cp.add(BorderLayout.CENTER, menuPanel);

        cubeButton.addActionListener(event -> 
        {
            window.getContentPane().removeAll();
            var panel = new CubeShelfPanel(window);
            panel.init();
            window.pack();
            window.revalidate();
        });
        floatButton.addActionListener(event -> 
        {
            window.getContentPane().removeAll();;
            var panel =new FloatShelfPanel(window);
            panel.init();
            window.pack();
            window.revalidate();
        });
        cartButton.addActionListener(event ->
        {
            window.getContentPane().removeAll();;
            var panel =new CartPanel(window);
            panel.init();
            window.pack();
            window.revalidate();
        });
    }
}
