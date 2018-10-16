/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue
 */
public class Sregistro extends HttpServlet {

   
    private Connection conn;
     private String consul;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Statement sen;
        String nom=request.getParameter("nom");
        String usu=request.getParameter("usu");
        String pass=request.getParameter("pass");
        this.init_mysql();
        try{
             sen=conn.createStatement();
 consul="insert into usuario values('"+nom+"','"+usu+"','"+pass+"')";
             sen.executeUpdate(consul);
             
        }catch(SQLException e1){
            JOptionPane.showMessageDialog(null,"Error");
        }
        response.sendRedirect("menu.jsp");
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

    private void init_mysql(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           //Leer la conexion
           conn=DriverManager.getConnection("jdbc:mysql://localhost/usu","root","");         
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la base de datos");
        }   
    }
    
    
}
