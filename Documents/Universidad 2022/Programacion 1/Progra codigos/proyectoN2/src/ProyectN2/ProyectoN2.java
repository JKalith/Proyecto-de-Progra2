/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProyectN2;

import javax.swing.JFileChooser;
import ProyectN2.procedures;

/**
 *
 * @author james
 */
public class ProyectoN2 {

    /**
     * @param args the command line arguments
     */
    static procedures procedures = new procedures();

    public static void main(String[] args) {
        procedures.nameUser();
        menu();

    }

    public static boolean menu() {

        boolean exitAll = procedures.exitAll;

        switch (procedures.Login()) {
            case 1: {
                procedures.readerFile();

                break;

            }
            case 2: {

                break;
            }
            case 3: {

                if (procedures.exitLogin(exitAll) == false) {

                    return (false);
                }
                break;
            }
            case 4:

                procedures.readerData();

                break;
            case 5:
                procedures.groupRamdon();

                break;
            case 6:
                menuCrud();

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

}
