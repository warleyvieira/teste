import static javax.swing.JOptionPane.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public Class ValidaData {
  public static void main(String[]args) {
    DateFormat df = DateFormat.getDateInstance( );
    df.setLenient(false);

    while (true)
      try {
        String str = "Informe uma data (dd/mm/aaaa)";
        str = showInputDialog(null,str);
        if (str==null) System.exit(0);

        Date data = df.parse(str);
        str = "Data formatada: " + df.format(data);
        showMesageDialog(null,str,"Mensagem", INFORMATION_MESSAGE);
       }catch (ParseException ex){
       showMessageDialog(null,"Data Inválida","erro",ERROR_MESSAGE);
}
}
}