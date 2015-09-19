/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.control.general;

import com.ethos.DAO.AbstractDAO;
import com.ethos.DAO.EstudiantesDAO;
import com.ethos.business.general.ActualizarDatos;
import com.ethos.business.general.FuncionesGenerales;
import com.ethos.model.ListasGeneralesModel;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Operaciones-GerenteC
 */
public class RegistroControl extends HttpServlet {

    private FuncionesGenerales funcionesGenerales;
    private ListasGeneralesModel listasGenerales;
    AbstractDAO estudianteDAO;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistroControl</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistroControl at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        HttpSession sesion = request.getSession();
        String json = "";
        funcionesGenerales = new FuncionesGenerales();
        ActualizarDatos actualizarDatos = new ActualizarDatos();
        try {
            if (!sesion.getAttribute("codUser").equals(null)) {

                int modulo = Integer.parseInt(request.getParameter("modulo"));
                System.out.println("gdhasd" + modulo);
                switch (6) {
                    case 1:
                        if (sesion.getAttribute("idPerfil").equals("7")) {
                            json = new Gson().toJson("acudiente");
                        } else {
                            json = new Gson().toJson(sesion.getAttribute("codUser"));
                        }
                        break;

                    case 2:
                        System.out.println("gdhasd" + modulo);
                        break;
                    case 3:
                        System.out.println("gdhasd" + modulo);
                        break;
                    case 4:
                        System.out.println("gdhasd" + modulo);
                        break;
                    case 5:
                        
                        break;
                    case 6:
                        listasGenerales=funcionesGenerales.obtenerDatosActualizar();
                        json=new Gson().toJson(listasGenerales);
                        break;
                }

            }

        } catch (Exception e) {
            System.out.println("Exception in Registro " + e);
        }
        response.setContentType("application/json;charset=Utf-8");
        response.getWriter().write(json);
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
        String json = "";
        funcionesGenerales = new FuncionesGenerales();
        ActualizarDatos actualizarDatos = new ActualizarDatos();

        try {
            BufferedReader reader = request.getReader();
            JsonObject dataJson = funcionesGenerales.recibirDatos(reader);
            json = new Gson().toJson(actualizarDatos.filtroEstudiantes(dataJson));
            System.out.println("json:" + json);
        } catch (Exception e) {
            System.err.println("Exception :" + e);
        }
        response.setContentType("application/json;charset=Utf-8");
        response.getWriter().write(json);
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
