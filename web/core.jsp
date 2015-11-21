<%--
    Document   : index
    Created on : 23/10/2015, 03:51:22 PM
    Author     : FGALVIS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<!-- ******HEAD****** -->
<%out.println(request.getAttribute("fv_return_page_head"));%>
<!-- ******BODY****** -->
    <section id="docs" class="docs section">
        <div class="container">
            <div class="docs-inner">
            <h2 class="title text-center">Bienvenido a dec<span class="highlight">Aid</span></h2>            
            <div class="block">
                <h3 class="sub-title text-center">Analisis de Parametros ingresados</h3>
                <p>Navega las pestañas para consultar las estadisticas de los datos ingresados, asi como toda la informacion procesada por el programa. No te procupes si recargas la pagina o la cierras, decAid guardará tu informacion.</p>
                <div class="well shadow">
                    <h3 class="sub-title text-center">DATOS DE ESTUDIANTES PARA ANALIZAR</h3>
                    <div class="panel panel-danger panel-body red">
                        <p class="tight">Los campos con <i class="fa fa-asterisk"></i> son obligatorios.<p>
                    </div>
                    <%
                        out.println( request.getAttribute("fg_http_response") );
                        out.println( "<br>" );
                    %>  
                </div>
            </div><!--//block-->
            </div><!--//docs-inner-->         
        </div><!--//container-->
    </section><!--//promo-->
<!-- ******FOOT****** -->
<%out.println(request.getAttribute("fv_return_page_foot"));%>