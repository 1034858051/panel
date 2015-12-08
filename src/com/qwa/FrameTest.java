package com.qwa;

import java.awt.*;
import java.awt.event.*;
public class FrameTest {
 public static void main(String[] args) {
  // TODO 自动生成方法存根 
  Frame myFrame=new Frame("Hello");
  //Frame 是带有标题和边界的顶层窗口
  
  myFrame.setLocation(250, 150);
  
  //myFrame.setLayout(new BorderLayout(10,20));
  //设置窗体布局，BorderLayout里面的两个参数用指定的组件之间的水平间距构造一个边界布局。
  //BorderLayout为JAVA中的默认窗体布局
  
  //myFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
  //设置窗体布局为FlowLayout，对齐方式居左对齐
  myFrame.setFont(null);
  //myFrame.setLayout(new GridLayout(3,2));
  //设置窗体布局为GridLayout，将窗体分为6块，3行2列
  myFrame.setSize(300,400);
  
  //Button myButton1=new Button("east");
  //Button myButton2=new Button("south");
  Button myButton3=new Button("west");
 // Button myButton4=new Button("north");
  Button myButton5=new Button("center");
  
  //myFrame.add(myButton1,BorderLayout.EAST);
  //myFrame.add(myButton1,"East");
  //两种方法都可以，但是要注意大小写
 // myFrame.add(myButton2,BorderLayout.SOUTH);
  myFrame.add(myButton3,BorderLayout.WEST);
 // myFrame.add(myButton4,BorderLayout.NORTH);
  myFrame.add(myButton5,BorderLayout.CENTER);
  
  //myFrame.addWindowListener(new myWindowListener());
  
  
  //使用适配器的方法实现监听器作用
  //myFrame.addWindowListener(new yourWindowListener());
  
  //使用匿名内部类的方法实现监听器的功能,只有含有适配器的事件才可以使用此方法
  myFrame.addWindowListener(new WindowAdapter(){
   public void windowClosing(WindowEvent e){
    System.exit(0);
   }
  });
  myFrame.setVisible(true);
  //myFrame.show();//eclipse 不建议使用show()方法
 }

}