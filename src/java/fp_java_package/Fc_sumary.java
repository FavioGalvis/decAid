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
public class Fc_sumary {
    
    int fv_1=0;
    int fv_2=0;
    /** 
     * Metodo constructor
     * @param farg_num_estd Numero de estudiantes para ingresar datos en el programa
     * @param fo_estudiante
     */
    public Fc_sumary ( int farg_num_estd, Fc_estudiante fo_estudiante,
            Fc_calificacion fo_calificacion, Fc_pensum fo_pensum, String farg_validate ){
        
        int fv_cod_stud,fv_cod_asig,fv_cred_asig,fv_sum_cred_stud = 0;
        double [] fv_calf;
        double fv_sum_pond_stud = 0,fv_pond_stud;
        /* 
         * Inicializacion del arreglo de almacenamiento de notas
         * de doble indice.
         * primario: array[0][] = ref_estd //codigo de referencia del estudiante
         * secundario: array[1][] = ref_asig //codigo de asignatura de las calf
         */
        for ( int i=0;i<farg_num_estd;i++ ){
            fv_cod_stud=fo_estudiante.fv_estd[0][i];
            for ( int j=0;j<10;j++ ){
                if( fo_estudiante.fv_estd_asig[j][i]!=0 ){
                    fv_cod_asig=fo_estudiante.fv_estd_asig[j][i];
                    fv_calf = fo_calificacion.fm_search_calf(fv_cod_stud, fv_cod_asig, fo_calificacion);
                    fv_cred_asig = fo_pensum.fm_search_asig_cred_by_cod(fv_cod_asig);
                    fv_sum_pond_stud = fv_sum_pond_stud+fv_calf[3]*fv_cred_asig;
                    fv_sum_cred_stud = fv_sum_cred_stud+fv_cred_asig;
                }
            }
            fv_pond_stud = fv_sum_pond_stud/fv_sum_cred_stud;
            if( fv_pond_stud>=3 ){
                fv_1 = fv_1 + 1; 
            } else {
                fv_2 = fv_2 + 1;
            }
        }
        
        
        
    }
}
