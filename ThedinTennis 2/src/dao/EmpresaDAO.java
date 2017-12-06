/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import model.Empresa;

/**
 *
 * @author JoaoPedroThedin
 */
public class EmpresaDAO implements IDAO {

    public void CloseConnection() throws SQLException {
        FabricaConexao.getConnection().close();
    }

    @Override
    public void cadastrar(Object o) throws SQLException {
        FabricaConexao.getConnection().getTransaction().begin();
        FabricaConexao.getConnection().persist(o);
        FabricaConexao.getConnection().getTransaction().commit();
    }

    @Override
    public void alterar(Object o) throws SQLException {
        FabricaConexao.getConnection().getTransaction().begin();
        FabricaConexao.getConnection().merge(o);
        FabricaConexao.getConnection().getTransaction().commit();

    }
//

    @Override
    public List listarTodos() throws SQLException {
        TypedQuery<Empresa> query = FabricaConexao.getConnection().createQuery("SELECT e FROM Empresa e", Empresa.class);
        List<Empresa> lista = query.getResultList();
        return lista;

    }

    @Override
    public void excluir(Integer o) throws SQLException {
        FabricaConexao.getConnection().getTransaction().begin();
        Empresa e = FabricaConexao.getConnection().find(Empresa.class, o);
        FabricaConexao.getConnection().remove(e);
        FabricaConexao.getConnection().getTransaction().commit();

    }

}
