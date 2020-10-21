
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class Számológép extends JFrame implements ActionListener {
    
    /*
    1. összetevőkhöz példányváltozó X
    2. panelek létrehozása X
    3. eredmény példány változója X 
    4. konstruktor fejléccel X
    5. összetevők betöltése a keretbe (panelek,összetevők létrehozása)
    6. figyelő beállítása, ha kell
    7. elrendezés kezelők létrehozása, beállítása
    8. összetevők hozzáadása a panelekhez
    9. panelek betöltése a keretbe
    10. eseményfigyelő megírása
    11. main
    */
    double elsőszám;
    double másodikszám;
    double eredmény;
    String operation;
    
    //1. sor
    private JTextField tferedmény;
    
    //2.
    private JButton üres;
    private JButton backspace;
    private JButton CE;
    private JButton C;
    
    //3.sor
    private JButton MC;
    private JButton hét;
    private JButton nyolc;
    private JButton kilenc;
    private JButton osztás;
    private JButton gyök;
    
    //4.sor
    private JButton MR;
    private JButton négy;
    private JButton öt;
    private JButton hat;
    private JButton szorzás;
    private JButton százalék;
    
    //5.sor
    private JButton MS;
    private JButton egy;
    private JButton kettő;
    private JButton három;
    private JButton kivonás;
    private JButton egyperx;
    
    //6.sor
    private JButton Mplusz;
    private JButton nulla;
    private JButton pluszminusz;
    private JButton pont;
    private JButton összeadás;
    private JButton egyenlő;
    
    
    
    //Panelok
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    private JPanel p6;
    
    //Eredmény változó
    
    //private int eredmény;
    
    //konstruktor fejléce

    public Számológép(String fejléc) throws HeadlessException {
        super(fejléc);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        this.p1 = new JPanel();
        this.tferedmény = new JTextField(6  );
        
        this.p2 = new JPanel();
        this.üres = new JButton(" ");
        this.backspace = new JButton("Backspace");
        this.CE = new JButton("CE");
        this.C = new JButton("C");this.C.addActionListener(this);
        
        this.p3 = new JPanel();
        this.MC = new JButton("MC");
        this.hét = new JButton("7"); this.hét.addActionListener(this);
        this.nyolc = new JButton("8"); this.nyolc.addActionListener(this);
        this.kilenc = new JButton("9"); this.kilenc.addActionListener(this);
        this.osztás = new JButton("/");
        this.gyök = new JButton("sqrt");
        
        
        this.p4 = new JPanel();
        this.MR = new JButton("MR");
        this.négy = new JButton("4"); this.négy.addActionListener(this);
        this.öt = new JButton("5"); this.öt.addActionListener(this);
        this.hat = new JButton("6"); this.hat.addActionListener(this);
        this.szorzás = new JButton("*");
        this.százalék = new JButton("%");
        
        this.p5 = new JPanel();
        this.MS = new JButton("MS");
        this.egy = new JButton("1"); this.egy.addActionListener(this); 
        this.kettő = new JButton("2"); this.kettő.addActionListener(this); 
        this.három = new JButton("3"); this.három.addActionListener(this);
        this.kivonás = new JButton("-");this.kivonás.addActionListener(this);
        this.egyperx = new JButton("1/x");
        
        this.p6 = new JPanel();
        this.Mplusz = new JButton("M+");
        this.nulla = new JButton("0");this.nulla.addActionListener(this);
        this.pluszminusz = new JButton("+/-");
        this.pont = new JButton(".");
        this.összeadás = new JButton("<html><body><font color=#FF0000>+</font></body></html>");
        this.összeadás.addActionListener(this);
        this.egyenlő = new JButton("<html><body><font color=#FF0000>=</font></body></html>");
        this.egyenlő.addActionListener(this);
        
        
        GridLayout g1 = new GridLayout(6,6);
        GridLayout g2 = new GridLayout(1,1);
        GridLayout g3 = new GridLayout(1,4);
        GridLayout g4 = new GridLayout(1,6);
        setLayout(g1);
        p1.setLayout(g2);
        p1.add(tferedmény);
        
        p2.setLayout(g3);
        p2.add(üres);
        p2.add(backspace);
        p2.add(CE);
        p2.add(C);
        
        p3.setLayout(g4);
        p3.add(MC);
        p3.add(hét);
        p3.add(nyolc);
        p3.add(kilenc);
        p3.add(osztás);
        p3.add(gyök);
        
        p4.setLayout(g4);
        p4.add(MR);
        p4.add(négy);
        p4.add(öt);
        p4.add(hat);
        p4.add(szorzás);
        p4.add(százalék);
        
        p5.setLayout(g4);
        p5.add(MS);
        p5.add(egy);
        p5.add(kettő);
        p5.add(három);
        p5.add(kivonás);
        p5.add(egyperx);
        
        p6.setLayout(g4);
        p6.add(Mplusz);
        p6.add(nulla);
        p6.add(pluszminusz);
        p6.add(pont);
        p6.add(összeadás);
        p6.add(egyenlő);
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);
        this.add(p6);
        pack();
        
        
        
    }
    public static void main(String[] args) {
        Számológép a = new Számológép("Számológép");
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        
        if(event.getSource()==egy)
        {
            String szám = tferedmény.getText()+egy.getText();
            tferedmény.setText(szám);
        }
        if(event.getSource()==kettő)
        {
            String szám = tferedmény.getText()+kettő.getText();
            tferedmény.setText(szám);
        }
        if(event.getSource()==három)
        {
            String szám = tferedmény.getText()+három.getText();
            tferedmény.setText(szám);
        }
        if(event.getSource()==négy)
        {
            String szám = tferedmény.getText()+négy.getText();
            tferedmény.setText(szám);
        }
        if(event.getSource()==öt)
        {
            String szám = tferedmény.getText()+öt.getText();
            tferedmény.setText(szám);
        }
        if(event.getSource()==hat)
        {
            String szám = tferedmény.getText()+hat.getText();
            tferedmény.setText(szám);
        }
        if(event.getSource()==hét)
        {
            String szám = tferedmény.getText()+hét.getText();
            tferedmény.setText(szám);
        }
        if(event.getSource()==nyolc)
        {
            String szám = tferedmény.getText()+nyolc.getText();
            tferedmény.setText(szám);
        }
        if(event.getSource()==kilenc)
        {
            String szám = tferedmény.getText()+kilenc.getText();
            tferedmény.setText(szám);
        }
        if(event.getSource()==nulla)
        {
            String szám = tferedmény.getText()+nulla.getText();
            tferedmény.setText(szám);
        }
        
        if(event.getSource()==összeadás)
        {
            elsőszám = Double.parseDouble(tferedmény.getText());
            tferedmény.setText("");
            operation = "+";
        }
        if(event.getSource()==kivonás)
        {
            elsőszám = Double.parseDouble(tferedmény.getText());
            tferedmény.setText("");
            operation = "-";
        }
        if(event.getSource()== egyenlő)
        {
            double answer;
            másodikszám = Double.parseDouble(tferedmény.getText());
            if(operation.equals("+"))
            {
                eredmény = elsőszám+másodikszám;
                answer = eredmény;
                tferedmény.setText(String.valueOf(answer));
            }
            if(operation.equals("-"))
            {
                eredmény = elsőszám - másodikszám;
                answer = eredmény;
                tferedmény.setText(String.valueOf(answer));
            }
        }
        if(event.getSource()==C)
        {
            tferedmény.setText("");
        }
    }
    
    
}
