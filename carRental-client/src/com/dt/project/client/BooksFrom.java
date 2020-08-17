/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dt.project.client;

import java.applet.Applet;

/**
 *
 * @author hems
 */


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



class BooksFrom extends JFrame  implements ActionListener
{
	static BooksFrom frame;
ImageIcon m[];
JLabel l;
JButton b,b1;
int i,l1;
JPanel p;
private JButton btnBack;

public BooksFrom()
{
//   pic = new JLabel();
   getContentPane().setLayout(new BorderLayout( ));
   setSize(620,600);
   setVisible(true);
//   pic.setBounds(0, 0, 620, 600);
   JPanel p=new JPanel(new FlowLayout());
   p.setBackground(Color.BLACK);
   b=new JButton("Pre");
   b.setFont(new Font("Tahoma", Font.PLAIN, 14));
   b1=new JButton("Next");
   b1.setFont(new Font("Tahoma", Font.PLAIN, 14));
   p.add(b);
   p.add(b1);
   getContentPane().add(p,BorderLayout.SOUTH);
   
   btnBack = new JButton("Back");
   btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
   btnBack.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			UserSuccess.main(new String[]{});
			frame.dispose();
		}
	});
   
   p.add(btnBack);
   b.addActionListener(this);
   b1.addActionListener(this);
   m = new ImageIcon[4];
   m[0] = new ImageIcon("src/11.jpg");
   m[1] = new ImageIcon("src/22.jpg");
   m[2] = new ImageIcon("src/33.jpg");
   m[3] = new ImageIcon("src/44.jpg");
   l = new JLabel();
   l.setForeground(Color.DARK_GRAY);
   l.setBackground(Color.WHITE);
   l.setBounds(0,0,300,200);
   getContentPane().add(l,BorderLayout.CENTER);
   l.setIcon(m[0]);

}
public  void actionPerformed(ActionEvent e)
{

   if(e.getSource()==b)
   {
       if(i==0)
       {  
    	   i=4;
          // JOptionPane.showMessageDialog(null,"This is First Image");
       }
       else
           {
           i=i-1;
           l.setIcon(m[i]);
       }
   }
   if(e.getSource()==b1)
   {
       if(i==m.length-1)
       {  
    	   i=0;
          // JOptionPane.showMessageDialog(null,"This is LastImage");
       }
       else
           {
           i=i+1;
           l.setIcon(m[i]);
           }
			}

    }

public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				frame= new BooksFrom();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}



}
