package org.studyeasy.DAY3;

import javax.swing.*;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  18 12/18/2025 8:30 PM
 Project Name : 30Days_Java
 ***/
public class SimpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first GUI");
        frame.setSize(300, 150);// set the dimensions of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Create the close exit button
        frame.setLayout(null);//absolute positioning
        //to make the dialog window visible
        frame.setVisible(true);
        //TextFields
        JTextField textField = new JTextField();
        textField.setBounds(20,20,150,25);
        //Button
        JButton button = new JButton("Click me ");
        button.setBounds(180,20,90,25);

        //Label
        JLabel label = new JLabel("Hello");
        label.setBounds(20,60,250,25);
        frame.add(textField);
        frame.add(button);
        frame.add(label);

        button.addActionListener(e ->{
            String name = textField.getText();
            label.setText("Hello, "+ name +"!");
        });

    }
}
