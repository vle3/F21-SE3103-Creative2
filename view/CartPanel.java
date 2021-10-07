package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class CartPanel {
    private JFrame window;
    private JButton completeOrderButton;
    private JButton cancelOrderButton;

    private CartCanvas canvas;

    public CartPanel(JFrame window)
    {
        this.window = window;
    }

    public void init()
    {
        Container cp = window.getContentPane();
        JPanel southPanel = new JPanel();
        cp.add(BorderLayout.SOUTH, southPanel);

        completeOrderButton = new JButton("Complete Order");
        cancelOrderButton = new JButton("Cancel");

        southPanel.add(completeOrderButton);
        southPanel.add(cancelOrderButton);

        canvas = new CartCanvas(this);
        cp.add(BorderLayout.CENTER, canvas);
        
        completeOrderButton.addActionListener(event ->
        {
            String message = "Your Order will be Processed";
            JOptionPane optionPane = new JOptionPane();
                optionPane.showMessageDialog(window, message);
        });
        cancelOrderButton.addActionListener(event -> 
        {
            window.getContentPane().removeAll();
            var menu = new MenuScreen(window);
            menu.init();
            window.pack();
            window.revalidate();
        });
    }
}
