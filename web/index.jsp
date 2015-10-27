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
<head>
    <title>decAid - Estadisticas para Decanatura</title>
    <!-- Meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">    
    <!-- Start: favicon scripts for multiplataform -->
    <link rel="shortcut icon" href="favicon.png">
    <!-- End: favicon scripts for multiplataform -->
    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,300italic,400italic' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'> 
    <!-- Global CSS -->
    <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap.min.css">
    <!-- Plugins CSS -->    
    <link rel="stylesheet" href="assets/plugins/font-awesome/css/font-awesome.css">
    <link rel="stylesheet" href="assets/plugins/prism/prism.css">
    <!-- Theme CSS -->  
    <link id="theme-style" rel="stylesheet" href="assets/css/styles.css">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head> 

<body data-spy="scroll">
    
    <!---//Facebook button code-->
    <div id="fb-root"></div>
    <script>(function(d, s, id) {
      var js, fjs = d.getElementsByTagName(s)[0];
      if (d.getElementById(id)) return;
      js = d.createElement(s); js.id = id;
      js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.0";
      fjs.parentNode.insertBefore(js, fjs);
    }(document, 'script', 'facebook-jssdk'));</script>
    
    <!-- ******HEADER****** --> 
    <header id="header" class="header">  
        <div class="container">            
            <h1 class="logo pull-left">
                <a class="scrollto" href="#promo">
                    <span class="logo-title">decAid</span>
                </a>
            </h1><!--//logo-->              
            <nav id="main-nav" class="main-nav navbar-right" role="navigation">
                <div class="navbar-header">
                    <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button><!--//nav-toggle-->
                </div><!--//navbar-header-->            
                <div class="navbar-collapse collapse" id="navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li class="active nav-item sr-only"><a class="scrollto" href="#promo">Inicio</a></li>
                        <li class="nav-item"><a class="scrollto" href="#about">Acerca de</a></li>
                        <li class="nav-item"><a class="scrollto" href="#features">Funciones</a></li>
                        <li class="nav-item"><a class="scrollto" href="#docs">Documentacion</a></li>
                        <li class="nav-item"><a class="scrollto" href="#license">Licencia</a></li>                        
                        <li class="nav-item last"><a class="scrollto" href="#contact">Contacto</a></li>
                    </ul><!--//nav-->
                </div><!--//navabr-collapse-->
            </nav><!--//main-nav-->
        </div>
    </header><!--//header-->
    
    <!-- ******PROMO****** -->
    <section id="promo" class="promo section offset-header">
        <div class="container text-center">
            <h2 class="title">dec<span class="highlight">Aid</span></h2>
            <p class="intro">Software para el análisis estadístico de estudiantes de Ing. de Sistemas de la 
                Universidad Simon Bolivar</p>
            <div class="btns">
                <a class="btn btn-cta-secondary" href="/" target="_blank">Iniciar</a>
                <a class="btn btn-cta-primary" href="https://github.com/FavioGalvis/decAid/archive/master.zip" target="_blank">Fuentes</a>
            </div>
            <ul class="meta list-inline">
                <li><a href="https://github.com/FavioGalvis/decAid" target="_blank">Ver en GitHub</a></li>
                <li><a href="/" target="_blank">Documentation completa</a></li>
                <li>Creado por: <a href="mailto:favio.agg@gmail.com" target="_blank">Favio Galvis</a> en USB-CO</li>
            </ul><!--//meta-->
        </div><!--//container-->
        <div class="social-media">
            <div class="social-media-inner container text-center">
                <ul class="list-inline">
                    <li class="twitter-follow"><a href="https://twitter.com/favioagg" class="twitter-follow-button" data-show-count="false">Follow @FavioGalvis</a>
