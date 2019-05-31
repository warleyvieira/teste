package PacoteCadastro;

import java.awt.*;
import javax.swing.*;


public class Login extends JFrame{
    private JTextField tfUsuario;
    private JPasswordField tfSenha;
    
    public Login(){
        setTitle("Login");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(3,2,5,5));
        
        tfUsuario = new JTextField("Informe seu Usuario");
        tfUsuario.setHorizontalAlignment(JTextField.CENTER);
        
        tfSenha = new JPasswordField();  
        tfSenha.setBackground(Color.LIGHT_GRAY);
        tfSenha.setEchoChar('*');
        
        getContentPane().add(new JLabel("Identificação: "));
        getContentPane().add(tfUsuario);
        getContentPane().add(new JLabel("Senha: "));
        getContentPane().add(tfSenha);
        getContentPane().add(new JButton("OK"));
        getContentPane().add(new JButton("Cancelar"));
    }
   
    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}
