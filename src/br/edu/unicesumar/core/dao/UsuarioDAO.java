
package br.edu.unicesumar.core.dao;

import br.edu.unicesumar.core.dao.conexao.ConexaoJDBC;
import br.edu.unicesumar.core.entity.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    
    public void inserir(Usuario usuario){
        String sql = "INSERT INTO USUARIO(NOME, LOGIN, SENHA, EMAIL) VALUES (?,?,?,?)";
        PreparedStatement ps;
         try {
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());
            
            ps.execute();
            
        }catch(SQLException e){
            e.printStackTrace();            
        }
        
    }
  
}
