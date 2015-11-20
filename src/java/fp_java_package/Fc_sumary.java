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
    
    int fv_t=0;
    int fv_t2=0;
    
    int fv_1=0;
    int fv_2=0;
    int fv_3=0;
    int fv_4=0;
    double fv_5=0;
    double fv_6=0;
    int fv_7=0;
    int fv_8=0;
    int fv_9=0;
    int fv_10=0;
    double [] fv_11={0,0};
    double [] fv_12={6,0};
    double fv_13=0;
    int fv_14=0;
    int fv_15=0;
    double fv_16=0;
    int fv_17=0;
    int fv_18=0;
    double fv_19=0;
    int fv_20=0;
    int fv_21=0;
    int fv_22=0;
    int fv_23=0;
    int []fv_24={0,0};
    double []fv_25={0,0,0,0};
    double fv_26=0;
    int []fv_27={0,0};
    int []fv_28={99,0};
    int [][]fv_29;
    /** 
     * Metodo constructor
     * @param farg_num_estd Numero de estudiantes para ingresar datos en el programa
     * @param fo_estudiante
     * @param fo_calificacion
     * @param fo_pensum
     * @param farg_validate
     */
    public Fc_sumary ( int farg_num_estd, Fc_estudiante fo_estudiante,
            Fc_calificacion fo_calificacion, Fc_pensum fo_pensum, String farg_validate ){
        fv_29 = new int [12][farg_num_estd];
        int fv_cod_stud,fv_cod_asig = 0,fv_cred_asig = 0,fv_sum_cred_stud = 0,fv_ht_asig = 0,fv_hp_asig = 0;
        double [] fv_calf = null;
        double fv_sum_pond_stud = 0,fv_pond_stud;

        for ( int i=0;i<farg_num_estd;i++ ){
            fv_t=0;
            fv_t2=0;
            fv_cod_stud=fo_estudiante.fv_estd[0][i];
            for ( int j=0;j<10;j++ ){
                if( fo_estudiante.fv_estd_asig[j][i]!=0 ){
                    fv_cod_asig=fo_estudiante.fv_estd_asig[j][i];
                    fv_calf = fo_calificacion.fm_search_calf(fv_cod_stud, fv_cod_asig, fo_calificacion);
                    fv_cred_asig = fo_pensum.fm_search_asig_cred_by_cod(fv_cod_asig);
                    fv_sum_pond_stud = fv_sum_pond_stud+fv_calf[3]*fv_cred_asig;
                    fv_sum_cred_stud = fv_sum_cred_stud+fv_cred_asig;
                    fv_ht_asig = fo_pensum.fm_search_asig_ht_by_cod(fv_cod_asig);
                    fv_hp_asig = fo_pensum.fm_search_asig_hp_by_cod(fv_cod_asig);
                }
                if ( fv_calf[3]>=3 ){
                    fv_3 = fv_3 + 1;
                    fv_5 = fv_5 + fv_calf[3];
                    fv_t = fv_t + fv_cred_asig;
                } else {
                    fv_4 = fv_4 + 1;
                    fv_6 = fv_6 + fv_calf[3];
                    fv_t2 = fv_t2 + fv_cred_asig;
                }
                if ( fo_pensum.fm_search_asig_type_by_cod(fv_cod_asig)==1 ){
                    fv_14 = fv_14 + 1;
                    fv_15 = fv_15 + fv_cred_asig;
                } else if ( fo_pensum.fm_search_asig_type_by_cod(fv_cod_asig)==2 ){
                    fv_17 = fv_17 + 1;
                    fv_18 = fv_18 + fv_cred_asig;
                }
                if ( fv_cred_asig>fv_27[0] ){
                    fv_27[0] = fv_cred_asig;
                    fv_27[1] = fv_cod_asig;
                }
                if ( fv_cred_asig<fv_28[0] ){
                    fv_28[0] = fv_cred_asig;
                    fv_28[1] = fv_cod_asig;
                }
                if ( fv_cred_asig<3 ){
                    fv_29[2][i] = fv_29[2][i] + 1;
                }else{
                    fv_29[3][i] = fv_29[3][i] + 1;
                }
                if ( fv_calf[3]<2 ){
                    fv_29[4][i] = fv_29[4][i] + 1;
                } else if ( fv_calf[3]>=2 && fv_calf[3]<3 ){
                    fv_29[5][i] = fv_29[5][i] + 1;
                } else if ( fv_calf[3]>=3 && fv_calf[3]<4 ){
                    fv_29[6][i] = fv_29[6][i] + 1;
                } else if ( fv_calf[3]>=4 && fv_calf[3]<=5 ){
                    fv_29[7][i] = fv_29[7][i] + 1;
                }
                fv_29[8][i] = fv_29[8][i] + fv_ht_asig;
                fv_29[9][i] = fv_29[9][i] + fv_hp_asig;
                for ( int k=0;k<3;k++ ){
                    if ( fv_calf[k]>=3 ){
                        fv_29[10][i] = fv_29[10][i] + 1;
                    } else {
                        fv_29[11][i] = fv_29[11][i] + 1;
                    }
                }
            }
            fv_29[0][i] = ( fv_15 / fv_sum_cred_stud ) * 10;
            fv_29[1][i] = ( fv_18 / fv_sum_cred_stud ) * 10;
            fv_pond_stud = fv_sum_pond_stud/fv_sum_cred_stud;
            if( fv_pond_stud>=3 ){
                fv_1 = fv_1 + 1;
                fv_7 = fv_7 + fv_t;
                fv_8 = fv_8 + fv_t2;
            } else {
                fv_2 = fv_2 + 1;
                fv_9 = fv_9 + fv_t;
                fv_10 = fv_10 + fv_t2;
            }
            if ( fv_pond_stud>fv_11[0] ){
                fv_11[0] = fv_pond_stud;
                fv_11[1] = fv_cod_stud;
            }
            if ( fv_pond_stud<fv_12[0] ){
                fv_12[0] = fv_pond_stud;
                fv_12[1] = fv_cod_stud;
            }
            fv_13 = fv_13 + fv_pond_stud;
            if ( fv_pond_stud<2 ){
                fv_20 = fv_20+1;
                fv_25[0]=fv_25[0]+fv_pond_stud;
            } else if ( fv_pond_stud>=2 && fv_pond_stud<3 ){
                fv_21 = fv_21+1;
                fv_25[1]=fv_25[1]+fv_pond_stud;
            } else if ( fv_pond_stud>=3 && fv_pond_stud<4 ){
                fv_22 = fv_22+1;
                fv_25[2]=fv_25[2]+fv_pond_stud;
            } else if ( fv_pond_stud>=4 && fv_pond_stud<=5 ){
                fv_23 = fv_23+1;
                fv_25[3]=fv_25[3]+fv_pond_stud;
            }
        }
        fv_13 = fv_13 / farg_num_estd;
        fv_5 = fv_3!=0 ? fv_5 / fv_3 : 0;
        fv_6 = fv_4!=0 ? fv_6 / fv_4 : 0;
        fv_16 = fv_14!=0 ? fv_15 / fv_14 : 0;
        fv_19 = fv_17!=0 ? fv_18 / fv_17 : 0;
        if ( fv_20>fv_21 && fv_20>fv_22 && fv_20>fv_23 ){
            fv_24[0] = fv_20;
            fv_24[1] = 1;
        } else if ( fv_21>fv_20 && fv_21>fv_22 && fv_21>fv_23 ){
            fv_24[0] = fv_21;
            fv_24[1] = 2;
        } else if ( fv_22>fv_20 && fv_22>fv_21 && fv_22>fv_23 ){
            fv_24[0] = fv_22;
            fv_24[1] = 3;
        } else if ( fv_23>fv_20 && fv_23>fv_21 && fv_23>fv_22 ){
            fv_24[0] = fv_23;
            fv_24[1] = 3;
        }
        fv_25[0] = fv_20!=0 ? fv_25[0] / fv_20 : 0;
        fv_25[1] = fv_21!=0 ? fv_25[1] / fv_21 : 0;
        fv_25[2] = fv_22!=0 ? fv_25[2] / fv_22 : 0;
        fv_25[3] = fv_23!=0 ? fv_25[3] / fv_23 : 0;
        fv_26 = ( fv_5 + fv_6 ) / 2;
    }
}
