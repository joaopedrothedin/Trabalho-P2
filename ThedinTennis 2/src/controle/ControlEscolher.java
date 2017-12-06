/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.EscolherDAO;
import java.sql.SQLException;
import java.util.List;
import model.Escolher;

/**
 *
 * @author JoaoPedroThedin
 */
public class ControlEscolher {
    dao.EscolherDAO daoEscolher = new EscolherDAO();

    public void cadastrar(Escolher o) throws SQLException {
        daoEscolher.cadastrar(o);

    }

    public void excluir(Integer o) throws SQLException {
        daoEscolher.excluir(o);

    }

    public void alterar(Escolher o) throws SQLException {
        daoEscolher.alterar(o);

    }

    public List atualizarLista() throws SQLException {
        return daoEscolher.listarTodos();

    }
    
}
