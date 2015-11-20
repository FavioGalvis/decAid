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
 * Clase para la creacion de las variables
 * del pensum y asignaturas.
 * @author FGALVIS
 */
public class Fc_pensum {
    
    int fv_codigo_asig = 0;
    String fv_nombre_asig = null;
    String fv_descripcion_asig = null;
    String fv_opcional_asig = null;
    String fv_prereq_asig = null;
    int fv_creditos_asig = 0;
    int fv_tipo_asig = 0;
    int fv_HT_asig = 0;
    int fv_HP_asig = 0;
    int fv_area_asig = 0;
    int fv_semestre_asig = 0;
    /* 
     * @see int fv_pensum
     * Variable de almacenamiento del pensum en malla grafica.
     * array [variables][N asignaturas]
     * array [0,1,2,3,4,5,6,7]={codigo_asig,creditos_asig,tipo_asig,HT_asig,
     *                          HP_asig,HI_asig,area_asig,semestre_asig}
     */
    int[][] fv_pensum = new int[8][57];
    /* 
     * @see String fv_pensum_desc
     * Variable de almacenamiento de datos adicionales del pensum.
     * array [String][N asignaturas]
     * array [0,1,2,3]={nombre_asig,descripcion_asig,prereq_asig,opcional}
     */
    String[][] fv_pensum_desc = new String[4][57];
    
