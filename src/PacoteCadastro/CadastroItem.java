package PacoteCadastro;

import java.awt.*;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class CadastroItem extends JFrame{ 
    //Variaveis para entrada de informação
    private JTextField tfIdItem;
    private JTextField tfIdPedido;
    private JTextField tfIdProduto;
    private JTextField tfquantidade;
    private JTextField tfUnitario;
    
    
    public CadastroItem() throws ParseException{
        //Titulo da Pagina Aberta
        setTitle("Cadastro de Item");
        setSize(500,200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(0,2));
        
        //Ornazidor da Forma que as Informações serão inseridas
        tfIdItem = new JTextField("Informe Codigo do Item");
        tfIdItem.setHorizontalAlignment(JTextField.CENTER);
        tfIdItem.setForeground(Color.BLUE);
        tfIdItem.setBackground(Color.LIGHT_GRAY);
                
        tfIdPedido = new JTextField("Informe Codigo do Pedido");
        tfIdPedido.setHorizontalAlignment(JTextField.CENTER);
        
        tfIdProduto = new JTextField("Informe o Codigo do Produto ");
        tfIdProduto.setHorizontalAlignment(JTextField.CENTER);
        
        tfquantidade = new JTextField("Informe a quantidade ");
        tfquantidade.setHorizontalAlignment(JTextField.CENTER);
        
        tfUnitario = new JTextField("Informe o valor unitario ");
        tfUnitario.setHorizontalAlignment(JTextField.CENTER);
              
        getContentPane( ).add(new JLabel("Codigo do Item:"));
        getContentPane().add(tfIdItem);
        getContentPane( ).add(new JLabel("Codigo do Pedido: "));
        getContentPane().add(tfIdPedido);
        getContentPane( ).add(new JLabel("Codigo do Produto: "));
        getContentPane().add(tfIdProduto);
        getContentPane( ).add(new JLabel("Quantidade: "));
        getContentPane().add(tfquantidade);
        getContentPane( ).add(new JLabel("Valor Unitario (em R$): "));
        getContentPane().add(tfUnitario);
        getContentPane().add(new JButton("Cadastrar"));
        getContentPane().add(new JButton("Cancelar"));
    }
    public static void main(String[] args) throws ParseException {
        new CadastroItem().setVisible(true);
    }
}
