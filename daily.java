

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class formdaily {

       JFrame f1;
       JLabel lblaccno,lblfname,lbllname,lbltype,lblamt,lblint,lblbal,lblcurr,lblflag,lblnarr;
       JTextField txtaccno,txtfname,txtlname,txttype,txtamt,txtint,txtbal,txtcurr,txtnarr;
       JComboBox cmbflag;
       JButton btnclear,btnclose,btnsave;


       JPanel p1,p2,p3;
       GridLayout gl102,gl12;
       FlowLayout fl;
      
       String sflag[] = {"Debit","Credit"};

       formdaily() {

                 f1 = new JFrame("Customer Transaction Entry");

                 lblaccno = new JLabel("Account No : ");
                 lblfname = new JLabel("First Name : ");
                 lbllname = new JLabel("Last Name : ");
                 lbltype = new JLabel("Account Type : ");
                 lblamt = new JLabel("Minimum Amount : ");
                 lblint = new JLabel("Rate Of Interest : ");
                 lblbal = new JLabel("Current Balance : ");
                 lblcurr = new JLabel("Enter The Amount : ");
                 lblflag = new JLabel("Select..Debit/Credit : ");
                 lblnarr = new JLabel("Enter The Narration : ");


                 txtaccno = new JTextField(10);
                 txtfname = new JTextField(15);
                 txtlname = new JTextField(15);
                 txttype = new JTextField(10);
                 txtamt = new JTextField(12);
                 txtint = new JTextField(5);
                 txtbal = new JTextField(12);
                 txtcurr = new JTextField(12);
                 cmbflag = new JComboBox(sflag);
                 txtnarr = new JTextField(50);

                 btnclear = new JButton("Clear");
                 btnclose = new JButton("Exit");
                 btnsave = new JButton("Save");

                 p1 = new JPanel();
                 p2 = new JPanel();

                 gl102 = new GridLayout(10,2);
                 gl12 = new GridLayout(1,2);
                 fl = new FlowLayout();

                 p1.setLayout(gl102);
                 p1.add(lblaccno);p1.add(txtaccno);
                 p1.add(lblfname);p1.add(txtfname);
                 p1.add(lbllname);p1.add(txtlname);
                 p1.add(lbltype);p1.add(txttype);
                 p1.add(lblamt);p1.add(txtamt);
                 p1.add(lblint);p1.add(txtint);
                 p1.add(lblbal);p1.add(txtbal);
                 p1.add(lblcurr);p1.add(txtcurr);
                 p1.add(lblflag);p1.add(cmbflag);
                 p1.add(lblnarr);p1.add(txtnarr);

                 p2.setLayout(fl);
                 p2.add(btnclear);
                 p2.add(btnsave);
                 p2.add(btnclose);

                 f1.setLayout(gl12);
                 f1.add(p1);
                 f1.add(p2);
                 f1.setSize(800,600);
                 f1.pack();
                 f1.setVisible(true);

       }  
}


