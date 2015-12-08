package wsj.aaaaa;

import java.awt.*;
import java.awt.event.*;
public class Panel4 extends Frame
{
    private Panel flowpanel;
    private Panel cardpanel;
    private Panel gridpanel;
    private Panel borderpanel;
    public Panel4(String title)
    {
        super(title);
        setSize(600,400);
        setLocation(200,200);
        setFlowLayoutPanel();
        setCardLayoutPanel();
        setGridLayoutPanel();
        setBorderLayoutPanel();
        setLayout(new GridLayout(2,2));
        add(flowpanel);
        add(cardpanel);
        add(gridpanel);
        add(borderpanel);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public void setFlowLayoutPanel()
    {
        flowpanel=new Panel();
        flowpanel.setLayout(new FlowLayout());
        Button bt1=new Button("1");
        Button bt2=new Button("bt2");
        flowpanel.add(bt1);
        bt1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                ((Button)e.getSource()).setLabel("2");
            }
        });
        flowpanel.add(bt2);
    }
    public void setCardLayoutPanel()
    {
        final CardLayout c=new CardLayout();
        cardpanel=new Panel();
        cardpanel.setLayout(c);
        Button bt1=new Button("aaa");
        Button bt2=new Button("bbb");
        cardpanel.add(bt1,"1");
        cardpanel.add(bt2,"2");
        ActionListener a=new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                c.next(cardpanel);
            }
        };
        bt1.addActionListener(a);
        bt2.addActionListener(a);
    }
    public void setGridLayoutPanel()
    {
        gridpanel=new Panel();
        gridpanel.setLayout(new GridLayout(2,2));
        Button bt1=new Button("1");
        Button bt2=new Button("2");
        Button bt3=new Button("3");
        Button bt4=new Button("4");
        gridpanel.add(bt1);
        gridpanel.add(bt2);
        gridpanel.add(bt3);
        gridpanel.add(bt4);
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
    public static void main(String args[])
    {
        Panel4 a=new Panel4("我的测试");
        a.show();
    }
}