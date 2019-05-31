package PacoteCadastro;

import java.awt.*;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class CadastroCliente extends JFrame{ 
    //Variaveis para entrada de informação
    private JTextField tfCadastro;
    private JTextField tfNome;
    private JFormattedTextField tfSexo;
    private JFormattedTextField tfDtNasc;
    private JTextField tfIdade;
    private JTextField tfMae;
    private JTextField tfPai;
    private JFormattedTextField tfCPF;
    private JFormattedTextField tfTelefone;
    private JFormattedTextField tfCelular;
    private JTextField tfEmail;
    private JTextField tfEndereco;
    private JTextField tfBairro;
    private JTextField tfCidade;
    private JFormattedTextField tfUF;
    private JFormattedTextField tfCEP;
    
    public CadastroCliente() throws ParseException{
        //Titulo da Pagina Aberta
        setTitle("Cadastro de Cliente");
        setSize(700,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(0,2));
        
        //Ornazidor da Forma que as Informações serão inseridas
        tfCadastro = new JTextField();
        tfCadastro.setHorizontalAlignment(JTextField.CENTER);
        tfCadastro.setForeground(Color.BLUE);
        tfCadastro.setBackground(Color.LIGHT_GRAY);
                
        tfNome = new JTextField();
        tfNome.setHorizontalAlignment(JTextField.CENTER);
        
        MaskFormatter mascaraSexo = new MaskFormatter("U");
        tfSexo= new JFormattedTextField(mascaraSexo);
        tfSexo.setHorizontalAlignment(JFormattedTextField.CENTER);
        
        MaskFormatter mascaraDtNasc = new MaskFormatter("##/##/####");
        mascaraDtNasc.setPlaceholderCharacter('_');
        tfDtNasc = new JFormattedTextField(mascaraDtNasc);
        tfDtNasc.setHorizontalAlignment(JFormattedTextField.CENTER);
        
        tfIdade= new JFormattedTextField();
        tfIdade.setHorizontalAlignment(JTextField.CENTER);
        
        tfMae= new JTextField();
        tfMae.setHorizontalAlignment(JTextField.CENTER);
    
        tfPai= new JTextField();
        tfPai.setHorizontalAlignment(JTextField.CENTER);
    
        MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
        mascaraCPF.setPlaceholderCharacter('_');
        tfCPF = new JFormattedTextField(mascaraCPF);
        tfCPF.setHorizontalAlignment(JTextField.CENTER);
        
        MaskFormatter mascaraTelefone = new MaskFormatter("(##)#####-####");
        mascaraTelefone.setPlaceholderCharacter('_');
        tfTelefone= new JFormattedTextField(mascaraTelefone);
        tfTelefone.setHorizontalAlignment(JTextField.CENTER);
    
        MaskFormatter mascaraCelular = new MaskFormatter("(##)#####-####");
        mascaraCelular.setPlaceholderCharacter('_');
        tfCelular= new JFormattedTextField(mascaraCelular);
        tfCelular.setHorizontalAlignment(JTextField.CENTER);
        
        tfEmail = new JTextField();
        tfEmail.setHorizontalAlignment(JTextField.CENTER);
    
        tfEndereco = new JTextField();
        tfEndereco.setHorizontalAlignment(JTextField.CENTER);
    
        tfBairro = new JTextField();
        tfBairro.setHorizontalAlignment(JTextField.CENTER);
    
        tfCidade= new JTextField();
        tfCidade.setHorizontalAlignment(JTextField.CENTER);
    
        MaskFormatter mascaraUF = new MaskFormatter("UU");
        mascaraUF.setPlaceholderCharacter('_');
        tfUF = new JFormattedTextField(mascaraUF);
        tfUF.setHorizontalAlignment(JFormattedTextField.CENTER);
        
        MaskFormatter mascaraCEP = new MaskFormatter("##.###-###");
        mascaraCEP.setPlaceholderCharacter('_');
        tfCEP = new JFormattedTextField(mascaraCEP);
        tfCEP.setHorizontalAlignment(JFormattedTextField.CENTER);
        
        getContentPane( ).add(new JLabel("Numero de Cadastro"));
        getContentPane().add(tfCadastro);
        getContentPane( ).add(new JLabel("Nome"));
        getContentPane().add(tfNome);
        getContentPane( ).add(new JLabel("Sexo"));
        getContentPane().add(tfSexo);
        getContentPane( ).add(new JLabel("Data de Nascimento"));
        getContentPane().add(tfDtNasc);        
        getContentPane( ).add(new JLabel("Mãe: "));
        getContentPane().add(tfMae);
        getContentPane( ).add(new JLabel("Pai: "));
        getContentPane().add(tfPai);
        getContentPane( ).add(new JLabel("Idade:"));
        getContentPane().add(tfIdade);
        getContentPane( ).add(new JLabel("CPF: "));
        getContentPane().add(tfCPF);
        getContentPane( ).add(new JLabel("Telefone: "));
        getContentPane().add(tfTelefone);
        getContentPane( ).add(new JLabel("Celular: "));
        getContentPane().add(tfCelular);
        getContentPane( ).add(new JLabel("Email"));
        getContentPane().add(tfEmail);
        getContentPane( ).add(new JLabel("Endereço: "));
        getContentPane().add(tfEndereco);
        getContentPane( ).add(new JLabel("Bairro"));
        getContentPane().add(tfBairro);
        getContentPane( ).add(new JLabel("Cidade: "));
        getContentPane().add(tfCidade);
        getContentPane( ).add(new JLabel("UF: "));
        getContentPane().add(tfUF);
        getContentPane( ).add(new JLabel("CEP: "));
        getContentPane().add(tfCEP);
        getContentPane().add(new JButton("Cadastrar"));
        getContentPane().add(new JButton("Cancelar"));
    }
    public static void main(String[] args) throws ParseException {
        new CadastroCliente().setVisible(true);
    }
}
