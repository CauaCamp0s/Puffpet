package br.com.dao;

import br.com.conexao.ConexaoBD;
import br.com.modelos.Pessoa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PessoaDAO {

    private ConexaoBD conBD;

    public PessoaDAO() {
        conBD = new ConexaoBD();
    }

    public void inserirPessoa(Pessoa p) {
        try {
            String sql = "insert into cliente (nome, telefone, endereco, email, cpf, genero) values (?, ?, ?, ?, ?, ?)";

            PreparedStatement pstm = conBD.abrirConexao().prepareStatement(sql);
            pstm.setString(1, p.getNome());
            pstm.setLong(2, p.getTelefone());
            pstm.setString(3, p.getEndereco());
            pstm.setString(4, p.getEmail());
            pstm.setLong(5, p.getCpf());
            pstm.setString(6, p.getGenero());
            
            System.out.println("DAO " + pstm);

            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Pessoa> listarPessoa() {
        try {
            String sql = "select * from pessoa";

            PreparedStatement pstm = conBD.abrirConexao().prepareStatement(sql);

            ResultSet rs = pstm.executeQuery();

            List<Pessoa> pessoas = new ArrayList();

            while (rs.next()) {
                Pessoa p = new Pessoa();

                p.setIdPessoa(rs.getInt(1));
                p.setNome(rs.getString(2));
                p.setTelefone(rs.getLong(3));
                p.setEndereco(rs.getString(4));
                p.setEmail(rs.getString(5));
                p.setCpf(rs.getLong(6));
                p.setGenero(rs.getString(7));

                pessoas.add(p);
            }

            return pessoas;
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Pessoa listarPessoa(int idPessoa) {

        try {
            String sql = "select * from pessoa where idpessoa = ?";

            PreparedStatement pstm = conBD.abrirConexao().prepareStatement(sql);
            pstm.setInt(1, idPessoa);

            ResultSet rs = pstm.executeQuery();

            Pessoa p = new Pessoa();

            while (rs.next()) {
                p.setIdPessoa(rs.getInt(1));
                p.setNome(rs.getString(2));
                p.setTelefone(rs.getLong(3));
                p.setEndereco(rs.getString(4));
                p.setEmail(rs.getString(5));
                p.setCpf(rs.getLong(6));
                p.setGenero(rs.getString(7));
            }

            return p;
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

}//fim classe PessoaDAO