    /** 
     * Metodo constructor
     * @param null No posee entrada de parametros ya que las vars son estaticas
     */
    public Fc_pensum ( ){      
        
        for (int i=0;i<57;i++) {
            //Pos [0][] = Codigo de Asignatura segun malla grafica
            // Tener presente que el codigo de la asignatura inicia en 1 (no en 0)
            this.fv_pensum[0][i] = i+1;
            if(i>=0 || i<6){
                //Pos [7][] = Semestre, en el caso del primer semestre es 1
                this.fv_pensum[7][i] = 1;
            }else if(i>=6 || i<12){
                //Pos [7][] = Semestre, en el caso del segundo semestre es 2
                this.fv_pensum[7][i] = 2;
            }else if(i>=12 || i<18){                
                //Pos [7][] = Semestre, en el caso del tercer semestre es 3
                this.fv_pensum[7][i] = 3;
            }else if(i>=18 || i<24){               
                //Pos [7][] = Semestre, en el caso del cuarto semestre es 4
                this.fv_pensum[7][i] = 4;
            }else if(i>=24 || i<29){                
                //Pos [7][] = Semestre, en el caso del quinto semestre es 5
                this.fv_pensum[7][i] = 5;
            }else if(i>=29 || i<35){                
                //Pos [7][] = Semestre, en el caso del sexto semestre es 6
                this.fv_pensum[7][i] = 6;
            }else if(i>=35 || i<42){                
                //Pos [7][] = Semestre, en el caso del septimo semestre es 7
                this.fv_pensum[7][i] = 7;
            }else if(i>=42 || i<48){                
                //Pos [7][] = Semestre, en el caso del octavo semestre es 8
                this.fv_pensum[7][i] = 8;
            }else if(i>=48 || i<54){                
                //Pos [7][] = Semestre, en el caso del noveno semestre es 9
                this.fv_pensum[7][i] = 9;
            }else if(i>=54 || i<57){                
                //Pos [7][] = Semestre, en el caso del decimo semestre es 10
                this.fv_pensum[7][i] = 10;
            }
        }
        //Pos [6][] = Codigo del Area segun malla grafica
        // Inicializacion Area 1 = Matematicas
        this.fv_pensum[6][0] = 1;
        this.fv_pensum[6][6] = 1;
        this.fv_pensum[6][7] = 1;
        this.fv_pensum[6][12] = 1;
        this.fv_pensum[6][18] = 1;
        this.fv_pensum[6][24] = 1;
        // Inicializacion Area 2 = Fisica
        this.fv_pensum[6][13] = 2;
        this.fv_pensum[6][19] = 2;
        // Inicializacion Area 3 = Ciencias Naturales y Estadisticas
        this.fv_pensum[6][25] = 3;
        // Inicializacion Area 4 = Español
        this.fv_pensum[6][1] = 4;
        this.fv_pensum[6][8] = 4;
        // Inicializacion Area 5 = Matematicas Computacionales
        this.fv_pensum[6][14] = 5;
        this.fv_pensum[6][29] = 5;
        this.fv_pensum[6][35] = 5;
        // Inicializacion Area 6 = Interdiciplinaria
        this.fv_pensum[6][20] = 6;
        this.fv_pensum[6][36] = 6;
        this.fv_pensum[6][50] = 6;
        this.fv_pensum[6][55] = 6;
        // Inicializacion Area 7 = Algoritmia y Programacion
        this.fv_pensum[6][2] = 7;
        this.fv_pensum[6][9] = 7;
        this.fv_pensum[6][15] = 7;
        this.fv_pensum[6][21] = 7;
        // Inicializacion Area 8 = Ciencias de la Computacion
        this.fv_pensum[6][3] = 8;
        this.fv_pensum[6][26] = 8;
        this.fv_pensum[6][27] = 8;
        this.fv_pensum[6][37] = 8;
        this.fv_pensum[6][38] = 8;
        // Inicializacion Area 9 = Ingenieria de Software
        this.fv_pensum[6][30] = 9;
        this.fv_pensum[6][39] = 9;
        this.fv_pensum[6][42] = 9;
        // Inicializacion Area 10 = Arquitectura, Redes y Conectividad
        this.fv_pensum[6][22] = 10;
        this.fv_pensum[6][28] = 10;
        this.fv_pensum[6][31] = 10;
        this.fv_pensum[6][32] = 10;
        // Inicializacion Area 11 = Software, Redes y Gestion
        this.fv_pensum[6][43] = 11;
        this.fv_pensum[6][44] = 11;
        this.fv_pensum[6][48] = 11;
        this.fv_pensum[6][49] = 11;
        this.fv_pensum[6][54] = 11;
        // Inicializacion Area 12 = Investigacion Aplicada
        this.fv_pensum[6][33] = 12;
        this.fv_pensum[6][40] = 12;
        this.fv_pensum[6][45] = 12;
        // Inicializacion Area 13 = Practica de Ingenieria
        this.fv_pensum[6][51] = 13;
        this.fv_pensum[6][56] = 13;
        // Inicializacion Area 14 = Gestion de Proyectos
        this.fv_pensum[6][34] = 14;
        this.fv_pensum[6][46] = 14;
        // Inicializacion Area 15 = Valores y Autodesarrollo
        this.fv_pensum[6][4] = 15;
        this.fv_pensum[6][10] = 15;
        this.fv_pensum[6][16] = 15;
        this.fv_pensum[6][23] = 15;
        // Inicializacion Area 16 = Socio-Juridicas y Artisticas
        this.fv_pensum[6][5] = 16;
        this.fv_pensum[6][11] = 16;
        this.fv_pensum[6][17] = 16;
        this.fv_pensum[6][41] = 16;
        this.fv_pensum[6][47] = 16;
        this.fv_pensum[6][52] = 16;
        this.fv_pensum[6][53] = 16;
        
        /* 
         * Creditos de cada Asignatura.
         * Como no existe relacion directa y constante entre las asignaturas,
         * las horas teorias y las horas practicas, la inicializacion es manual.
         */
        int fvt_creditos[] = new int[]{4,3,4,2,1,2,4,3,3,4,1,1,4,3,3,4,1,2,4,3,3,3,3,1,4,3,3,4,4,3,4,4,4,1,3,3,3,3,3,3,1,2,4,3,3,1,3,2,3,3,3,1,2,2,3,3,7};
        for(int i=0;i<57;i++){
            this.fv_pensum[1][i] = fvt_creditos[i];
        }
        fvt_creditos = null;
        
        /* 
         * Horas Teoricas de cada Asignatura.
         * Como no existe relacion directa y constante entre las asignaturas,
         * las horas teorias y las horas practicas, la inicializacion es manual.
         */
        int fvt_ht[] = new int[]{4,3,3,2,1,2,4,3,3,3,1,1,4,4,3,3,1,2,4,4,3,3,3,1,4,3,3,4,4,3,3,3,3,0,3,3,3,3,3,2,0,2,3,2,2,0,3,2,2,3,3,0,2,2,3,3,0};
        for(int i=0;i<57;i++){
            this.fv_pensum[3][i] = fvt_ht[i];
        }
        fvt_ht = null;
        
        /* 
         * Horas Practicas de cada Asignatura.
         * Como no existe relacion directa y constante entre las asignaturas,
         * las horas teorias y las horas practicas, la inicializacion es manual.
         */
        int fvt_hp[] = new int[]{0,0,3,0,1,0,0,0,0,3,1,1,0,1,0,3,1,0,0,1,1,0,0,1,0,1,0,3,2,0,3,3,3,2,0,1,1,0,1,2,2,0,3,2,2,2,1,0,2,0,0,3,0,0,0,0,40};
        for(int i=0;i<57;i++){
            this.fv_pensum[4][i] = fvt_hp[i];
            /*
             * Asignacion de tipo de materia dependiendo de cantida de horas practicas
             * 1 = Teorica, 2 = Teorico Practica
             */
            if ( fvt_hp[i]==0 ){
                this.fv_pensum[2][i]= 1;
            } else {
                this.fv_pensum[2][i]= 2;
            }
        }
        fvt_hp = null;
        
        /* 
         * Nombres de cada Asignatura.
         */
        String fvt_nombre[] = new String[]{ "Algebra y Trigonometria",
                                            "Competencia Comunicativa en Lengua Castellana I",
                                            "Algoritmia y Programacion I",
                                            "Introduccion a la Ingenieria de Sistemas",
                                            "Crecimiento Intragrupal I",
                                            "Catedra Bolivariana",
                                            "Calculo Diferencial",
                                            "Algebra Lineal",
                                            "Competencia Comunicativa en Lengua Castellana II",
                                            "Algoritmia y Programacion II",
                                            "Crecimiento Intragrupal II",
                                            "Cultura y Deporte",
                                            "Calculo Integral",
                                            "Fisica Mecanica",
                                            "Logica Matematica",
                                            "Estructura de Datos",
                                            "Crecimiento Intragrupal III",
                                            "Educacion para la Democracia",
                                            "Calculo de Varias Variables",
                                            "Fisica Electricidad y Magnetismo",
                                            "Estadistica Descriptiva y Probabilistica",
                                            "Analisis de Algoritmos",
                                            "Diseno Logico Digita",
                                            "Crecimiento Intragrupal IV",
                                            "Ecuaciones Diferenciales",
                                            "Fisica Electricidad y Magnetismo",
                                            "Estadistica Descriptiva y Probabilistica",
                                            "Analisis de Algoritmos",
                                            "Diseno Logico Digital",
                                            "Crecimiento Intragrupal IV",
                                            "Ecuaciones Diferenciales",
                                            "Electiva en Ciencias Basicas",
                                            "Teoria de Sistemas",
                                            "Bases de Datos",
                                            "Arquitectura del Computador",
                                            "Matematicas Discretas",
                                            "Ingenieria del Software I",
                                            "Redes",
                                            "Sistemas Operativos",
                                            "Formacion Investigativa I",
                                            "Gestion de Proyectos Informaticos",
                                            "Analisis Numerico",
                                            "Investigacion de Operaciones",
                                            "Inteligencia Artificial",
                                            "Teoria de Compiladores",
                                            "Ingenieria del Software II",
                                            "Formacion Investigativa II",
                                            "Electiva de Sociohumanidades I",
                                            "Ingenieria Web",
                                            "Electiva Profesional I",
                                            "Electiva Profesional II",
                                            "Formacion Investigativa III",
                                            "Matematicas Financieras",
                                            "Electiva de Sociohumanidades II",
                                            "Electiva Profesional III",
                                            "Electiva Profesional IV",
                                            "Electiva Profesional Interdisciplinaria I",
                                            "Soporte de Ingenieria",
                                            "Electiva de Sociohumanidades III",
                                            "Etica Profesional",
                                            "Electiva Profesional V",
                                            "Electiva Profesional Interdisciplinaria II",
                                            "Practica Profesional"};
        for(int i=0;i<57;i++){
            this.fv_pensum_desc[0][i] = fvt_nombre[i];
        }
        fvt_nombre = null;
        
        /* 
         * Requisitos de cada Asignatura.
         */
        String fvt_prereq[] = new String[]{"0","0","0","0","0","0",
                                           "1","1","2","3","5","0",
                                           "7","8","1","10","11","0",
                                           "13","14","13","16","13","17",
                                           "19","20,21","0","16","13",
                                           "25","28","29","29","0","0",
                                           "30","0","27,30","22","31","34","0",
                                           "40","32,35,40","32,35,40","41","30","42",
                                           "44,45","44,45","0","32,40","48","0",
                                           "49,50","51","0"};
        for(int i=0;i<57;i++){
            this.fv_pensum_desc[2][i] = fvt_prereq[i];
        }
        fvt_prereq = null;
    }
    
