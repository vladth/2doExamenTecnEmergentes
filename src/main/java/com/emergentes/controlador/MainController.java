
package com.emergentes.controlador;

import com.emergentes.modelo.Productos;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "MainController", urlPatterns = {"/MainController"})
public class MainController extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession ses = request.getSession();   
        String op = request.getParameter("op");
        String opcion = (op != null)? op : "view";
        
        
        if (ses.getAttribute("listaper") == null) {            
            ArrayList<Productos> listaux =new ArrayList<Productos>();
            ses.setAttribute("listaper", listaux);
        }
        
        ArrayList<Productos> lista = (ArrayList<Productos>)ses.getAttribute("listaper");
        
        
        switch(opcion){
            case "nuevo":
                Productos obj1 = new Productos();
                request.setAttribute("miPersona", obj1);
                request.getRequestDispatcher("editar.jsp").forward(request, response);
                break;
                
            case "editar":
                
                
                break;
            case "eliminar":
                
                break;
            case "view":
                response.sendRedirect("index.jsp");
                break;
                
            
        }
        response.sendRedirect("index.jsp");
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


}
