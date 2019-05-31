package PacoteCadastro;

import java.awt.*;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class CadastroPedido extends JFrame{ 
    //Variaveis para entrada de informação
    private JTextField tfIdPedido;
    private JFormattedTextField jtfDtPedido;
    private JFormattedTextField jtfhorario;
    private JTextField tfidCliente;
    private JTextField tfstatus;
    
    public CadastroPedido() throws ParseException{
        //Titulo da Pagina Aberta
        setTitle("Cadastro de Pedido");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(0,2));
        
        //Ornazidor da Forma que as Informações serão inseridas
        tfIdPedido = new JTextField();
        tfIdPedido.setHorizontalAlignment(JTextField.CENTER);
        tfIdPedido.setForeground(Color.BLUE);
        tfIdPedido.setBackground(Color.LIGHT_GRAY);
        
         MaskFormatter mascaraDtPedido = new MaskFormatter("##/##/####");
        mascaraDtPedido.setPlaceholderCharacter('_');
        jtfDtPedido = new JFormattedTextField(mascaraDtPedido);
        jtfDtPedido.setHorizontalAlignment(JFormattedTextField.CENTER);
        
        MaskFormatter mascaraHorario = new MaskFormatter("##:##");
        mascaraHorario.setPlaceholderCharacter('_');
        jtfhorario = new JFormattedTextField(mascaraHorario);
        jtfhorario.setHorizontalAlignment(JFormattedTextField.CENTER);
                
        tfidCliente = new JTextField("Informe Codigo do Cliente");
        tfidCliente.setHorizontalAlignment(JTextField.CENTER);
        
        tfstatus = new JTextField("Informe o status");
        tfstatus.setHorizontalAlignment(JTextField.CENTER);
       
        
        getContentPane( ).add(new JLabel("Codigo do Pedido :"));
        getContentPane().add(tfIdPedido);
        getContentPane( ).add(new JLabel("Data do Pedido: "));
        getContentPane().add(jtfDtPedido);
        getContentPane( ).add(new JLabel("Horario do Pedido"));
        getContentPane().add(jtfhorario);
        getContentPane( ).add(new JLabel("Codigo do Cliente"));
        getContentPane().add(tfidCliente);
        getContentPane( ).add(new JLabel("Status do Pedido"));
        getContentPane().add(tfstatus);
         getContentPane().add(new JButton("Cadastrar"));
        getContentPane().add(new JButton("Cancelar"));
    }
    public static void main(String[] args) throws ParseException {
        new CadastroPedido().setVisible(true);
    }
}
