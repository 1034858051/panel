
package com.ankon.gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;
/**
 *
 * @author wsj
 */
public class Panel1 extends Frame {
    private Panel borderpanel;
    private Panel flowpanel1;
    private Panel flowpanel2;
    private Panel1(String a) {
        super(a);
        setSize(600,400);
        setLocation(200,200);
        setFlowLayoutPanel();
        setBorderLayoutPanel();
        add(borderpanel);
        add(flowpanel1);
    } 
    public void setFlowLayoutPanel()
    {
        flowpanel1=new Panel();
        flowpanel1.setLayout(new FlowLayout());
        Button bt1=new Button("1");
        Button bt2=new Button("bt2");
        Button bt6=new Button("上");
        Button bt7=new Button("下");
        Button bt3=new Button("左");
        Button bt4=new Button("右");
        Button bt5=new Button("中");
        flowpanel1.add(bt1);
        flowpanel1.add(bt2);
        flowpanel1.add(bt3);
        flowpanel1.add(bt4);
        flowpanel1.add(bt5);
        flowpanel1.add(bt6);
        flowpanel1.add(bt7);
    }
    public void setBorderLayoutPanel()
    {
        borderpanel=new Panel();
        borderpanel.setLayout(new BorderLayout());
       // Button bt1=new Button("设备选择");
        JLabel bt1=new JLabel("设备选择");
        Button bt3=new Button("左");   
        Button bt5=new Button("中");
        borderpanel.add(bt1,"North");
       // borderpanel.add(bt2,"South");
        borderpanel.add(bt3,"West");
       // borderpanel.add(bt4,"East");
        borderpanel.add(bt5,"Center");
    }
    public static void main(String args[])
    {
        Panel1 a=new Panel1("Ankon 120设备密码控制台");
        a.show();
    }  
}
