package application;

import java.util.ArrayList;
import java.util.List;

public class Main {
     static final int CURRENT_YEAR = 2026;

    public static void main(String[] args) {
       final String GREETING_MESSAGE = "Bienvenid@";



       String [] STUDENT_NAME = {"JUAN","VERONICA","LUISA","SAMUEL", "GABRIELA"};
       int [] BIRTHYEAR = {2000,1989,1995,2010,2018};

       //lista edades
        List <Integer> agelist = new ArrayList<>();
        for (int i = 0; i < STUDENT_NAME.length; i++) {
            showMessage(STUDENT_NAME) + "TIME" + agelist.get(i) + "años")
        }

       showMessage(GREETING_MESSAGE);
       showMessage("-------------------------------");








    }
    //CREAR METODO PARA MENSAJES
    public static void showMessage (String message){
        System.out.println(message);
    }
    //CREAR METODO PARA CALCULAR LA EDAD
    public static int CALCULATE_AGE (int BIRTHYEAR){
        return BIRTHYEAR;
    }
    //CREAR METODO PARA LLEVAR ARREGLO
    public static List<Integer> getAgelist (int[] ){
        List<Integer> ages = new ArrayList<>();
        for (int BIRTHYEAR : BIRTHYEAR){
            ages.add(getAgelist(BIRTHYEAR));


        }
        return ages;
    }

}
