package PacoteCadastro;

import java.awt.*;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class CadastroProduto extends JFrame{ 
    //Variaveis para entrada de informação
    private JTextField tfIdProduto;
    private JTextField tfProduto;
    private JTextField tfPreco;
    private JTextField tfCategoria;
    
    public CadastroProduto() throws ParseException{
        //Titulo da Pagina Aberta
        setTitle("Cadastro de Produto");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(0,2));
        
        //Ornazidor da Forma que as Informações serão inseridas
        tfIdProduto = new JTextField();
        tfIdProduto.setHorizontalAlignment(JTextField.CENTER);
        tfIdProduto.setForeground(Color.BLUE);
        tfIdProduto.setBackground(Color.LIGHT_GRAY);
                
        tfProduto = new JTextField("Informe o produto");
        tfProduto.setHorizontalAlignment(JTextField.CENTER);
        
        tfPreco = new JTextField("Informe o valor");
        tfPreco.setHorizontalAlignment(JTextField.CENTER);
       
        tfCategoria = new JTextField("Informe a Categoria");
        tfCategoria.setHorizontalAlignment(JTextField.CENTER);
        
        getContentPane( ).add(new JLabel("Codigo do Produto :"));
        getContentPane().add(tfIdProduto);
        getContentPane( ).add(new JLabel("Descrição do Produto: "));
        getContentPane().add(tfProduto);
        getContentPane( ).add(new JLabel("Preco"));
        getContentPane().add(tfPreco);
        getContentPane( ).add(new JLabel("Categoria"));
        getContentPane().add(tfCategoria);
         getContentPane().add(new JButton("Cadastrar"));
        getContentPane().add(new JButton("Cancelar"));
    }
    public static void main(String[] args) throws ParseException {
        new CadastroProduto().setVisible(true);
    }
}
