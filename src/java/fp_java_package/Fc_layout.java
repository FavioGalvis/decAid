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
 *
 * @author FGALVIS
 */
public class Fc_layout {
    public void main () {
    
}
    public String fm_header ( boolean print_header ) {
        if ( !print_header ){
            return null;
        } else {
            String header;
            header = null;
            header = "<%@page contentType=\"text/html\" pageEncoding=\"UTF-8\"%>\n" +
                     "<!DOCTYPE html>\n" +
                     "<!--[if IE 8]> <html lang=\"en\" class=\"ie8\"> <![endif]-->  \n" +
                     "<!--[if IE 9]> <html lang=\"en\" class=\"ie9\"> <![endif]-->  \n" +
                     "<!--[if !IE]><!--> <html lang=\"en\"> <!--<![endif]-->  \n" +
                     "<head>\n" +
                     "    <title>decAid - Estadisticas para Decanatura</title>\n" +
                     "    <!-- Meta -->\n" +
                     "    <meta charset=\"utf-8\">\n" +
                     "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                     "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                     "    <meta name=\"description\" content=\"\">\n" +
                     "    <meta name=\"author\" content=\"\">    \n" +
                     "    <!-- Start: favicon scripts for multiplataform -->\n" +
                     "    <link rel=\"shortcut icon\" href=\"favicon.png\">\n" +
                     "    <!-- End: favicon scripts for multiplataform -->\n" +
                     "    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,300italic,400italic' rel='stylesheet' type='text/css'>\n" +
                     "    <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'> \n" +
                     "    <!-- Global CSS -->\n" +
                     "    <link rel=\"stylesheet\" href=\"assets/plugins/bootstrap/css/bootstrap.min.css\">\n" +
                     "    <!-- Plugins CSS -->    \n" +
                     "    <link rel=\"stylesheet\" href=\"assets/plugins/font-awesome/css/font-awesome.css\">\n" +
                     "    <link rel=\"stylesheet\" href=\"assets/plugins/prism/prism.css\">\n" +
                     "    <!-- Theme CSS -->  \n" +
                     "    <link id=\"theme-style\" rel=\"stylesheet\" href=\"assets/css/styles.css\">\n" +
                     "    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n" +
                     "    <!--[if lt IE 9]>\n" +
                     "      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n" +
                     "      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n" +
                     "    <![endif]-->\n" +
                     "</head> ";
            return header;
        }
    }
}
