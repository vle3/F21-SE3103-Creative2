package controller;

import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import view.CubeShelfPanel;
import view.MenuScreen;

public class CubeShelfListener implements ActionListener{

    private CubeShelfPanel panel;
    public CubeShelfListener(CubeShelfPanel panel)
    {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        JButton button = (JButton) e.getSource();

        if(button == panel.getPriceButton())
        {
           try{
                int qty = Integer.parseInt(panel.getQtyField().getText());
                JOptionPane optionPane = new JOptionPane();
                double total = qty * panel.getCanvas().getCubeShelf().getPrice();
                String message = "Your Total: " + total;
                optionPane.showMessageDialog(panel.getWindow(), message);

            }
            catch(NumberFormatException exception)
            {
                JOptionPane optionPane = new JOptionPane();
                optionPane.showMessageDialog(panel.getWindow(), "Invalid input" , "Warning",optionPane.WARNING_MESSAGE);
            }
        }
        if(button == panel.getAddButton())
        {
            try{
                int qty = Integer.parseInt(panel.getQtyField().getText());
                JOptionPane optionPane = new JOptionPane();
                double total = qty * panel.getCanvas().getCubeShelf().getPrice();
                double shipweight = qty * panel.getCanvas().getCubeShelf().getWeight();
                var cubeCart = panel.getCanvas().getCubeShelf().getCubeCart();
                cubeCart.setItemQty(qty);
                cubeCart.setPrice(total);
                cubeCart.setShipweight(shipweight);
                String message = "Added to Cart";
                optionPane.showMessageDialog(panel.getWindow(), message);

            }
            catch(NumberFormatException exception)
            {
                JOptionPane optionPane = new JOptionPane();
                optionPane.showMessageDialog(panel.getWindow(), "Invalid input" , "Warning",optionPane.WARNING_MESSAGE);
            }
        }
        if(button == panel.getBackButton())
        {
            JFrame window = panel.getWindow();
            window.getContentPane().removeAll();
            var menu = new MenuScreen(window);
            menu.init();
            window.pack();
            window.revalidate();
        }
    }
    
    public  CubeShelfPanel getPanel() {
        return panel;
    }
}
