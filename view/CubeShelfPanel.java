package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CubeShelfListener;

public class CubeShelfPanel {
    
    private JFrame window;
    private JButton getPriceButton;
    private JLabel qtyLabel ;
    private JTextField qtyField;
    private JButton addButton;
    private JButton backButton;

    private CubeShelfCanvas canvas;

    private CubeShelfListener listener;

    public CubeShelfPanel(JFrame window)
    {
        this.window = window;
    }

    public void init()
    {
        Container cp = window.getContentPane();
        JPanel southPanel = new JPanel();
        cp.add(BorderLayout.SOUTH,southPanel);

        getPriceButton = new JButton("Get Price");
        qtyLabel = new JLabel("Quantity: ");
        qtyField = new JTextField(8);
        addButton = new JButton("Add to Cart");
        backButton = new JButton("Go Back");
        
        
        southPanel.add(qtyLabel) ;
        southPanel.add(qtyField);
        southPanel.add(getPriceButton);
        southPanel.add(addButton);
        southPanel.add(backButton);

        canvas = new CubeShelfCanvas(this);
        cp.add(BorderLayout.CENTER, canvas);

        listener = new CubeShelfListener(this);
        getPriceButton.addActionListener(listener);
        addButton.addActionListener(listener);
        backButton.addActionListener(listener);

    }
    public JButton getAddButton() {
        return addButton;
    }
    public JButton getBackButton() {
        return backButton;
    }
    public CubeShelfCanvas getCanvas() {
        return canvas;
    }
    public JButton getPriceButton() {
        return getPriceButton;
    }
    public JTextField getQtyField() {
        return qtyField;
    }
    public JFrame getWindow() {
        return window;
    }
    public CubeShelfListener getListener() {
        return listener;
    }
}
