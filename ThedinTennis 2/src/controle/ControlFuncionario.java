/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.FuncionarioDAO;
import model.Funcionario;
import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author JoaoPedroThedin
 */
public class ControlFuncionario {
     dao.FuncionarioDAO daoFuncionario = new FuncionarioDAO();

    public void cadastrar(Funcionario o) throws SQLException {
        daoFuncionario.cadastrar(o);

    }

    public void excluir(Integer o) throws SQLException {
        daoFuncionario.excluir(o);

    }

    public void alterar(Funcionario o) throws SQLException {
        daoFuncionario.alterar(o);

    }

    public List atualizarLista() throws SQLException {
        return daoFuncionario.listarTodos();

    }
}
