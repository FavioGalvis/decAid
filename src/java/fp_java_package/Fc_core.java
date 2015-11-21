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
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fv_return_path = request.getParameter("fform_begin");
        String fv_return_page_head = null;
        String fv_return_page_foot = null;
        String url = null;
        String fg_session_started = null;
        HttpSession fo_session = request.getSession();
        String fg_http_response = "";
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
            /*url = "/core.jsp";
            request.setAttribute("fv_return_page_head",fv_return_page_head);
            request.setAttribute("fv_return_page_foot",fv_return_page_foot);*/
            fg_session_started = "activated";
            fo_session.setAttribute("fg_session_started",fg_session_started);
        }      
        if ( ("activated".equals(fo_session.getAttribute("fg_session_started"))) && !("reset".equals(fv_return_path)) ){
            fv_return_page_head = fm_layout_header(true);
            fv_return_page_head = fv_return_page_head + fm_layout_menu();
            fv_return_page_foot = fm_layout_footer(true);
            url = "/core.jsp";
            request.setAttribute("fv_return_page_head",fv_return_page_head);
            request.setAttribute("fv_return_page_foot",fv_return_page_foot);
            Integer fpass_num_estd = (Integer) fo_session.getAttribute("fform_num_estd");
            Fc_estudiante fo_pass_estudiante = (Fc_estudiante) fo_session.getAttribute("fo_estudiante");
            Fc_calificacion fo_pass_calificacion = (Fc_calificacion) fo_session.getAttribute("fo_calificacion");
            Fc_pensum fo_pass_pensum = (Fc_pensum) fo_session.getAttribute("fo_pensum");
            fg_session_started = (String) fo_session.getAttribute("fg_session_started");
            Fc_sumary fo_sumary = new Fc_sumary( fpass_num_estd, fo_pass_estudiante,
                                            fo_pass_calificacion, fo_pass_pensum, fg_session_started );
            //temporal code
            fg_http_response = fg_http_response + "<div id=\"loader-wrapper\">"+
                    "<div id=\"loader\"></div>"+
                    "<div class=\"loader-section section-left\"></div>"+
                    "<div class=\"loader-section section-right\"></div>"+
                "</div>";
                fg_http_response = fg_http_response + "<div id=\"content\">"+
                    "<div>"+
                        "<!-- Nav tabs -->"+
                        "<ul class=\"nav nav-tabs\" role=\"tablist\">"+
                          "<li role=\"presentation\" class=\"active\"><a href=\"#generic\" aria-controls=\"generic\" role=\"tab\" data-toggle=\"tab\">Genericas</a></li>"+
                          "<li role=\"presentation\"><a href=\"#global\" aria-controls=\"global\" role=\"tab\" data-toggle=\"tab\">Globales</a></li>"+
                          "<li role=\"presentation\"><a href=\"#student\" aria-controls=\"student\" role=\"tab\" data-toggle=\"tab\">Estudiantes</a></li>"+
                          "<li role=\"presentation\"><a href=\"#configuration\" aria-controls=\"configuration\" role=\"tab\" data-toggle=\"tab\">Configuración</a></li>"+
                        "</ul>"+
                        "<!-- Tab panes -->"+
                        "<div class=\"tab-content\">"+
                            "<div role=\"tabpanel\" class=\"tab-pane fade in active\" id=\"generic\">"+
                            /*Inicio Tabulador 1*/
                                "<div class=\"panel-group\" id=\"accordion\" role=\"tablist\" aria-multiselectable=\"true\">"+
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"headingA\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseA\" aria-expanded=\"true\" aria-controls=\"collapseA\">"+
                                                    "Total de Estudiantes Matriculados"+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapseA\" class=\"panel-collapse collapse in\" role=\"tabpanel\" aria-labelledby=\"headingA\">"+
                                            "<div class=\"panel-body\">"+
                                                "<div class=\"col-xs-12\">"+
                                                    fpass_num_estd+
                                                "</div>"+
                                            "</div>"+
                                        "</div>"+
                                    "</div>"+
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"headingB\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseB\" aria-expanded=\"false\" aria-controls=\"collapseB\">"+
                                                    "Total de Materias Matriculadas"+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapseB\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingB\">"+
                                            "<div class=\"panel-body\">"+
                                                (fo_sumary.fv_14+fo_sumary.fv_17)+
                                            "</div>"+
                                        "</div>"+
                                    "</div>"+
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"headingC\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseC\" aria-expanded=\"false\" aria-controls=\"collapseC\">"+
                                                    "Total de Creditos Cursados"+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapseC\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingC\">"+
                                            "<div class=\"panel-body\">"+
                                                (fo_sumary.fv_15+fo_sumary.fv_18)+
                                            "</div>"+
                                        "</div>"+
                                    "</div>"+
                                "</div>"+
                            "</div>"+
                            /*Fin Tabulador 1*/
                            "<div role=\"tabpanel\" class=\"tab-pane fade\" id=\"global\">"+
                            /*Inicio Tabulador 2*/
                                "<div class=\"panel-group\" id=\"accordion\" role=\"tablist\" aria-multiselectable=\"true\">"+
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"headingOne\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseOne\" aria-expanded=\"true\" aria-controls=\"collapseOne\">"+
                                                //1 y 2
                                                    "Suma de Estudiantes con Semestre Aprovado/Reprobado"+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapseOne\" class=\"panel-collapse collapse in\" role=\"tabpanel\" aria-labelledby=\"headingOne\">"+
                                            "<div class=\"panel-body\">"+
                                                "<div class=\"col-xs-12\">"+
                                                    "Aprobado: "+fo_sumary.fv_1+" - Reprobado: "+fo_sumary.fv_2+
                                                "</div>"+
                                            "</div>"+
                                        "</div>"+
                                    "</div>"+
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"headingTwo\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseTwo\" aria-expanded=\"false\" aria-controls=\"collapseTwo\">"+
                                                //3 y 4
                                                    "Total de Materias Aprobadas/Reprobadas"+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapseTwo\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingTwo\">"+
                                            "<div class=\"panel-body\">"+
                                                "Aprobadas: "+fo_sumary.fv_3+" - Reprobadas: "+fo_sumary.fv_4+
                                            "</div>"+
                                        "</div>"+
                                    "</div>"+
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"headingThree\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseThree\" aria-expanded=\"false\" aria-controls=\"collapseThree\">"+
                                                //5 y 6
                                                    "Promedio de Notas Definitivas de Materias Aprobadas/Reprobadas"+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapseThree\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingThree\">"+
                                            "<div class=\"panel-body\">"+
                                                "Prom. Aprobadas: "+fo_sumary.fv_5+" - Prom. Reprobadas: "+fo_sumary.fv_6+
                                            "</div>"+
                                        "</div>"+
                                    "</div>"+
                                    //continuar
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"headingFour\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseFour\" aria-expanded=\"false\" aria-controls=\"collapseFour\">"+
                                                //7 y 8
                                                    "Semestres Aprobados: Suma de Creditos de Materias Aprobadas/Reprobadas"+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapseFour\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingFour\">"+
                                            "<div class=\"panel-body\">"+
                                                "Sum. Cred. Aprobadas: "+fo_sumary.fv_7+" - Sum. Cred. Reprobadas: "+fo_sumary.fv_8+
                                            "</div>"+
                                        "</div>"+
                                    "</div>"+
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"headingFive\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseFive\" aria-expanded=\"false\" aria-controls=\"collapseFive\">"+
                                                //9 y 10
                                                    "Semestres Reprobados: Suma de Creditos de Materias Aprobadas/Reprobadas"+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapseFive\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingFive\">"+
                                            "<div class=\"panel-body\">"+
                                                "Sum. Cred. Aprobadas: "+fo_sumary.fv_9+" - Sum. Cred. Reprobadas: "+fo_sumary.fv_10+
                                            "</div>"+
                                        "</div>"+
                                    "</div>"+
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"headingSix\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseSix\" aria-expanded=\"false\" aria-controls=\"collapseSix\">"+
                                                //11
                                                    "Estudiante con Mayor Promedio Ponderado"+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapseSix\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingSix\">"+
                                            "<div class=\"panel-body\">"+
                                                "Nombre: "+fo_pass_estudiante.fm_search_stud_nom_by_cod((int)fo_sumary.fv_11[1], fo_pass_estudiante)+" - Codigo: "+fo_sumary.fv_11[1]+" - Promedio: "+fo_sumary.fv_11[0]+
                                            "</div>"+
                                        "</div>"+
                                    "</div>"+
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"headingSeven\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseSeven\" aria-expanded=\"false\" aria-controls=\"collapseSeven\">"+
                                                //12
                                                    "Estudiante con Menor Promedio Ponderado"+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapseSeven\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingSeven\">"+
                                            "<div class=\"panel-body\">"+
                                                "Nombre: "+fo_pass_estudiante.fm_search_stud_nom_by_cod((int)fo_sumary.fv_12[1], fo_pass_estudiante)+" - Codigo: "+fo_sumary.fv_12[1]+" - Promedio: "+fo_sumary.fv_12[0]+
                                            "</div>"+
                                        "</div>"+
                                    "</div>"+
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"headingEigth\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseEigth\" aria-expanded=\"false\" aria-controls=\"collapseEigth\">"+
                                                //13
                                                    "Promedio General de Promedios Ponderados"+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapseEigth\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingEigth\">"+
                                            "<div class=\"panel-body\">"+
                                                "Prom. Promedios Ponderados: "+fo_sumary.fv_13+
                                            "</div>"+
                                        "</div>"+
                                    "</div>"+
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"headingNine\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseNine\" aria-expanded=\"false\" aria-controls=\"collapseNine\">"+
                                                //14, 15 y 16
                                                    "Asignaturas Tipo A"+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapseNine\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingNine\">"+
                                            "<div class=\"panel-body\">"+
                                                "Asignaturas Tipo A: "+fo_sumary.fv_14+" - Total Creditos:"+fo_sumary.fv_15+" - Promedio Creditos: "+fo_sumary.fv_16+
                                            "</div>"+
                                        "</div>"+
                                    "</div>"+
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"headingTen\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseTen\" aria-expanded=\"false\" aria-controls=\"collapseTen\">"+
                                                //17, 18 y 19
                                                    "Asignaturas Tipo B"+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapseTen\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingTen\">"+
                                            "<div class=\"panel-body\">"+
                                                "Asignaturas Tipo B: "+fo_sumary.fv_17+" - Total Creditos:"+fo_sumary.fv_18+" - Promedio Creditos: "+fo_sumary.fv_19+
                                            "</div>"+
                                        "</div>"+
                                    "</div>"+
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"headingEleven\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseEleven\" aria-expanded=\"false\" aria-controls=\"collapseEleven\">"+
                                                //20, 21, 22, 23
                                                    "Suma de Rangos de Promedios Ponderados"+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapseEleven\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingEleven\">"+
                                            "<div class=\"panel-body\">"+
                                                "Prom. Ponderado <2: "+fo_sumary.fv_20+" - >=2 y <3:"+fo_sumary.fv_21+" - >=3 y <4: "+fo_sumary.fv_22+" - >=4 y <=5: "+fo_sumary.fv_23+
                                            "</div>"+
                                        "</div>"+
                                    "</div>"+
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"headingTwelve\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseTwelve\" aria-expanded=\"false\" aria-controls=\"collapseTwelve\">"+
                                                //24
                                                    "Rango de suma de Promedios Ponderados mas Alto"+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapseTwelve\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingTwelve\">"+
                                            "<div class=\"panel-body\">"+
                                                "Rango: ";
                                                if ( fo_sumary.fv_24[1]==1 ){
                                                    fg_http_response = fg_http_response + "<2";
                                                } else if ( fo_sumary.fv_24[1]==2 ) {
                                                    fg_http_response = fg_http_response + ">=2 y <3";
                                                } else if ( fo_sumary.fv_24[1]==3 ) {
                                                    fg_http_response = fg_http_response + ">=3 y <4";
                                                } else if ( fo_sumary.fv_24[1]==4 ) {
                                                    fg_http_response = fg_http_response + ">=4 y <=5";
                                                }
                                                fg_http_response = fg_http_response + " - Total Estudiantes:"+fo_sumary.fv_24[0]+
                                            "</div>"+
                                         "</div>"+
                                    "</div>"+
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"headingThirteen\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseThirteen\" aria-expanded=\"false\" aria-controls=\"collapseThirteen\">"+
                                                //25
                                                    "Promedio de los Rangos de Promedios Ponderados"+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapseThirteen\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingThirteen\">"+
                                            "<div class=\"panel-body\">"+
                                                "Prom. Prom. Ponderado <2: "+fo_sumary.fv_25[0]+" - >=2 y <3:"+fo_sumary.fv_25[1]+" - >=3 y <4: "+fo_sumary.fv_25[2]+" - >=4 y <=5: "+fo_sumary.fv_25[3]+
                                            "</div>"+
                                        "</div>"+
                                    "</div>"+
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"headingFourteen\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseFourteen\" aria-expanded=\"false\" aria-controls=\"collapseFourteen\">"+
                                                //26
                                                    "Promedio general de Definitivas"+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapseFourteen\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingFourteen\">"+
                                            "<div class=\"panel-body\">"+
                                                "Prom. General Def.: "+fo_sumary.fv_26+
                                            "</div>"+
                                        "</div>"+
                                    "</div>"+
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"headingFifteen\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseFifteen\" aria-expanded=\"false\" aria-controls=\"collapseFifteen\">"+
                                                //27
                                                    "Asignatura con Mayor numero de Creditos"+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapseFifteen\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingFifteen\">"+
                                            "<div class=\"panel-body\">"+
                                                "Asignatura: "+fo_pass_pensum.fm_search_asig_name_by_cod(fo_sumary.fv_27[1])+" - Creditos: "+fo_sumary.fv_27[0]+
                                            "</div>"+
                                        "</div>"+
                                    "</div>"+
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"headingSixteen\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseSixteen\" aria-expanded=\"false\" aria-controls=\"collapseSixteen\">"+
                                                //28
                                                    "Asignatura con Menor numero de Creditos"+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapseSixteen\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingSixteen\">"+
                                            "<div class=\"panel-body\">"+
                                                "Asignatura: "+fo_pass_pensum.fm_search_asig_name_by_cod(fo_sumary.fv_28[1])+" - Creditos: "+fo_sumary.fv_28[0]+
                                            "</div>"+
                                        "</div>"+
                                    "</div>"+
                                "</div>"+
                            /*Fin Tabulador 2*/
                            "</div>"+
                            "<div role=\"tabpanel\" class=\"tab-pane fade\" id=\"student\">";
                            /*Inicio Tabulador 3*/
                            for ( int i=0;i<fpass_num_estd;i++ ){
                                fg_http_response = fg_http_response + "<div class=\"panel-group\" id=\"accordion\" role=\"tablist\" aria-multiselectable=\"true\">"+
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"heading"+i+"\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a class=\"collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse"+i+"\" aria-expanded=\"false\" aria-controls=\"collapse"+i+"\">"+
                                                //29
                                                    "Estudiante "+i+": "+fo_pass_estudiante.fv_estd_string[0][i]+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapse"+i+"\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"heading"+i+"\">"+
                                            "<div class=\"panel-body\">"+
                                                "<div class=\"col-xs-12\">"+
                                                    "Proporcion de Creditos>> T: "+fo_sumary.fv_29[0][i]+" - T/P: "+fo_sumary.fv_29[1][i]+"<br>"+
                                                    "Suma Asignaturas>> Creditos <3: "+fo_sumary.fv_29[2][i]+" - >=3: "+fo_sumary.fv_29[3][i]+"<br>"+
                                                    "Suma Asignaturas>> Def. <2: "+fo_sumary.fv_29[4][i]+" - >=2 y <3: "+fo_sumary.fv_29[5][i]+" - >=3 y <4: "+fo_sumary.fv_29[6][i]+" - >=4 y <=5: "+fo_sumary.fv_29[7][i]+"<br>"+
                                                    "Suma Horas>> T: "+fo_sumary.fv_29[8][i]+" - T/P: "+fo_sumary.fv_29[9][i]+"<br>"+
                                                    "Suma Calificaciones>> <3: "+fo_sumary.fv_29[11][i]+" - >=3: "+fo_sumary.fv_29[10][i]+
                                                "</div>"+
                                            "</div>"+
                                        "</div>"+
                                    "</div>"+
                                "</div>";   
                            }
                            /*Fin Tabulador 2*/                  
                            fg_http_response = fg_http_response + "</div>"+
                            "<div role=\"tabpanel\" class=\"tab-pane fade\" id=\"configuration\">"+
                            /*Inicio Tabulador 3*/
                                "<div class=\"panel-group\" id=\"accordion\" role=\"tablist\" aria-multiselectable=\"true\">"+
                                    "<div class=\"panel panel-default\">"+
                                        "<div class=\"panel-heading\" role=\"tab\" id=\"headingD\">"+
                                            "<h4 class=\"panel-title\">"+
                                                "<a role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseD\" aria-expanded=\"true\" aria-controls=\"collapseD\">"+
                                                    "Resetear Todas las Estadisticas y Reiniciar el Programa"+
                                                "</a>"+
                                            "</h4>"+
                                        "</div>"+
                                        "<div id=\"collapseD\" class=\"panel-collapse collapse in\" role=\"tabpanel\" aria-labelledby=\"headingD\">"+
                                            "<div class=\"panel-body\">"+
                                                "<div class=\"col-xs-12\">"+
                                                    "<form class=\"init-form\" method=\"POST\" action=\"start\">"+
                                                        "<input type=\"hidden\" name=\"fform_begin\" value=\"reset\">"+
                                                        "<div class=\"panel panel-danger panel-body red\">"+
                                                            "<p class=\"tight\"><i class=\"fa fa-asterisk\"></i>Si desea borrar todos los datos y reiniciar el programa haga click aqui.<p>"+
                                                        "</div>"+
                                                        "<div class=\"btns\">"+
                                                            "<div class=\"btn btn-cta-primary center-block\">"+
                                                                "<input class=\"btn-clear\" type=\"submit\" value=\"REINICIAR PROGRAMA\">"+
                                                            "</div>"+
                                                        "</div> "+ 
                                                    "</form>"+
                                                "</div>"+
                                            "</div>"+
                                        "</div>"+
                                    "</div>"+
                                "</div>"+
                            /*Fin Tabulador 3*/        
                            "</div>"+
                        "</div>"+
                    "</div>" +
                "</div>";
            request.setAttribute("fg_http_response",fg_http_response);
            fm_forward(url,request,response);
        } else if ( ("activated".equals(fo_session.getAttribute("fg_session_started"))) && ("reset".equals(fv_return_path)) ){
            url = "/index.jsp";
            fg_session_started = "reseted";
            fo_session.setAttribute("fg_session_started", fg_session_started);
            fo_session.invalidate();
            request.setAttribute("fg_http_response",fg_http_response);
            fm_forward(url,request,response);
        }
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
        doPost(request, response);
    }
    
    public void fm_forward (String fv_forward_url,HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext fv_sc = getServletContext();
        RequestDispatcher fv_rd = fv_sc.getRequestDispatcher(fv_forward_url);
        fv_rd.forward(request,response);
    }
    
    
}
