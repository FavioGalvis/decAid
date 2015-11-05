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
 * Clase para la creacion de los estudiantes y sus variables
 * @author FGALVIS
 */
public class Fc_estudiante {
    
    int fv_cod_estd = 0;
    String fv_nombre_estd = null;
    String fv_correo_estd = null;
    int fv_cedula_estd = 0;
    /* 
     * @see fv_estd
     * Variable de almacenamiento de datos numericos del estudiante.
     * Se inicializa en el metodo constructor con N numero de estudiantes.
     * array [variables][N estudiantes]
     * array [0,1,2]={cod_estd,cedula_estd,semestre_estd}
     */
    int[][] fv_estd = null;
    /* 
     * @see fv_estd_asig
     * Variable de almacenamiento de datos de las asignaturas matriculadas
     * del estudiante.
     * Se inicializa en el metodo constructor con N numero de estudiantes.
     * array [variables][N estudiantes]
     * array [0,1,2,3,4,5,6,7,8,9]={cod_asig_1,cod_asig_2,....,cod_asig_n}
     */
    int[][] fv_estd_asig = null;
    /* 
     * @see fv_estd_string
     * Variable de almacenamiento de datos String del estudiante.
     * Se inicializa en el metodo constructor con N numero de estudiantes.
     * array [variables][N estudiantes]
     * array [0,1]={nombre_estd,correo_estd}
     */
    String[][] fv_estd_string = null;
    /** 
     * Metodo constructor
     * @param num_estd Numero de estudiantes para ingresar datos en el programa
     */
    public Fc_estudiante( int num_estd ){
        
        
    }
}
