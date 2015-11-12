/*
# decAid - A JSP-Java based Student Sumary and Control System
# decAid is open software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Open Software Foundation, either version 2 of the License, or
# (at your option) any later version.
# decAid is distributed under the protection of the
# GNU General Public License for more details.
# You should have received a copy of the GNU General Public License
# along with decAid.  If not, see <http://www.gnu.org/licenses/gpl.html>.
*/
/*******************************************************************/
/* decAid - A JSP-Java based Student Sumary and Control System      /
/* @package fg_java_package                                         /
/* @copyright Copyright (C) 2015 - Favio Arturo Galvis Gamboa       /
/* @developer favio.agg@gmail.com                                   /
/*******************************************************************/
package fp_java_package;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static fp_java_package.Fc_layout.*;

/**
 *
 * @author FGALVIS
 */
@WebServlet(
    name = "fs_core_servlet",
    description = "Core and Init servlet for decAid",
    urlPatterns = "/start"
)
public class Fc_core extends HttpServlet {
    public String main (int c) {
        c = c+1;
        return String.valueOf(c);
    }
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    /*@Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Fc_core clase = new Fc_core();
        String fv_return_path = request.getParameter("start");
        String d = request.getParameter("b");
        String fv_forward_url = "/index.jsp";
        String e="";
        try {
            e = clase.main(Integer.parseInt(d));
        } catch ( NumberFormatException f ) {
            e = "24";
        }
        if ( fv_return_path != null) {
            request.setAttribute("fv_return_path", fv_return_path);
            request.setAttribute("b", e);
        }

        Fc_pensum aaa = new Fc_pensum(); 
        HttpSession abc = request.getSession();
        abc.setAttribute("pensum", aaa);

        ServletContext fv_sc = getServletContext();
        RequestDispatcher fv_rd = fv_sc.getRequestDispatcher(fv_forward_url);
        fv_rd.forward(request, response);
    }*/
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fv_return_path = request.getParameter("fform_begin");
        String fv_return_page_head = null;
        String fv_return_page_foot = null;
        String url = null;
        if (("begin".equals(fv_return_path)) && !("activated".equals(request.getParameter("fg_session_started")))){
            fv_return_page_head = fm_layout_header(true);
            fv_return_page_head = fv_return_page_head + fm_layout_menu();
            fv_return_page_foot = fm_layout_footer(true);
            url = "/init.jsp";
            request.setAttribute("fv_return_page_head",fv_return_page_head);
            request.setAttribute("fv_return_page_foot",fv_return_page_foot);
            fm_forward(url,request,response);
        } else if (("init".equals(fv_return_path)) && !("activated".equals(request.getParameter("fg_session_started")))){
            HttpSession fo_session = request.getSession();
            String fg_session_started = "creating";
            String fg_http_response = "";
            Fc_pensum fo_pensum = new Fc_pensum();
            fv_return_page_head = fm_layout_header(true);
            fv_return_page_head = fv_return_page_head + fm_layout_menu();
            fv_return_page_foot = fm_layout_footer(true);
            int fform_num_estd = Integer.parseInt(request.getParameter("fform_num_estd"));
            for ( int i=0;i<fform_num_estd;i++ ){
                fg_http_response = fg_http_response+"<div class=\"form-group col-xs-2\">"+
                    "<div class=\"input-group\">"+
                        "<span class=\"input-group-addon\"><i class=\"fa fa-asterisk red\"></i>"+
                        "Estudiante "+(i+1)+
                        "</span>"+
                    "</div>"+
                "</div>";
                fg_http_response = fg_http_response+
                "<div class=\"form-group col-xs-10\">"+
                    "<div class=\"input-group\">"+
                        "<span class=\"input-group-addon\"><i class=\"fa fa-asterisk red\"></i></span>"+
                        "<input type=\"text\" class=\"form-control\" name=\"ffrom_data_stud\" placeholder=\"Nombre\" required>"+
                        "<input type=\"email\" class=\"form-control\" name=\"ffrom_data_stud\" placeholder=\"Email\" required>"+
                        "<input type=\"number\" class=\"form-control\" name=\"ffrom_data_stud\" placeholder=\"Codigo\" required>"+
                        "<input type=\"number\" class=\"form-control\" name=\"ffrom_data_stud\" placeholder=\"Cedula\" required>"+
                        "<input type=\"number\" class=\"form-control\" name=\"ffrom_data_stud\" placeholder=\"Semestre\" required>"+
                        "<select id=\"multiple\" multiple class=\"form-control\" name=\"ffrom_data_stud\" required>";
                        for ( int j=0;j<57;j++ ){
                            
                        }
                fg_http_response = fg_http_response+        
                        "   <option>1</option>"+
                        "   <option>2</option>"+
                        "   <option>3</option>"+
                        "   <option>4</option>"+
                        "   <option>5</option>"+
                        
                        
                        "</select>"+
                    "</div>"+
                "</div>";
            }
            request.setAttribute("fg_http_response",fg_http_response);
            url = "/read.jsp";
            request.setAttribute("fv_return_page_head",fv_return_page_head);
            request.setAttribute("fv_return_page_foot",fv_return_page_foot);
            fm_forward(url,request,response);
        }
    }
    
    public void fm_forward (String fv_forward_url,HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext fv_sc = getServletContext();
        RequestDispatcher fv_rd = fv_sc.getRequestDispatcher(fv_forward_url);
        fv_rd.forward(request,response);
    }
    
    
}
