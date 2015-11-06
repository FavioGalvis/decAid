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
<%out.println(request.getAttribute("fv_return_page_head"));%>
<!-- ******PROMO****** -->
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
                        <div class="form-group">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                                <input type="text" class="form-control" name="ffrom_num_estd" placeholder="Numero de Estudiantes">
                            </div>
                        </div>
                        <p class="center-block"><i class="fa fa-asterisk red"></i> Este campo creará los arreglos de los estudiantes que se van a analizar en el programa, por ello ingresar una cantidad muy numerosa presupone un proceso de inicializacion mas largo. Recuerde verificar este valor.<p>
                        <div class="form-group">
                            <div class="input-group">
                                <input type="checkbox" class="form-control" name="fform_confirm" value="true">Confirm
                            </div>
                        </div>    
                        <div class="btns">
                            <div class="btn btn-cta-primary center-block">
                                <input class="btn-clear" type="submit" value="CREAR ARREGLOS">  
                            </div>
                        </div>  
                    </form>
                </div>
                <div class="code-block">
                    <!--//Use Prismjs - http://prismjs.com/index.html#basic-usage -->
                    <pre>
<code class="language-javascript">
    /*
    * @pakage Principal
    * @author FGALVIS
    * @version 1.0.36 27/10/2015
    * @since 1.0
    */
    @WebServlet("/myClass_MainC.java")
    public class myClass_MainC extends HttpServlet {
        private Object pair;

        @Override
        protected void doPost (HttpServletRequest request, 
                               HttpServletResponse response)
                               throws ServletException, IOException {
        }
    }
</code>
                    </pre>
                </div><!--//code-block-->
            </div><!--//block-->
            <div class="block">
                <h3 class="sub-title text-center">HTML5+JSP</h3>
                <p><a href="https://www.w3.org/TR/html5/" target="_blank">HTML5</a> + <a href="http://www.oracle.com/technetwork/java/javaee/jsp/index.html" target="_blank">JSP</a> tendrá la cosntrucción del sitio web a traves de la conexión con la sesion Java del Servlet y interpretada por JSP para la construcción dinámica de las páginas.</p>
                <div class="code-block">
                    <!--//Use Prismjs - http://prismjs.com/index.html#basic-usage -->
                    <pre>
<code class="language-markup">
    &lt%-- 
        Document   : index
        Created on : 23/10/2015, 03:51:22 PM
        Author     : FGALVIS
    --%&gt
    &lt%@page contentType="text/html" pageEncoding="UTF-8"%&gt
    &lt!DOCTYPE html&gt
    &lt!--[if IE 8]&gt &lthtml lang="en" class="ie8"&gt &lt![endif]--&gt  
    &lt!--[if IE 9]&gt &lthtml lang="en" class="ie9"&gt &lt![endif]--&gt  
    &lt!--[if !IE]&gt&lt!--&gt &lthtml lang="en"&gt &lt![endif]--&gt  
    &lthead&gt
        &lttitle&gtdecAid - Estadisticas para Decanatura&lt/title&gt
        &lt!-- Meta --&gt
        &ltmeta charset="utf-8"&gt
        &ltmeta http-equiv="X-UA-Compatible" content="IE=edge"&gt
        &ltmeta name="viewport" content="width=device-width, initial-scale=1.0"&gt
    &lt/head&gt
    &ltbody&gt
</code>
                    </pre>
                </div><!--//code-block-->
            </div><!--//block-->
            
            <div class="block">
                <h3 class="sub-title text-center">CSS3</h3>
                <p><a href="http://www.w3.org/Style/CSS/" target="_blank">CSS3</a> como marco de trabajo con los plugins de Bootstrap y FontAwesome y sus complementos en JavaScript para el entorno gráfico y Frontend así como para la compatibilidad de multiples viewports.</p>
                <div class="code-block">
                    <pre>
<code class="language-css">
    /*   
    * Name: decAid
    * Version: 1.0
    * Author: FGALVIS
    * Twitter: @favioagg
    */
    /* Default */
    body {
        font-family: 'Lato', arial, sans-serif;
        color: #444444;
        font-size: 16px;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
    }
</code>
                    </pre>
                </div><!--//code-block-->
            </div><!--//block-->
            <div class="block">
                <h3 class="sub-title text-center">SERVIDOR</h3>
                <p><a href="http://tomcat.apache.org/" target="_blank">TOMCAT + Apache</a> es el servidor para el montaje e implementacion de la solucion, a traves del stack de XAMPP que realiza una configuracion minimalistica y rapida.</p>
                <div class="code-block">
                    <pre>
                        <img class="img-responsive img-rounded" src="assets/images/server.png" alt>
                    </pre>
                </div><!--//code-block-->
            </div><!--//block-->
            <div class="block">
                <h3 class="sub-title text-center">DOCUMENTACION</h3>
                <p>La documentación completa y textos están en el repositorio web del projecto alojado gratuitamente por GitHub.</p>
                <p class="text-center">
                    <a class="btn btn-cta-primary" href="https://github.com/FavioGalvis/decAid" target="_blank">Ir a GitHub</a>
                </p>
            </div><!--//block-->
            
            </div><!--//docs-inner-->         
        </div><!--//container-->
    </section><!--//promo-->
<h3 style="padding-top: 150px;    background: #17baef;">primer parte de la pag
<%out.println("print1: "+request.getSession().getId());%></h3>
<%out.println(request.getAttribute("fv_return_page_foot"));%>