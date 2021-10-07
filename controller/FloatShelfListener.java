package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import view.FloatShelfPanel;
import view.MenuScreen;

public class FloatShelfListener implements ActionListener{
    private FloatShelfPanel panel;
    public FloatShelfListener(FloatShelfPanel panel)
    {
        this.panel = panel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();

        if(button == panel.getGetPriceButton())
        {
           try{
                int qty = Integer.parseInt(panel.getQtyField().getText());
                JOptionPane optionPane = new JOptionPane();
                double total = qty * panel.getCanvas().getFloatShelf().getPrice();
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
                double total = qty * panel.getCanvas().getFloatShelf().getPrice();
                double shipweight = qty * panel.getCanvas().getFloatShelf().getWeight();
                var cubeCart = panel.getCanvas().getFloatShelf().getFloatCart();
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
}
