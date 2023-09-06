package conexao;

import javax.swing.JOptionPane;
import java.sql.*;

public class Conexao {
    final  private String driver = "com.mysql.cj.jdbc.Driver";
    final private String url = "jdbc:mysql://127.0.0.1/bd_minimercado";
    final private String senha =  "";
    final private String usuario = "root";
    static  private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
    public boolean conecta () {
        boolean result = true;
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,usuario,senha);
            JOptionPane.showMessageDialog(null, "Conexão Estabelecida","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }catch (ClassNotFoundException Driver){
            JOptionPane.showMessageDialog(null, "Driver não localizado"+Driver,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            result = false;
        }catch (SQLException Fonte){
            JOptionPane.showMessageDialog(null, "Fonte de dados não localizada"+Fonte,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            result = false;
        }
        return result;
}
    public void desconecta(){
        try{
            conexao.close();
            JOptionPane.showMessageDialog(null, "Conexão com banco fechada","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException fecha){
            
        }
    }
    public void executaSQL(String sql){
        try{
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        }catch(SQLException excecao){
            JOptionPane.showMessageDialog(null, "Erro no comando SQL! \n Erro"+excecao,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}