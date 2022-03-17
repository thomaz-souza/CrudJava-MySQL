
package Cursos;

import DB.DB;
import DB.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletarCursos {

    public void delete(Curso a) {
        Connection conn = DB.getConnection();
        PreparedStatement stmt = null;

        try{
            stmt = conn.prepareStatement("DELETE FROM aluno WHERE codigo = ?");

            stmt.setInt(1, a.getCodigo());
            stmt.setString(2, a.getDescricao());
            stmt.setString(3, a.getEmenta());

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
