package br.com.servlet;

import br.com.dao.PessoaDAO;
import br.com.modelos.Pessoa;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PessoaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Pessoa p = new Pessoa();
        
        p.setNome(request.getParameter("nome"));
        p.setTelefone(Long.parseLong(request.getParameter("telefone")));
        p.setEndereco(request.getParameter("endereco"));
        p.setEmail(request.getParameter("email"));
        p.setCpf(Long.parseLong(request.getParameter("cpf")));
        p.setGenero(request.getParameter("sexo"));
        
       PessoaDAO pDAO = new PessoaDAO();
       pDAO.inserirPessoa(p);
       
       // Conferir se a linha abaixo está correta na linkagem
       request.getRequestDispatcher("cadastro-cliente.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
