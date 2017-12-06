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
import dao.FinalizarDAO;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.TypedQuery;
import model.Finalizar;

/**
 *
 * @author JoaoPedroThedin
 */
public class ControlFinalizar {
    dao.FinalizarDAO daoFinalisar = new FinalizarDAO();

    public void cadastrar(Finalizar o) throws SQLException {
        daoFinalisar.cadastrar(o);

    }

    public void excluir(Integer o) throws SQLException {
        daoFinalisar.excluir(o);

    }

    public void alterar(Finalizar o) throws SQLException {
        daoFinalisar.alterar(o);

    }

    public List atualizarLista() throws SQLException {
        return daoFinalisar.listarTodos();

    }
    
    
    public void createPdf(String filename) throws DocumentException, FileNotFoundException, SQLException{
	
        
        TypedQuery<Finalizar> consulta = FabricaConexao.getConnection().createQuery("Select f from Finalizar f",Finalizar.class);
        List<Finalizar> finalizados = consulta.getResultList();
        Document document = new Document();        
        PdfWriter.getInstance(document, new FileOutputStream(filename));        
        document.open();        
        document.add(new Paragraph("Compras: "+finalizados.size()));      
        for(Finalizar f : finalizados){
            document.add(new Paragraph(f.getQuantidade()+"-"+f.getValor()+"-"+f.getDia()+"-"+f.getComprador()));                  
        }                
        document.close();       
}
}