    int fm_search_asig_cod_by_name ( String farg_asig_to_search ){
        int fv_result=0;
        for ( int i=0;i<57;i++ ){
            if ( farg_asig_to_search.equals(this.fv_pensum_desc[0][i]) ){
                fv_result=i+1;
                i=57;
            }
        }
        return fv_result;
    }
    
    int fm_search_asig_cred_by_cod ( int farg_asig_to_search ){
        int fv_result=0;
        for ( int i=0;i<57;i++ ){
            if ( farg_asig_to_search==this.fv_pensum[0][i]){
                fv_result=this.fv_pensum[1][i];
                i=57;
            }
        }
        return fv_result;
    }
    int fm_search_asig_type_by_cod ( int farg_asig_to_search ){
        int fv_result=0;
        for ( int i=0;i<57;i++ ){
            if ( farg_asig_to_search==this.fv_pensum[0][i]){
                fv_result=this.fv_pensum[2][i];
                i=57;
            }
        }
        return fv_result;
    }
    int fm_search_asig_ht_by_cod ( int farg_asig_to_search ){
        int fv_result=0;
        for ( int i=0;i<57;i++ ){
            if ( farg_asig_to_search==this.fv_pensum[0][i]){
                fv_result=this.fv_pensum[3][i];
                i=57;
            }
        }
        return fv_result;
    }
    int fm_search_asig_hp_by_cod ( int farg_asig_to_search ){
        int fv_result=0;
        for ( int i=0;i<57;i++ ){
            if ( farg_asig_to_search==this.fv_pensum[0][i]){
                fv_result=this.fv_pensum[4][i];
                i=57;
            }
        }
        return fv_result;
    }
    String fm_search_asig_name_by_cod ( int farg_asig_to_search ){
        String fv_result="";
        int fv_temp=0;
        for ( int i=0;i<57;i++ ){
            if ( farg_asig_to_search==this.fv_pensum[0][i]){
                fv_temp=i;
                i=57;
            }
        }
        fv_result = this.fv_pensum_desc[0][fv_temp];
        return fv_result;
    }
}
