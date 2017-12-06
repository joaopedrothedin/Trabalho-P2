/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.CategoriaDAO;
import java.sql.SQLException;
import java.util.List;
import model.Categoria;

/**
 *
 * @author JoaoPedroThedin
 */
public class ControlCategoria {
     dao.CategoriaDAO daoCategoriaEstoque = new CategoriaDAO();

    public void cadastrar(Categoria o) throws SQLException {
        daoCategoriaEstoque.cadastrar(o);

    }

    public void excluir(Integer o) throws SQLException {
        daoCategoriaEstoque.excluir(o);

    }

    public void alterar(Categoria o) throws SQLException {
        daoCategoriaEstoque.alterar(o);

    }

    public List atualizarLista() throws SQLException {
        return daoCategoriaEstoque.listarTodos();

    }
}
