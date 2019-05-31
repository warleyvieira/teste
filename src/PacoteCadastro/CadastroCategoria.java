package PacoteCadastro;
               
import java.awt.*;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class CadastroCategoria extends JFrame{ 
    //Variaveis para entrada de informação
    private JTextField tfIdCategoria;
    private JTextField tfCategoria;

    
    public CadastroCategoria() throws ParseException{
        //Titulo da Pagina Aberta
        setTitle("Cadastro de Categoria");
        setSize(900,250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(0,2));
        
        //Ornazidor da Forma que as Informações serão inseridas
        tfIdCategoria = new JTextField();
        tfIdCategoria.setHorizontalAlignment(JTextField.CENTER);
        tfIdCategoria.setForeground(Color.BLUE);
        tfIdCategoria.setBackground(Color.LIGHT_GRAY);
                
        tfCategoria = new JTextField("Informe o nome da categoria");
        tfCategoria.setHorizontalAlignment(JTextField.CENTER);
        
        getContentPane( ).add(new JLabel("Código da Categoria:"));
        getContentPane().add(tfIdCategoria);
        getContentPane( ).add(new JLabel("Descrição do Categoria: "));
        getContentPane().add(tfCategoria);
        getContentPane().add(new JButton("Cadastrar"));
        getContentPane().add(new JButton("Cancelar"));
    }
    public static void main(String[] args) throws ParseException {
        new CadastroCategoria().setVisible(true);
    }
}
