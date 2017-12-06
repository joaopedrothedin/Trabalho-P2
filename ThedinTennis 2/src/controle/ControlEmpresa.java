/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.EmpresaDAO;
import java.sql.SQLException;
import java.util.List;
import model.Empresa;

/**
 *
 * @author JoaoPedroThedin
 */
public class ControlEmpresa {
     private dao.EmpresaDAO daoEmpresa = new EmpresaDAO();

    public void cadastrar(Empresa o) throws SQLException {
        daoEmpresa.cadastrar(o);

    }

    public void excluir(Integer o) throws SQLException {
        daoEmpresa.excluir(o);

    }

    public void alterar(Empresa o) throws SQLException {
        daoEmpresa.alterar(o);

    }

    public List atualizarLista() throws SQLException {
        return daoEmpresa.listarTodos();

    }
}
