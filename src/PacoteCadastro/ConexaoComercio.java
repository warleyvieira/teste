package PacoteCadastro;
import java.sql.*;

public class ConexaoComercio{
    private static Connection conexao;
    
    public ConexaoComercio() throws Exception { 
     try {
       if (conexao !=null && !conexao.isClosed()) return;
       Class.forName("org.postgresql.Driver"); 
       conexao = DriverManager.getConnection( 
         "jdbc:postgres://localhost:5432/loja","postgres","82232536"); 
       conexao.setAutoCommit(false); 
       conexao.setTransactionIsolation( 
         Connection.TRANSACTION_READ_COMMITTED);
        }
        catch(ClassNotFoundException cnf) { 
            throw new Exception ("Driver não encontrado");
        }
        catch(SQLException sql) { 
            throw new Exception ("Falha ocorrida: " + sql.getMessage());
        }
    }    

public Connection getConexao() {
  return conexao;
}

public void fechar() throws Exception { 
  try{ 
    if (conexao == null || conexao.isClosed()) return; 
    conexao.close();
  }
  catch(SQLException sql) { 
    throw new Exception("Falha ocorrida: " + sql.getMessage()); 
  }
}
public void confirmarTransacao() throws Exception { 
  try { 
    if (conexao == null || conexao.isClosed()) return; 
    conexao.commit(); 
  }
  catch(SQLException sql) {
    throw new Exception ("Falha ocorrida:" + sql.getMessage()); 
  }
}
public void cancelarTransacao() throws Exception { 
    try { 
        if (conexao == null || conexao. isClosed()) return; 
        conexao.rollback(); 
    }
    catch(SQLException sql) { 
        throw new Exception ("Falha ocorrida:" + sql.getMessage());
    }
  }
}
