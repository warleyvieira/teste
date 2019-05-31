import static javax.swing.JOptionPane.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class ValidaHorario {
    public static void main (String[]args) {
        DateFormat df = DateFormat.getTimeInstance(DateFormat.SHORT);
        df.setLenient(false);
        
        while (true)
            try {
                String str = "Informe um horário (Exemplo: 22:35)";
                str = showInputDialog(null,str);
                if (str==null) System.exit(0);
                
                Date horario = df.parse(str);
                str = "Horário formatado:" + df.format(horario);
                showMessageDialog(null,str,"mensagem",1);
            }catch(ParseException ex) {
                showMessageDialog(null,"dado inválido","erro",ERROR_MESSAGE);
                
            }
    }
    
}
