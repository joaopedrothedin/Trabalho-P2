/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.ServicoDAO;
import model.Servico;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author JoaoPedroThedin
 */
public class ControlServico {
    dao.ServicoDAO daoServico = new ServicoDAO();

    public void cadastrar(Servico o) throws SQLException {
        daoServico.cadastrar(o);

    }

    public void excluir(Integer o) throws SQLException {
        daoServico.excluir(o);

    }

    public void alterar(Servico o) throws SQLException {
        daoServico.alterar(o);

    }

    public List atualizarLista() throws SQLException {
        return daoServico.listarTodos();

    }
}
