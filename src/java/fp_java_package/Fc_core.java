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
        ServletContext fv_sc = getServletContext();
        RequestDispatcher fv_rd = fv_sc.getRequestDispatcher(fv_forward_url);
        fv_rd.forward(request, response);
    }
}