<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);}}(document, 'script', 'twitter-wjs');</script>
                    </li><!--//twitter-follow-->
                    <li class="twitter-tweet">
                        <a href="https://twitter.com/share" class="twitter-share-button" data-via="favioagg" data-hashtags="decAid">Tweet</a>
    <script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);}}(document, 'script', 'twitter-wjs');</script>
                    </li><!--//twitter-tweet-->
                    <li class="facebook-like">
                         <div class="fb-like" data-href="http://themes.3rdwavemedia.com/" data-layout="button_count" data-action="like" data-show-faces="false" data-share="true"></div>
                    </li><!--//facebook-like-->
                    <!--// Generate github buttons: https://github.com/mdo/github-buttons -->
                    <li class="github-star"><iframe src="http://ghbtns.com/github-btn.html?user=FavioGalvis&repo=decAid&type=watch&count=true" allowtransparency="true" frameborder="0" scrolling="0" width="110" height="20"></iframe></li>
                    <li class="github-fork"><iframe src="http://ghbtns.com/github-btn.html?user=FavioGalvis&repo=decAid&type=fork" allowtransparency="true" frameborder="0" scrolling="0" width="53" height="20"></iframe></li>
                    <!--//
                    <li class="github-follow"><iframe src="http://ghbtns.com/github-btn.html?user=mdo&type=follow&count=true"
  allowtransparency="true" frameborder="0" scrolling="0" width="165" height="20"></iframe></li>
                    -->
                </ul>
            </div>
        </div>
    </section><!--//promo-->
    
    <!-- ******ABOUT****** --> 
    <section id="about" class="about section">
        <div class="container">
            <h2 class="title text-center">Que es decAid?</h2>
            <p class="intro text-center">Decanature Aid - ó más corto decAid - es un software para el análisis estadístico de las calificaciones, promedios, cortes y desempeños de los estudiantes de la carrera de Ing. de Sistemas por medio de reportes infográficos y modernos que muestran la información en tiempo real y de manera expedita. Este proyecto fue creado en el marco del Proyecto Final de Aula para la materia de Algoritmos y Programación I del Doc. Ing. Juan Rua.</p>
            <div class="row">
                <div class="item col-md-4 col-sm-6 col-xs-12">
                    <div class="icon-holder">
                        <i class="fa fa-copyright"></i>
                    </div>
                    <div class="content">
                        <h3 class="sub-title">Diseñado por desarrollador</h3>
                        <p>Diseño exclusivo de mi autoría. Asi demostramos que los estudiantes de Ing. también poseemos esa chispa creativa que tanto nos falta.</p>
                    </div><!--//content-->
                </div><!--//item-->
                <div class="item col-md-4 col-sm-6 col-xs-12">
                    <div class="icon-holder">
                        <i class="fa fa-code"></i>
                    </div>
                    <div class="content">
                        <h3 class="sub-title">Framework</h3>
                        <p>Java, JSP y HTML5 en el código, Marco de trabajo en CSS y JS de <a href="http://getbootstrap.com/" target="_blank">Bootstrap</a>, <a href="http://fortawesome.github.io/" target="_blank">FontAwesome</a> y servidor <a href="http://tomcat.apache.org/" target="_blank">Tomcat</a> con proyección a BD MySQL en un futuro.</p>
                    </div><!--//content-->
                </div><!--//item-->
                <div class="item col-md-4 col-sm-6 col-xs-12">
                    <div class="icon-holder">
                        <i class="fa fa-crosshairs"></i>
                    </div>
                    <div class="content">
                        <h3 class="sub-title">Centrado en Soluciones</h3>
                        <p>La solución se desarrollo para cumplir los requerimientos del proyecto final de aula de 34 puntos propuesto por el profesor. Encontrará valores agregados en la documentación.</p>
                    </div><!--//content-->
                </div><!--//item-->           
                <div class="clearfix visible-md"></div>    
                <div class="item col-md-4 col-sm-6 col-xs-12">
                    <div class="icon-holder">
                        <i class="fa fa-tablet"></i>
                    </div>
                    <div class="content">
                        <h3 class="sub-title">Muti-Plataforma</h3>
                        <p>El uso de un marco de trabajo Mobile-Friendly hace la página flexible a todas las interfaces y viewports. Mas información sobre la versión móbil en la documentación.</p>
                    </div><!--//content-->
                </div><!--//item-->                
                <div class="item col-md-4 col-sm-6 col-xs-12">
                    <div class="icon-holder">
                        <i class="fa fa-puzzle-piece"></i>
                    </div>
                    <div class="content">
                        <h3 class="sub-title">Facilmente Modificable</h3>
                        <p>Extensiva documentación del proyecto y del código construido para facilitar el reuso del mismo, el aprendizaje continuo y la lectura. Documentación autogenerada por <a href="http://www.oracle.com/technetwork/articles/java/index-jsp-135444.html" target="_blank">Javadoc</a>.</p>
                    </div><!--//content-->
                </div><!--//item-->
                <div class="item col-md-4 col-sm-6 col-xs-12">
                    <div class="icon-holder">
                        <i class="fa fa-users"></i>
                    </div>
                    <div class="content">
                        <h3 class="sub-title">Open Source</h3>
                        <p>Projecto definido como Open Source de licencia <a href="https://www.gnu.org/licenses/gpl-2.0.html" target="_blank">GNU-GPL</a> para el trabajo y desarrollo continuo del mismo sin limitantes de copyrightFontAwesome. Repositorio en <a href="https://github.com/FavioGalvis/decAid" target="_blank">GitHub</a>.
                    </div><!--//content-->
                </div><!--//item-->               
            </div><!--//row-->            
        </div><!--//container-->
    </section><!--//about-->
    
    <!-- ******FEATURES****** --> 
    <section id="features" class="features section">
        <div class="container text-center">
            <h2 class="title">Funciones</h2>
            <ul class="feature-list list-unstyled">
                <li><i class="fa fa-check"></i> Web Responsiva</li>
                <li><i class="fa fa-check"></i> HTML5 + CSS3</li>
                <li><i class="fa fa-check"></i> Framework en <a href="http://getbootstrap.com/" target="_blank">Bootstrap</a> y <a href="http://fortawesome.github.io/" target="_blank">FontAwesome</a></li>
                <li><i class="fa fa-check"></i> Java + JavaScript + JSP</li>
                <li><i class="fa fa-check"></i> Facilmente Editable</li>
                <li><i class="fa fa-check"></i> Buena documentación y facilidad de lectura</li>
                <li><i class="fa fa-check"></i> Open Source</li>
            </ul>
        </div><!--//container-->
    </section><!--//features-->
    
    <!-- ******DOCS****** --> 
    <section id="docs" class="docs section">
        <div class="container">
            <div class="docs-inner">
            <h2 class="title text-center">Como Funciona y Documentacion</h2>            
            <div class="block">
                <h3 class="sub-title text-center">CODIGO</h3>
                <p>Separamos en tópicos este software, el sitio web, el servidor, la logica y los estilos gráficos.</p>
                <h3 class="sub-title text-center">JAVA</h3>
                <p><a href="https://www.java.com/" target="_blank">Java</a> es usado como lenguaje lógico para la construcción del software, todas las clases, variables, arreglos, ciclos y operaciones estan hechas en Java y por tanto incluidas en clases específicas para tal propósito siguiendo el MER.</p>
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
    </section><!--//features-->
    
    <!-- ******LICENSE****** --> 
    <section id="license" class="license section">
        <div class="container">
            <div class="license-inner">
            <h2 class="title text-center">Licencia</h2>
                <div class="info">
                    <p>Este software esta hecho en NetBeans por  <a href="mailto:favio.agg@gmail.com" target="_blank">Favio Galvis</a> como projecto final de clase, <strong>100% Libre</strong> bajo la licencia de <a href="https://www.gnu.org/licenses/gpl-2.0.html" target="_blank">GNU General Public License, version 2 (GPL 2.0)</a></p>
                    <p><strong>Profesor:</strong> Doc. Ing. Juan Rua</p>
                    <p><strong>Materia:</strong> Algoritmos y Programacion I</p>
                    <p class="text-center"><strong>Universidad Simón Bolívar</strong></p>
                    <div class="center-block circle box-shadow img-bkg"></div>
                </div><!--//info-->
            </div><!--//license-inner-->
        </div><!--//container-->
    </section><!--//how-->
    
    <!-- ******CONTACT****** --> 
    <section id="contact" class="contact section has-pattern">
        <div class="container">
            <div class="contact-inner">
                <h2 class="title  text-center">Contacto</h2>
                <p class="intro  text-center">Espero que encuentre este software útil y completo. <br />Contactame para consultar más detalles e inquietudes.</p>
                <div class="author-message">                      
                    <div class="profile">
                        <img class="img-responsive" src="assets/images/profile_b.png" alt="" />
                    </div><!--//profile-->
                    <div class="speech-bubble">
                        <h3 class="sub-title">Quieres hacerme una pregunta sobre el projecto?</h3>
                        <p>Soy estudiante de la facultad de Ingenierías y desarrollo contenido en <a href="https://github.com/FavioGalvis" target="_blank">GitHub</a></p>
                        <p>Si te gusta mi trabajo puedes seguirme  y apoyarme con un comentario o una crítica sobre mi trabajo :)</p>
                        <p><strong>[Tip]:</strong> Se Creativo!</p> 
                        <div class="source">
                            <span class="name"><a href="https://twitter.com/favioagg" target="_blank">Favio Galvis</a></span>
                            <br />
                            <span class="title">Estudiante de Ingeniería de Sistemas</span>
                        </div><!--//source-->
                    </div><!--//speech-bubble-->                        
                </div><!--//author-message-->
                <div class="clearfix"></div>
                <div class="info text-center">
                    <h4 class="sub-title">Conéctate</h4>
                    <ul class="social-icons list-inline">
                        <li><a href="https://twitter.com/favioagg" target="_blank"><i class="fa fa-twitter"></i></a></li>
                        <li><a href="https://www.facebook.com/arthu_mc_claude" target="_blank"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="https://www.linkedin.com/in/favioagg"><i class="fa fa-linkedin"></i></a></li>
                        <li><a href="http://instagram.com/favioagg"><i class="fa fa-instagram"></i></a></li>  
                        <li><a href="https://dribbble.com/favioagg"><i class="fa fa-dribbble"></i></a></li>   
                        <li class="last"><a href="mailto:favio.agg@gmail.com"><i class="fa fa-envelope"></i></a></li>              
                    </ul>
                </div><!--//info-->
            </div><!--//contact-inner-->
        </div><!--//container-->
    </section><!--//contact-->  
      
    <!-- ******FOOTER****** --> 
    <footer class="footer">
        <div class="container text-center">
            <small class="copyright">Diseñado por <i class="fa fa-rebel"></i> <a href="mailto:favio.agg@gmail.com" target="_blank">Favio Galvis</a> para el mundo.</small>
        </div><!--//container-->
    </footer><!--//footer-->
     
    <!-- Javascript -->          
    <script type="text/javascript" src="assets/plugins/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="assets/plugins/jquery-migrate-1.2.1.min.js"></script>    
    <script type="text/javascript" src="assets/plugins/jquery.easing.1.3.js"></script>   
    <script type="text/javascript" src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>     
    <script type="text/javascript" src="assets/plugins/jquery-scrollTo/jquery.scrollTo.min.js"></script> 
    <script type="text/javascript" src="assets/plugins/prism/prism.js"></script>    
    <script type="text/javascript" src="assets/js/main.js"></script>       
</body>
</html> 


