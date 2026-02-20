package application;

import java.util.ArrayList;
import java.util.List;

public class Main {
     static final int CURRENT_YEAR = 2026;

    public static void main(String[] args) {
       final String GREETING_MESSAGE = "Bienvenid@";
        showMessage(GREETING_MESSAGE);
        showMessage("-------------------------------");


       String [] studentNames = {"JUAN","VERONICA","LUISA","SAMUEL", "GABRIELA"};

       int [] birthYears = {2000,1989,1995,2010,2018};

       //lista edades
        List <Integer> agelist = getAgelist(birthYears);

        for (int i = 0; i < studentNames.length; i++) {
            showMessage(studentNames[i] + " tiene " + agelist.get(i) + " años ");
        }










    }
    //CREAR METODO PARA MENSAJES
    public static void showMessage (String message){
        System.out.println(message);
    }
    //CREAR METODO PARA CALCULAR LA EDAD
    public static int CALCULATE_AGE (int birthYear
    ){
        return CURRENT_YEAR - birthYear;
    }
    //CREAR METODO PARA LLEVAR ARREGLO
    public static List<Integer> getAgelist (int[] birthYears ){
        List<Integer> ages = new ArrayList<>();
        for (int birthYear : birthYears){
            ages.add(CALCULATE_AGE(birthYear));


        }
        return ages;
    }

}
