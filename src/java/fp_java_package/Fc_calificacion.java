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
 * Clase para la creacion de los arreglos de calificaciones de los
 * estudiantes.
 * @author FGALVIS
 */
public class Fc_calificacion {
    
    double fv_ref_estd = 0;
    double fv_ref_asig = 0;
    double fv_calf_n1 = 0;
    double fv_calf_n2 = 0;
    double fv_calf_n3 = 0;
    double fv_calf_def = 0;
    double fv_calf_res = 0;
    /* 
     * @see fv_calf
     * Variable de almacenamiento de calificaciones del estudiante.
     * Se inicializa en el metodo constructor con N*9 como indice
     * donde N = numero de estudiantes.
     * array [variables][N estudiantes]
     * array [0,1,2,3,4,5,6]={ref_estd,ref_asig,fv_calf_n1,fv_calf_n2,
     *                        fv_calf_n3,fv_calf_def,fv_calf_res}
     */
    double[][] fv_calf;
    /** 
     * Metodo constructor
     * @param farg_num_estd Numero de estudiantes para ingresar datos en el programa
     */
    public Fc_calificacion ( int farg_num_estd ){
        
        /* 
         * Inicializacion del arreglo de almacenamiento de notas
         * de doble indice.
         * primario: array[0][] = ref_estd //codigo de referencia del estudiante
         * secundario: array[1][] = ref_asig //codigo de asignatura de las calf
         */
        this.fv_calf = new double[7][(10*farg_num_estd)];
        
    }
}
