package br.com.dao;

import br.com.conexao.ConexaoBD;
import br.com.modelos.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FornecedorDAO {
    private ConexaoBD conBD;

    public FornecedorDAO() {
        conBD = new ConexaoBD();
    }
    
    public void inserirFornecedor(Fornecedor f){
        try {
            String sql = "insert into fornecedor (razaosocial, email, endereco, cnpj, nome, funcao) values (?, ?, ?, ?, ?, ?)";
            
            PreparedStatement pstm = conBD.abrirConexao().prepareStatement(sql);
            pstm.setString(1, f.getRazaoSocial());
            pstm.setString(2, f.getEmail());
            pstm.setString(3, f.getEndereco());
            pstm.setLong(4, f.getCnpj());
            pstm.setString(5, f.getNome());
            pstm.setString(6, f.getFuncao());
            
            pstm.executeUpdate();
        }
        catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Fornecedor> listarFornecedor() {
        try {
            String sql = "select * from fornecedor";

            PreparedStatement pstm = conBD.abrirConexao().prepareStatement(sql);

            ResultSet rs = pstm.executeQuery();

            List<Fornecedor> fornecedores = new ArrayList();

            while (rs.next()) {
                Fornecedor f = new Fornecedor();

                f.setIdFornecedor(rs.getInt(1));
                f.setRazaoSocial(rs.getString(2));
                f.setEmail(rs.getString(3));
                f.setEndereco(rs.getString(4));
                f.setCnpj(rs.getLong(5));
                f.setNome(rs.getString(6));
                f.setFuncao(rs.getString(7));

                fornecedores.add(f);
            }

            return fornecedores;
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Fornecedor listarFornecedor(int idFornecedor) {

        try {
            String sql = "select * from fornecedor where idfornecedor = ?";

            PreparedStatement pstm = conBD.abrirConexao().prepareStatement(sql);
            pstm.setInt(1, idFornecedor);

            ResultSet rs = pstm.executeQuery();

            Fornecedor f = new Fornecedor();

            while (rs.next()) {
                f.setIdFornecedor(rs.getInt(1));
                f.setRazaoSocial(rs.getString(2));
                f.setEmail(rs.getString(3));
                f.setEndereco(rs.getString(4));
                f.setCnpj(rs.getLong(5));
                f.setNome(rs.getString(6));
                f.setFuncao(rs.getString(7));
            }

            return f;
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    /* public void alterarFornecedor(Fornecedor f) {

        try {
            String sql = "update fornecedor set razaosocial = ?, email = ?, endereco = ?, cnpj = ?, nome = ?, funcao = ? where idfornecedor = ?";

            PreparedStatement pstm = conBD.abrirConexao().prepareStatement(sql);
            pstm.setString(1, f.getRazaoSocial());
            pstm.setString(2, f.getEmail());
            pstm.setString(3, f.getEndereco());
            pstm.setLong(4, f.getCnpj());
            pstm.setString(5, f.getNome());
            pstm.setString(6, f.getFuncao());

            pstm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    } */

    public void excluirFornecedor(int idFornecedor) {
        try {
            String sql = "delete from fornecedor where idfornecedor = ?";

            PreparedStatement pstm = conBD.abrirConexao().prepareStatement(sql);
            pstm.setInt(1, idFornecedor);

            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}