/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikoskatsilidis
 */

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{
    private JButton btn1,btn2,btn3;
    private JLabel label1;
    private JPanel row1,row2;
    private ImageIcon img;
    
    Frame()
    {
        super("New Window frame");
        setSize(450,450);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        btn1 = new JButton("hi1");
        btn2 = new JButton("hi2");
        btn3 = new JButton("hi3");
        
        row1 = new JPanel();
        row2 = new JPanel();
        
        label1 = new JLabel();
        img = new ImageIcon(getClass().getResource("img.png"));
        label1.setIcon(img);
        
        
        Container pane = getContentPane();
        GridLayout grid = new GridLayout(2,1);
        GridLayout row = new GridLayout(3,1);
        FlowLayout flo = new FlowLayout();
        
        pane.setLayout(grid);
        
        row1.setLayout(flo);
        row1.add(label1);
        pane.add(row1);
        
        row2.setLayout(row);
        row2.add(btn1);
        row2.add(btn2);
        row2.add(btn3);
        pane.add(row2);
        
        setContentPane(pane);
    }
}
