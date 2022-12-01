/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProyectN2;

import javax.swing.JFileChooser;
import ProyectN2.procedures;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
/**
 *
 * @author James Arias Avalos
 * @author Diego Herrera López
 */

public class ProyectoN2 {

    /**
     * @param args the command line arguments
     */
    static procedures procedures = new procedures();
    
/**
 * @param args
 * @throws IOException 
 * 
 */
    public static void main(String[] args) throws IOException {
        procedures.nameUser();
        menu();

    }

    public static boolean menu() throws IOException {

        boolean exitAll = procedures.exitAll;

        switch (procedures.Login()) {
            case 1: {
                menuList();

                break;

            }
            case 2: {
                menuCrud();
                break;
            }
            case 3: {
              
                menuGroup();
                break;
            }
            case 4:
          procedures.selectMail();
                break;


            case 5:

                break;
            case 6:
                break;

            case 8:
                if (procedures.exitLogin(exitAll) == false) {

                    return (false);
                }
                break;

        }
        return menu();

    }

    public static int menuCrud() {
        switch (procedures.crudMenu()) {
            case 1:
                procedures.seePersonName(0);
                procedures.modifytName();
                break;

            case 2:
                procedures.seePersonEmail(0);
                procedures.modifytEmail();
                break;

            case 3:
                procedures.seeIdStudent(0);
                procedures.modifyIdStudent();
                break;

            case 4:
                procedures.seePersonGender(0);
                procedures.modifytGender();
                break;

            case 5:
                procedures.deleteAllData();
                break;
            case 6:
                procedures.modifyStudent();

                break;
            case 7:
                procedures.seeAllData(0);
                break;
            case 8:
                return 0;
        }
        return menuCrud();

    }
/**
 * Esta funcion tiene como fin alternar entre los diferentes metodos de la lista
 **/
    public static void menuList() {

        switch (procedures.selectMenu()) {

            case 1:
                procedures.alphabetAcending();
                procedures.seeAllStudents();
                break;
            case 2:
                procedures.alphabetDescending();
                procedures.seeAllStudents();
                break;
            case 3:
                procedures.idAcending();
                procedures.seeAllStudents();
                break;
            case 4:
                procedures.idDescending();
                procedures.seeAllStudents();

                break;
            case 5:

                break;

        }

    }

    public static void menuGroup() throws IOException {
     
 switch (procedures.selectGroup()){
     
    
   
     case 1:
           procedures.readerData();
         break;
 case 2:
         break;
 case 3:
         break;
 
 
 
 
 
 
 
 
 
 }

}








}
 
