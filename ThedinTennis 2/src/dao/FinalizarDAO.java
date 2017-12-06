/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.TypedQuery;
import model.Finalizar;

/**
 *
 * @author JoaoPedroThedin
 */
public class FinalizarDAO implements IDAO{

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
        Finalizar f = FabricaConexao.getConnection().find(Finalizar.class, o);
        FabricaConexao.getConnection().remove(f);
        FabricaConexao.getConnection().getTransaction().commit();
    }

    @Override
    public List listarTodos() throws SQLException {

        TypedQuery<Finalizar> query = FabricaConexao.getConnection().createQuery("SELECT f FROM Finalizar f", Finalizar.class);
        List<Finalizar> lista = query.getResultList();
        return lista;
    }
}