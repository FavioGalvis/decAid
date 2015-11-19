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
        String fg_session_started = null;
        HttpSession fo_session = request.getSession();
        if (("begin".equals(fv_return_path)) && !("activated".equals(fo_session.getAttribute("fg_session_started")))){
            fv_return_page_head = fm_layout_header(true);
            fv_return_page_head = fv_return_page_head + fm_layout_menu();
            fv_return_page_foot = fm_layout_footer(true);
            url = "/init.jsp";
            request.setAttribute("fv_return_page_head",fv_return_page_head);
            request.setAttribute("fv_return_page_foot",fv_return_page_foot);
            fm_forward(url,request,response);
        } else if (("init".equals(fv_return_path)) && !("activated".equals(fo_session.getAttribute("fg_session_started")))){
            //HttpSession fo_session = request.getSession();
            fg_session_started = "creating_students";
            fo_session.setAttribute("fg_session_started", fg_session_started);
            String fg_http_response = "";
            Fc_pensum fo_pensum = new Fc_pensum();
            fo_session.setAttribute("fo_pensum",fo_pensum);
            fv_return_page_head = fm_layout_header(true);
            fv_return_page_head = fv_return_page_head + fm_layout_menu();
            fv_return_page_foot = fm_layout_footer(true);
            int fform_num_estd = Integer.parseInt(request.getParameter("fform_num_estd"));
            fo_session.setAttribute("fform_num_estd", fform_num_estd);
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
                        "<input type=\"text\" class=\"form-control\" name=\"fform_data_stud_name\" placeholder=\"Nombre\" required>"+
                        "<input type=\"email\" class=\"form-control\" name=\"fform_data_stud_email\" placeholder=\"Email\" required>"+
                        "<input type=\"number\" class=\"form-control\" name=\"fform_data_stud_cod\" placeholder=\"Codigo\" required>"+
                        "<input type=\"number\" class=\"form-control\" name=\"fform_data_stud_cc\" placeholder=\"Cedula\" required>"+
                        "<input type=\"number\" class=\"form-control\" name=\"fform_data_stud_sem\" placeholder=\"Semestre\" required>"+
                        "<select data-placeholder=\"Seleccione asignaturas...\" multiple class=\"chosen-select form-control\" name=\"fform_data_stud_pensum_"+i+"\" required>";
                        for ( int j=0;j<57;j++ ){
                           fg_http_response = fg_http_response+"   <option>"+fo_pensum.fv_pensum_desc[0][j]+"</option>";
                        }
                        fg_http_response = fg_http_response+"</select>"+
                    "</div>"+
                "</div>";
            }
            request.setAttribute("fg_http_response",fg_http_response);
            url = "/read.jsp";
            request.setAttribute("fv_return_page_head",fv_return_page_head);
            request.setAttribute("fv_return_page_foot",fv_return_page_foot);
            fm_forward(url,request,response);
        } else if (("init_notes".equals(fv_return_path)) && !("activated".equals(fo_session.getAttribute("fg_session_started")))){
            //HttpSession fo_session = request.getSession();
            fg_session_started = "creating_notes";
            fo_session.setAttribute("fg_session_started", fg_session_started);
            String fg_http_response = "";
            Fc_pensum fo_pensum = (Fc_pensum) fo_session.getAttribute("fo_pensum");
            fv_return_page_head = fm_layout_header(true);
            fv_return_page_head = fv_return_page_head + fm_layout_menu();
            fv_return_page_foot = fm_layout_footer(true);
            Integer fform_num_estd = (Integer) fo_session.getAttribute("fform_num_estd");
            String[] fform_data_stud_name = request.getParameterValues("fform_data_stud_name");
            fo_session.setAttribute("fform_data_stud_name", fform_data_stud_name);
            String[] fform_data_stud_email = request.getParameterValues("fform_data_stud_email");
            fo_session.setAttribute("fform_data_stud_email", fform_data_stud_email);
            String[] fform_data_stud_cod = request.getParameterValues("fform_data_stud_cod");
            fo_session.setAttribute("fform_data_stud_cod", fform_data_stud_cod);
            String[] fform_data_stud_cc = request.getParameterValues("fform_data_stud_cc");
            fo_session.setAttribute("fform_data_stud_cc", fform_data_stud_cc);
            String[] fform_data_stud_sem = request.getParameterValues("fform_data_stud_sem");
            fo_session.setAttribute("fform_data_stud_sem", fform_data_stud_sem);
            String fform_data_stud_pensum[][] = new String[10][fform_num_estd];
            
            String[] temp_2;
            String temp = "";
            for ( int j=0;j<fform_num_estd;j++ ){
                temp = "fform_data_stud_pensum_"+j;
                temp_2 = request.getParameterValues(temp);
                for ( int h=0;h<temp_2.length;h++ ){
                    fform_data_stud_pensum[h][j]=temp_2[h];
                }
            }
            for ( int i=0;i<fform_num_estd;i++ ){
                fg_http_response = fg_http_response+"<div class=\"form-group col-xs-2\">"+
                    "<div class=\"input-group\">"+
                        "<span class=\"input-group-addon\"><i class=\"fa fa-asterisk red\"></i>"+
                        "<"+(i+1)+"> "+fform_data_stud_name[i]+
                        "</span>"+
                    "</div>"+
                "</div>";
                fg_http_response = fg_http_response+
                "<div class=\"form-group col-xs-10\">";
                for( int k=0;k<10;k++ ){        
                    if( fform_data_stud_pensum[k][i]!=null ){
                        fg_http_response = fg_http_response+    
                        "<div class=\"input-group\" style=\"display: inline-flex;\">"+
                            "<span class=\"input-group-addon\" style=\"min-width: 200px;\">"+fform_data_stud_pensum[k][i]+"</span>"+
                            "<input type=\"number\" step=\"any\" min=\"0\" class=\"form-control\" name=\"fform_data_stud_"+i+"_asig_"+k+"_p1\" placeholder=\"P1\" required>"+
                            "<input type=\"number\" step=\"any\" min=\"0\" class=\"form-control\" name=\"fform_data_stud_"+i+"_asig_"+k+"_p2\" placeholder=\"P2\" required>"+
                            "<input type=\"number\" step=\"any\" min=\"0\" class=\"form-control\" name=\"fform_data_stud_"+i+"_asig_"+k+"_pf\" placeholder=\"PF\" required>"+
                        "</div>";
                    }
                }
                fg_http_response = fg_http_response+"</div>";     
            }
            fo_session.setAttribute("fform_data_stud_pensum", fform_data_stud_pensum);
            request.setAttribute("fg_http_response",fg_http_response);
            url = "/init_notes.jsp";
            request.setAttribute("fv_return_page_head",fv_return_page_head);
            request.setAttribute("fv_return_page_foot",fv_return_page_foot);
            fm_forward(url,request,response);
        } else if (("core".equals(fv_return_path)) && !("activated".equals(fo_session.getAttribute("fg_session_started")))){
            //HttpSession fo_session = request.getSession();
            fg_session_started = "creating_objets";
            fo_session.setAttribute("fg_session_started", fg_session_started);
            String fg_http_response = "";
            Fc_pensum fo_pensum = (Fc_pensum) fo_session.getAttribute("fo_pensum");
            fv_return_page_head = fm_layout_header(true);
            fv_return_page_head = fv_return_page_head + fm_layout_menu();
            fv_return_page_foot = fm_layout_footer(true);
            Integer fform_num_estd = (Integer) fo_session.getAttribute("fform_num_estd");
            Fc_estudiante fo_estudiante = new Fc_estudiante(fform_num_estd);
            String[] fform_data_stud_cod = (String []) fo_session.getAttribute("fform_data_stud_cod");
            String[] fform_data_stud_cc = (String []) fo_session.getAttribute("fform_data_stud_cc");
            String[] fform_data_stud_sem = (String []) fo_session.getAttribute("fform_data_stud_sem");
            String[] fform_data_stud_name = (String []) fo_session.getAttribute("fform_data_stud_name");
            String[] fform_data_stud_email = (String []) fo_session.getAttribute("fform_data_stud_email");
            String[][] fform_data_stud_pensum = (String [][]) fo_session.getAttribute("fform_data_stud_pensum");
            for ( int i=0;i<fform_num_estd;i++ ){
                fo_estudiante.fv_estd[0][i]=Integer.parseInt(fform_data_stud_cod[i]);
                fo_estudiante.fv_estd[1][i]=Integer.parseInt(fform_data_stud_cc[i]);
                fo_estudiante.fv_estd[2][i]=Integer.parseInt(fform_data_stud_sem[i]);
                fo_estudiante.fv_estd_string[0][i]=fform_data_stud_name[i];
                fo_estudiante.fv_estd_string[1][i]=fform_data_stud_email[i];
                for ( int j=0;j<10;j++ ){
                    if ( fform_data_stud_pensum[j][i]!=null ){
                        fo_estudiante.fv_estd_asig[j][i]=fo_pensum.fm_search_asig_cod_by_name ( fform_data_stud_pensum[j][i] );
                    }else{
                        fo_estudiante.fv_estd_asig[j][i]=0;
                    }
                }
            }
            Fc_calificacion fo_calificacion = new Fc_calificacion( fform_num_estd );
            //asignar valores al objeto de calificacion de parte del request te la pagina anterior.
            String temp = "";
            int k=0;
            for ( int i=0;i<fform_num_estd;i++ ){
                for( int j=0;j<10;j++ ){
                    if( fform_data_stud_pensum[j][i]!=null ){
                        fo_calificacion.fv_calf[0][k]=fo_estudiante.fv_estd[0][i];
                        fo_calificacion.fv_calf[1][k]=fo_estudiante.fv_estd_asig[j][i];
                        temp = "fform_data_stud_"+i+"_asig_"+j+"_p1";
                        temp = request.getParameter(temp);
                        fo_calificacion.fv_calf[2][k]=Double.parseDouble(temp);
                        temp = "fform_data_stud_"+i+"_asig_"+j+"_p2";
                        temp = request.getParameter(temp);
                        fo_calificacion.fv_calf[3][k]=Double.parseDouble(temp);
                        temp = "fform_data_stud_"+i+"_asig_"+j+"_pf";
                        temp = request.getParameter(temp);
                        fo_calificacion.fv_calf[4][k]=Double.parseDouble(temp);
                        fo_calificacion.fv_calf[5][k]=fo_calificacion.fm_calculate_calf_pf(fo_calificacion.fv_calf[2][k], fo_calificacion.fv_calf[3][k], fo_calificacion.fv_calf[4][k]);
                        if ( fo_calificacion.fv_calf[5][k]>=3 ){
                            fo_calificacion.fv_calf[6][k]=1;
                        } else {
                            fo_calificacion.fv_calf[6][k]=0;
                        }
                        k=k+1;
                    }
                }
            }
            fo_session.setAttribute("fo_estudiante",fo_estudiante);
            fo_session.setAttribute("fo_calificacion", fo_calificacion);
            request.setAttribute("fg_http_response",fg_http_response);
            url = "/core.jsp";
            request.setAttribute("fv_return_page_head",fv_return_page_head);
            request.setAttribute("fv_return_page_foot",fv_return_page_foot);
            fg_session_started = "activated";
            //fm_forward(url,request,response);
        }      
        if ( "activated".equals(fg_session_started)){
            Integer fpass_num_estd = (Integer) fo_session.getAttribute("fform_num_estd");
            Fc_estudiante fo_pass_estudiante = (Fc_estudiante) fo_session.getAttribute("fo_estudiante");
            Fc_calificacion fo_pass_calificacion = (Fc_calificacion) fo_session.getAttribute("fo_calificacion");
            Fc_pensum fo_pass_pensum = (Fc_pensum) fo_session.getAttribute("fo_pensum");
            Fc_sumary fo_sumary = new Fc_sumary( fpass_num_estd, fo_pass_estudiante,
                                            fo_pass_calificacion, fo_pass_pensum, fg_session_started );
            //temporal code
            request.setAttribute("fv_1",fo_sumary.fv_1);
            request.setAttribute("fv_2",fo_sumary.fv_2);
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
