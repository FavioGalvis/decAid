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

/**
 * Clase para la construccion de las diferentes partes de la pagina
 * cada una con metodos independientes, encabezado, pie de pagina,
 * includes y otras partes complementarias. El cuerpo y el menu dependen
 * en especifico de las funciones y sus variables de las demas clases.
 * @author FGALVIS
 */
public class Fc_layout {
    public void main () {
    
    }
    /**
     * Metodo para la creacion del encabezado con sus includes, se omitio
     * la inclusion de javascrip files en el encabezado para incrementar
     * la velocidad de carga de la pagina.
     * @param farg_print_header booleano para la creacion del encabezado
     * @return String:fv_layout_header: Cadena con el encabezado de la pag.
     *                                  no incluye etiquetas html o previas
     */
    public static String fm_layout_header ( boolean farg_print_header ) {
        if ( !farg_print_header ){
            return null;
        } else {
            String fv_layout_header;
            fv_layout_header = "<head>\n" +
                    "    <title>decAid - Estadisticas para Decanatura</title>\n" +
                    "    <!-- Meta -->\n" +
                    "    <meta charset=\"utf-8\">\n" +
                    "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <meta name=\"description\" content=\"\">\n" +
                    "    <meta name=\"author\" content=\"\">\n" +
                    "    <!-- Start: favicon scripts for multiplataform -->\n" +
                    "    <link rel=\"shortcut icon\" href=\"favicon.png\">\n" +
                    "    <!-- End: favicon scripts for multiplataform -->\n" +
                    "    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,300italic,400italic' rel='stylesheet' type='text/css'>\n" +
                    "    <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>\n" +
                    "    <!-- Global CSS -->\n" +
                    "    <link rel=\"stylesheet\" href=\"assets/plugins/bootstrap/css/bootstrap.min.css\">\n" +
                    "    <!-- Plugins CSS -->\n" +
                    "    <link rel=\"stylesheet\" href=\"assets/plugins/font-awesome/css/font-awesome.css\">\n" +
                    "    <link rel=\"stylesheet\" href=\"assets/plugins/prism/prism.css\">\n" +
                    "    <!-- Theme CSS -->\n" +
                    "    <link id=\"theme-style\" rel=\"stylesheet\" href=\"assets/css/styles.css\">\n" +
                    "    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n" +
                    "    <!--[if lt IE 9]>\n" +
                    "      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n" +
                    "      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n" +
                    "    <![endif]-->\n" +
                    "</head> ";
            return fv_layout_header;
        }
    }
    /**
     * Metodo para la creacion del pie de pagina con sus includes, se incluyo
     * los javascript files en el pie para incrementar la velocidad de carga
     * de la pagina.
     * @param farg_print_footer booleano para la creacion del pie de pagina
     * @return String:fv_layout_footer: Cadena con el pie de la pag.
     *                                  no incluye etiquetas html o posteriores
     */
    public static String fm_layout_footer ( boolean farg_print_footer ) {
        if ( !farg_print_footer ){
            return null;
        } else {
            String fv_layout_footer;
            fv_layout_footer = "<!-- ******FOOTER****** -->\n" +
                "    <footer class=\"footer\">\n" +
                "        <div class=\"container text-center\">\n" +
                "            <small class=\"copyright\">Diseñado por <i class=\"fa fa-rebel\"></i> <a href=\"mailto:favio.agg@gmail.com\" target=\"_blank\">Favio Galvis</a> para el mundo.</small>\n" +
                "        </div><!--//container-->\n" +
                "    </footer><!--//footer-->\n";
            fv_layout_footer = fv_layout_footer + fm_layout_footer_inc();
            return fv_layout_footer;
        }
    }
    
