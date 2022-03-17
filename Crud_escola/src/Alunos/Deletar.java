
package Alunos;

import DB.DB;
import DB.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Deletar {
    
    public void delete(Aluno a) {
        Connection conn = DB.getConnection();
        PreparedStatement stmt = null;

        try{
            stmt = conn.prepareStatement("DELETE FROM aluno WHERE codigo = ?");

            stmt.setInt(1, a.getCodigo());
            stmt.setString(2, a.getNome());

            stmt.executeUpdate();
        }

        catch(SQLException e){
            throw new DbException(e.getMessage());
        }

        finally{
            DB.closeConnection();
        }       
    } 
}
