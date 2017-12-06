/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author JoaoPedroThedin
 */
public class FabricaConexao {

    private static EntityManager jpaconexao = null;

    private FabricaConexao() throws SQLException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
        FabricaConexao.jpaconexao = emf.createEntityManager();
    }

    public static EntityManager getConnection() throws SQLException {
        if (FabricaConexao.jpaconexao == null) {
            new FabricaConexao();
            return FabricaConexao.jpaconexao;
        } else {
            return FabricaConexao.jpaconexao;
        }
    }
}
