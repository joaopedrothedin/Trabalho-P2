/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import dao.FabricaConexao;
import dao.ProdutoDAO;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import model.Produto;

/**
 *
 * @author JoaoPedroThedin
 */
public class ControlProduto {

    dao.ProdutoDAO daoProduto = new ProdutoDAO();

    public void cadastrar(Produto o) throws SQLException {
        daoProduto.cadastrar(o);

    }

    public void excluir(Integer o) throws SQLException {
        daoProduto.excluir(o);

    }

    public void alterar(Produto o) throws SQLException {
        daoProduto.alterar(o);

    }

    public List atualizarLista() throws SQLException {
        return daoProduto.listarTodos();

    }
  
      public void createPdf(String filename) throws DocumentException, FileNotFoundException, SQLException{
	
        
        TypedQuery<Produto> consulta = FabricaConexao.getConnection().createQuery("Select p from Produto p",Produto.class);
        List<Produto> produtos = consulta.getResultList();
        Document document = new Document();        
        PdfWriter.getInstance(document, new FileOutputStream(filename));        
        document.open();        
        document.add(new Paragraph("Produtos: "+produtos.size()));      
        for(Produto p : produtos){
            document.add(new Paragraph(p.getQuantidade()+"-"+p.getTipo()+"-"+p.getDia()+"-"+p.getComprador()));                  
        }                
        document.close();
    
   
}
}