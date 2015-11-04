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
public class Fc_pensum {
    
    public int fv_codigo_asig = 0;
    public int fv_prereq_asig = 0;
    public int fv_posreq_asig = 0;
    public int fv_area = 0;
    public int fv_semestre = 0;
    protected int[][] fv_pensum = new int[5][58];
    
    public Fc_pensum ( ){      
        //Pos [0][] = Codigo de Asignatura segun malla grafica
        for (int i=0;i<58;i++) {
            this.fv_pensum[0][i] = i+1;
            if(i>=0 || i<7){
                //Pos [1][] = Prerequisitos, en el caso del primer semestre es 0
                this.fv_pensum[1][i] = 0;
                //Pos [4][] = Semestre, en el caso del primer semestre es 1
                this.fv_pensum[4][i] = 1;
            }else if(i>=7 || i<13){
                //Pos [4][] = Semestre, en el caso del segundo semestre es 2
                this.fv_pensum[4][i] = 2;
            }else if(i>=13 || i<19){                
                //Pos [4][] = Semestre, en el caso del tercer semestre es 3
                this.fv_pensum[4][i] = 3;
            }else if(i>=19 || i<25){               
                //Pos [4][] = Semestre, en el caso del cuarto semestre es 4
                this.fv_pensum[4][i] = 4;
            }else if(i>=25 || i<30){                
                //Pos [4][] = Semestre, en el caso del quinto semestre es 5
                this.fv_pensum[4][i] = 5;
            }else if(i>=30 || i<36){                
                //Pos [4][] = Semestre, en el caso del sexto semestre es 6
                this.fv_pensum[4][i] = 6;
            }else if(i>=36 || i<43){                
                //Pos [4][] = Semestre, en el caso del septimo semestre es 7
                this.fv_pensum[4][i] = 7;
            }else if(i>=43 || i<49){                
                //Pos [4][] = Semestre, en el caso del octavo semestre es 8
                this.fv_pensum[4][i] = 8;
            }else if(i>=49 || i<55){                
                //Pos [4][] = Semestre, en el caso del noveno semestre es 9
                this.fv_pensum[4][i] = 9;
            }else if(i>=55 || i<58){                
                //Pos [4][] = Semestre, en el caso del decimo semestre es 10
                this.fv_pensum[4][i] = 10;
            }
        }
        // Inicializacion Area 1 = Matematicas
        this.fv_pensum[3][0] = 1;
        this.fv_pensum[3][7] = 1;
        this.fv_pensum[3][8] = 1;
        this.fv_pensum[3][13] = 1;
        this.fv_pensum[3][19] = 1;
        this.fv_pensum[3][25] = 1;
        // Inicializacion Area 2 = Fisica
        this.fv_pensum[3][14] = 2;
        this.fv_pensum[3][20] = 2;
        // Inicializacion Area 3 = Ciencias Naturales y Estadisticas
        this.fv_pensum[4][26] = 3;
        // Inicializacion Area 4 = Español
        this.fv_pensum[3][1] = 4;
        this.fv_pensum[3][9] = 4;
        // Inicializacion Area 5 = Matematicas Computacionales
        this.fv_pensum[3][15] = 5;
        this.fv_pensum[4][30] = 5;
        this.fv_pensum[4][36] = 5;
        // Inicializacion Area 6 = Interdiciplinaria
        this.fv_pensum[4][21] = 6;
        
    }
}
