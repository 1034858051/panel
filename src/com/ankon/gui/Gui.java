/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ankon.gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
/**
 *
 * @author wsj
 */
public class Gui extends JFrame{
    private JLabel jLabel;
    private JTextField jTextField;
    private JLabel jLabel1;
    private JTextField jTextField2;
    private JButton jButton;
    private Panel borderpanel;
   public Gui(){
       super();
       this.setSize(450, 600);
       this.getContentPane().setLayout(null);
       this.setTitle("helloworld");    
       this.add(getJLabel(), null);  
       setBorderLayoutPanel();
       add(borderpanel);
   }
   public void setBorderLayoutPanel()
    {
        borderpanel=new Panel();
        borderpanel.setLayout(new BorderLayout());
        Button bt1=new Button("上");
        Button bt2=new Button("下");
        Button bt3=new Button("左");
        Button bt4=new Button("右");
        Button bt5=new Button("中");
        borderpanel.add(bt1,"North");
        borderpanel.add(bt2,"South");
        borderpanel.add(bt3,"West");
        borderpanel.add(bt4,"East");
        borderpanel.add(bt5,"Center");
    }
   
   public static void main(String[] args){
   Gui w = new Gui();
   w.setVisible(true);
}

    private javax.swing.JLabel getJLabel() {
   if(jLabel == null) {
      jLabel = new javax.swing.JLabel();
      jLabel.setBounds(0, 0, 53, 18);
      jLabel.setText("设备选择");
   }
   return jLabel;
}


   
   
   
   
   
   
   
   
}
