/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cacacliente;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author manie
 */
public class GruposForm_Ventana extends JFrame{
    private GroupLayout lay;
    private JTextField tNombre;
    private JButton crear;
    private JLabel lName, lWelcome, lUser, lLine, lSpace;
    private JButton aniadir;
    
    public GruposForm_Ventana(){        
        conf();
    }
    
    private void addGroup(String name){
        
    }
    
    private void conf(){
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setSize(600, 600);
        this.setTitle("Nuevo Grupo");
        this.getContentPane().setBackground(Color.BLACK);
        lay =new GroupLayout(this.getContentPane());
        lay.setAutoCreateContainerGaps(true);
        lay.setAutoCreateGaps(true);
        
        Font Broadway = new Font("Lucida Console", 1, 30);
        Font LucidCal = new Font("Lucida Handwriting", 1, 10);
        Font LucidNom = new Font("Lucida Sans Typewriter", 1, 15);
        tNombre = new JTextField();

        
        
        
        crear = new JButton("Log-in");
        crear.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent a){  
                    addGroup(tNombre.getText());
                }             
            }
        );
        
        lName = new JLabel("Clientes Adoran Chatear Aqui");
        lName.setFont(LucidCal);
        lWelcome = new JLabel("Grupos");
        lWelcome.setFont(Broadway);
        lUser = new JLabel("Nombre");
        lUser.setFont(LucidNom);
        lLine = new JLabel("______________________________");
        lSpace = new JLabel(" ");
        lLine.setForeground(Color.white);
        aniadir = new JButton("+");
        lName.setForeground(Color.white);
        lUser.setForeground(Color.white);
        lWelcome.setForeground(Color.white);
        
        lay.setHorizontalGroup(
            lay.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addGroup(lay.createSequentialGroup()
                            .addGroup(lay.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(lSpace)                                
                                .addComponent(lName)
                                .addComponent(lSpace)                                     
                                .addComponent(lWelcome)
                            
                            )
                    )
                    .addGroup(lay.createSequentialGroup()
                            .addGroup(lay.createParallelGroup()
                                .addComponent(lUser)
                                .addComponent(tNombre)
                                .addComponent(aniadir)                         
                            )
                    )
                    .addGroup(lay.createSequentialGroup()
                            .addGroup(lay.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(lSpace)
                                
                                .addComponent(lLine)
                                .addComponent(lSpace)
                                                         
                            )
                    )        
        );
        
        lay.setVerticalGroup(
            lay.createSequentialGroup()
                    .addGroup(lay.createParallelGroup()
                            .addGroup(lay.createSequentialGroup()
                                .addComponent(lName)
                                .addComponent(lSpace)                                     
                                .addComponent(lWelcome)   
                                .addComponent(lSpace) 
                            )
                    )
                    .addGroup(lay.createParallelGroup()
                            .addGroup(lay.createSequentialGroup()
                                .addComponent(lUser)
                                .addComponent(tNombre)
                                .addComponent(aniadir)                         
                            )
                    )
                    .addGroup(lay.createParallelGroup()
                            .addGroup(lay.createSequentialGroup()
                                .addComponent(lSpace)                                    
                                
                                .addComponent(lLine)
                                .addComponent(lSpace)                                    
                                                         
                            )
                    )                    
                    



        );
        
        this.setLayout(lay);
        this.pack();
    }
    
    private void putUser(JPanel panel){
        JTextField user;
        user = new JTextField();
        panel.add(user);
        this.pack();
    }
}