    /**
     * Metodo para la inclusion de javascript, en el pie de pagina
     * @return String:fv_layout_footer_inc: Cadena con la inclusion de javascript
     * @see Importante: este metodo cierra la etiqueta <body>
     */
    public static String fm_layout_footer_inc () {
        String fv_layout_footer_inc;
        fv_layout_footer_inc = "    <!-- Javascript -->\n" +
            "    <script type=\"text/javascript\" src=\"assets/plugins/jquery-1.11.1.min.js\"></script>\n" +
            "    <script type=\"text/javascript\" src=\"assets/plugins/jquery-migrate-1.2.1.min.js\"></script>\n" +
            "    <script type=\"text/javascript\" src=\"assets/plugins/jquery.easing.1.3.js\"></script>\n" +
            "    <script type=\"text/javascript\" src=\"assets/plugins/bootstrap/js/bootstrap.min.js\"></script>\n" +
            "    <script type=\"text/javascript\" src=\"assets/plugins/jquery-scrollTo/jquery.scrollTo.min.js\"></script>\n" +
            "    <script type=\"text/javascript\" src=\"assets/plugins/prism/prism.js\"></script>\n" +
            "    <script type=\"text/javascript\" src=\"assets/js/main.js\"></script>\n" +
            "</body>\n";
        return fv_layout_footer_inc;
    }
    
    /**
     * Metodo para la inclusion de javascript, en el pie de pagina
     * @return String:fv_layout_menu: Cadena con la inclusion de javascript
     * @see Importante: este metodo abre la etiqueta <body>
     */
    public static String fm_layout_menu () {
        String fv_layout_menu;
        fv_layout_menu = "<body data-spy=\"scroll navbar-fixed-top white\">\n" +
            "    \n" +
            "    <!-- ******HEADER****** -->\n" +
            "    <header id=\"header\" class=\"header bg-white\">\n" +
            "        <div class=\"container\">\n" +
            "            <h1 class=\"logo pull-left\">\n" +
            "                <a class=\"white\" href=\"/decAid/index.jsp#promo\">\n" +
            "                    <span class=\"logo-title\">decAid</span>\n" +
            "                </a>\n" +
            "            </h1><!--//logo-->\n" +
            "            <nav id=\"main-nav\" class=\"main-nav navbar-right\" role=\"navigation\">\n" +
            "                <div class=\"navbar-header\">\n" +
            "                    <button class=\"navbar-toggle\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar-collapse\">\n" +
            "                        <span class=\"sr-only\">Toggle navigation</span>\n" +
            "                        <span class=\"icon-bar\"></span>\n" +
            "                        <span class=\"icon-bar\"></span>\n" +
            "                        <span class=\"icon-bar\"></span>\n" +
            "                    </button><!--//nav-toggle-->\n" +
            "                </div><!--//navbar-header-->\n" +
            "                <div class=\"navbar-collapse collapse\" id=\"navbar-collapse\">\n" +
            "                    <ul class=\"nav navbar-nav\">\n" +
            "                        <li class=\"active nav-item sr-only\"><a class=\"scrollto\" href=\"#promo\">Inicio</a></li>\n" +
            "                        <li class=\"nav-item\"><a class=\"scrollto\" href=\"#about\">Acerca de</a></li>\n" +
            "                        <li class=\"nav-item\"><a class=\"scrollto\" href=\"#features\">Funciones</a></li>\n" +
            "                        <li class=\"nav-item\"><a class=\"scrollto\" href=\"#docs\">Documentacion</a></li>\n" +
            "                        <li class=\"nav-item\"><a class=\"scrollto\" href=\"#license\">Licencia</a></li>\n" +
            "                        <li class=\"nav-item last\"><a class=\"scrollto\" href=\"#contact\">Contacto</a></li>\n" +
            "                    </ul><!--//nav-->\n" +
            "                </div><!--//navabr-collapse-->\n" +
            "            </nav><!--//main-nav-->\n" +
            "        </div>\n" +
            "    </header><!--//header-->\n";
        return fv_layout_menu;
    }
}
