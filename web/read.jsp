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
                <h3 class="sub-title text-center">Procedimiento de Inicializacion de Variables</h3>
                <p>Como es tu primera visita a la pagina debemos iniciar la session de trabajo y determinar las variables que analizarás de los estudiantes. Ingresa todos los datos que solicite el formulario y presiona el boton inicializar, cualquier inquietud no dudes en consultar la ayuda.</p>
                <div class="well shadow">
                    <form class="init-form" method="POST" action="start">
                        <input type="hidden" name="fform_begin" value="init">
                        <h3 class="sub-title text-center">DATOS DE ESTUDIANTES PARA ANALIZAR</h3>
                        <div class="panel panel-danger panel-body red">
                            <p class="tight">Los campos con <i class="fa fa-asterisk"></i> son obligatorios.<p>
                        </div>
                        <!--div class="form-group">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                                <input type="text" class="form-control" name="fform_num_estd" placeholder="Numero de Estudiantes">
                            </div>
                        </div-->
                        <%
                            out.println( request.getAttribute("fg_http_response") );
                        %>
                        <p class="center-block"><i class="fa fa-asterisk red"></i> Este campo creará los arreglos de los estudiantes que se van a analizar en el programa, por ello ingresar una cantidad muy numerosa presupone un proceso de inicializacion mas largo. Recuerde verificar este valor.<p>    
                        <div class="btns">
                            <div class="btn btn-cta-primary center-block">
                                <input class="btn-clear" type="submit" value="CREAR ARREGLOS">  
                            </div>
                        </div>  
                    </form>
                </div>
            </div><!--//block-->
            </div><!--//docs-inner-->         
        </div><!--//container-->
    </section><!--//promo-->
<!-- ******FOOT****** -->
<%out.println(request.getAttribute("fv_return_page_foot"));%>