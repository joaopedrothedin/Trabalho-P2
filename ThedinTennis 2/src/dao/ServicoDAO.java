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
import model.Servico;

/**
 *
 * @author JoaoPedroThedin
 */
public class ServicoDAO implements IDAO {
    
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

    @Override
    public void excluir(Integer o) throws SQLException {
        FabricaConexao.getConnection().getTransaction().begin();
        Servico s = FabricaConexao.getConnection().find(Servico.class, o);
        FabricaConexao.getConnection().remove(s);
        FabricaConexao.getConnection().getTransaction().commit();
    }

    @Override
    public List listarTodos() throws SQLException {
        TypedQuery<Servico> query = FabricaConexao.getConnection().createQuery("SELECT s FROM Servico s", Servico.class);
        List<Servico> lista = query.getResultList();
        return lista;

    }
}
