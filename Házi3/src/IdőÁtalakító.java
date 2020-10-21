
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roland
 */
public class IdőÁtalakító extends JFrame implements ActionListener {
    
    private JTextField tfNap;
    private JTextField tfÓra;
    private JTextField tfPerc;
    private JTextField tfMásodperc;
    private JLabel lNap;
    private JLabel lÓra;
    private JLabel lPerc;
    private JLabel lMásodperc;
    // -------------------------------
    private JTextField tf2Nap;
    private JTextField tf2Óra;
    private JTextField tf2Perc;
    private JTextField tf2Másodperc;
    private JLabel l2Nap;
    private JLabel l2Óra;
    private JLabel l2Perc;
    private JLabel l2Másodperc;
    //------------------------------------------
    private JTextField tfNapEredmény;
    private JTextField tfÓraEredmény;
    private JTextField tfPercEredmény;
    private JTextField tfMásodpercEredmény;
    private JLabel lNapEredmény;
    private JLabel lÓraEredmény;
    private JLabel lPercEredmény;
    private JLabel lMásodpercEredmény;
    //------------------------------------------

    private JButton b;
    //------------------------------------------
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    //-------------------------------------------
    private int eredményNap;
    private int eredményÓra;
    private int eredményPerc;
    private int eredményMásodperc;
    private final int MAX_MINUTE_AND_SECOND = 60;
    private final int MAX_HOUR = 24;
    
    //---------------------------------------

    public IdőÁtalakító() {
        
    }
    public  void IncrementSecond(IdőÁtalakító t) {
       if (t.eredményMásodperc > MAX_MINUTE_AND_SECOND-1) {
           t.eredményMásodperc = t.eredményMásodperc - MAX_MINUTE_AND_SECOND;
           t.eredményPerc++;
          }
       if (t.eredményPerc > MAX_MINUTE_AND_SECOND-1) {
           t.eredményPerc = t.eredményPerc - MAX_MINUTE_AND_SECOND;
           t.eredményÓra++;
       }
       if (t.eredményÓra > MAX_HOUR-1) {
           t.eredményÓra = t.eredményÓra - MAX_HOUR;
           t.eredményNap++;
       }
    }

    public IdőÁtalakító(String cím) throws HeadlessException {
        super(cím);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        /*Panel 1*/
        this.p1 = new JPanel();
        this.tfNap = new JTextField(3);
        this.lNap = new JLabel("nap");
        this.tfÓra = new JTextField(3);
        this.lÓra = new JLabel("óra");
        this.tfPerc = new JTextField(3);
        this.lPerc = new JLabel("perc");
        this.tfMásodperc = new JTextField(3);
        this.lMásodperc = new JLabel("másodperc");
        
        /*Panel 2*/
        
        this.p2 = new JPanel();
        this.tf2Nap = new JTextField(3);
        this.l2Nap = new JLabel("nap");
        this.tf2Óra = new JTextField(3);
        this.l2Óra = new JLabel("óra");
        this.tf2Perc = new JTextField(3);
        this.l2Perc = new JLabel("perc");
        this.tf2Másodperc = new JTextField(3);
        this.l2Másodperc = new JLabel("másodperc");
        
        /*Panel 3*/
        
        this.p3 = new JPanel();
        this.b = new JButton("Számol");
        this.b.addActionListener(this);
        
        /*Panel 4*/
        
        this.p4 = new JPanel();
        this.tfNapEredmény = new JTextField(3);
        this.lNapEredmény = new JLabel("nap");
        this.tfÓraEredmény = new JTextField(3);
        this.lÓraEredmény = new JLabel("óra");
        this.tfPercEredmény = new JTextField(3);
        this.lPercEredmény = new JLabel("perc");
        this.tfMásodpercEredmény = new JTextField(3);
        this.lMásodpercEredmény = new JLabel("másodperc");
        
        
        
        GridLayout g1 = new GridLayout(4, 8);
        GridLayout gl2 = new GridLayout(1,1);
        
        setLayout(g1);
        p3.setLayout(gl2);
        
        //----------------
        p1.add(tfNap);
        p1.add(lNap);
        p1.add(tfÓra);
        p1.add(lÓra);
        p1.add(tfPerc);
        p1.add(lPerc);
        p1.add(tfMásodperc);
        p1.add(lMásodperc);

        //-------------------
        p2.add(tf2Nap);
        p2.add(l2Nap);
        p2.add(tf2Óra);
        p2.add(l2Óra);
        p2.add(tf2Perc);
        p2.add(l2Perc);
        p2.add(tf2Másodperc);
        p2.add(l2Másodperc);

        
        p3.add(b);

        //--------------------
        p4.add(tfNapEredmény);
        p4.add(lNapEredmény);
        p4.add(tfÓraEredmény);
        p4.add(lÓraEredmény);
        p4.add(tfPercEredmény);
        p4.add(lPercEredmény);
        p4.add(tfMásodpercEredmény);
        p4.add(lMásodpercEredmény);
        
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        pack();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       IdőÁtalakító osszeg = new IdőÁtalakító();
       osszeg.eredményNap = Integer.parseInt(tfNap.getText()) + Integer.parseInt(tf2Nap.getText());
       osszeg.eredményÓra = Integer.parseInt(tfÓra.getText()) + Integer.parseInt(tf2Óra.getText());
       osszeg.eredményPerc = Integer.parseInt(tfPerc.getText()) + Integer.parseInt(tf2Perc.getText());
       osszeg.eredményMásodperc = Integer.parseInt(tfMásodperc.getText()) + Integer.parseInt(tf2Másodperc.getText());
       osszeg.IncrementSecond(osszeg);

        this.tfNapEredmény.setText(String.valueOf(osszeg.eredményNap));
        this.tfÓraEredmény.setText(String.valueOf(osszeg.eredményÓra));
        this.tfPercEredmény.setText(String.valueOf(osszeg.eredményPerc));
        this.tfMásodpercEredmény.setText(String.valueOf(osszeg.eredményMásodperc));
    }
    
    
    public static void main(String[] args) {
        IdőÁtalakító idő = new IdőÁtalakító("IdoAtalakito");
    }
    
}
