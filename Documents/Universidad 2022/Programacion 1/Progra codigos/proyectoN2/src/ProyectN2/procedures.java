/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectN2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import ClassProyect.Student;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author james
 */
public class procedures {

    public Scanner scanner = new Scanner(System.in);
    public Scanner scannerTwo = new Scanner(System.in);
    public boolean exitAll = true;
    public String userName;
    public int count = 0;
    public int countVar = 0;
    static Student student = new Student();
    public Student registerStudents[] = new Student[18];
    public Student registerRamdomS[] = new Student[18];
    public Student registerRegion[] = new Student[18];
    public Student registerR[] = new Student[18];
    public String numStudent = null;
    public int ramdom[] = new int [18];

    public int Login() {
        int option = 0;
        System.out.println("╔═══════════╗");
        System.out.println("║Digite una opcion ║");
        System.out.println("╚═══════════╝");
        System.out.println("╓──────────────────────────╗");
        System.out.println("║1) Desea otro txt                          ║");
        System.out.println("║2)                                         ║");
        System.out.println("║3) Salir del programa                      ║");
        System.out.println("║4) Ordenar grupos                          ║");
        System.out.println("║5)                                         ║");
        System.out.println("║6) Editar estudiantes                      ║");
        System.out.println("╙──────────────────────────╝");
        System.out.print("─>");

        option = scanner.nextInt();
        return option;

    }

    public Boolean exitLogin(boolean exitAll) {
        boolean exitProgram;
        System.out.println("¿Desea salir del programa?");
        System.out.println("____________________________");
        System.out.println("digite si/no: ");
        String exit = scannerTwo.nextLine();
        if (exit.equalsIgnoreCase("si")) {
            exitAll = false;
            System.out.println("Gracias " + userName + " por usar Sibajas program");
            System.out.println("Feliz★* 。 • ˚ ˚ ˛ ˚ ˛ •");
            System.out.println("•。★Navidad★ 。* 。");
            System.out.println("° 。 ° ˛˚˛ * _Π_____*。*˚");
            System.out.println("˚ ˛ •˛•˚ */______/~＼。˚ ˚ ");
            System.out.println(" ˛ •˛• ˚ ｜ 田田 ｜門｜ ˚ ˚");
            System.out.println("Un feliz año nuevo");
            System.out.println("ha salido correctamente del programa");
            return (exitAll);
        } else {
            if ((exit.equalsIgnoreCase("no"))) {
                System.out.println("Bienvenido nuevamente " + userName);
                exitAll = true;
                return (exitAll);
            } else {
                System.out.println("ʕ•̠͡•ʔ Digite correctamente su opción ʕ•̠͡•ʔ?");
                exitProgram = true;
            }
        }
        if (exitProgram == true) {
            return (exitLogin(exitAll));
        }
        return (exitLogin(exitAll));
    }

    public void nameUser() {
        System.out.println("ʕ•ᴥ•ʔ -¡Hola Bienvenido a nuestro programa!- ʕ•ᴥ•ʔ");
        System.out.println("____________________________");
        System.out.println("Digite su nombre            ┊");
        System.out.println("____________________________┊");
        System.out.print("─>");
        userName = scannerTwo.nextLine();

        System.out.println("Bienvenido " + userName + "ᵔᴥᵔ");
        System.out.println("Selecciona el archvo que deseas leer");
        readerFile();

    }

    public int crudMenu() {
        System.out.println("         Seleccione una opcion");
        System.out.println("╓────────────────────────╗");
        System.out.println("║1)Editar el nombre                      ║");
        System.out.println("║2)Editar el email                       ║");
        System.out.println("║3)Editar el carnet                      ║");
        System.out.println("║4)Editar el genero                      ║");
        System.out.println("║5)Borrar Estudiante                     ║");
        System.out.println("║6)Agregar o Remplazar Estudiante        ║");
        System.out.println("║7)Ver todos los estudiantes             ║");
        System.out.println("║8)Salir al menu principal               ║");
        System.out.println("╙────────────────────────╝");
        System.out.print("─>");
        int option = scanner.nextInt();
        count = 0;
        return option;

    }

    public String selectFile() {
        String ubicationFile = null;

        JFileChooser file = new JFileChooser();
        file.showOpenDialog(file);

        int checkInput = file.showOpenDialog(null);

        if (checkInput == JFileChooser.APPROVE_OPTION) {
            File openedFile = file.getSelectedFile();
            System.out.println("▄▄──▄▄──▄▄──▄▄──▄▄──▄▄─▄▄──▄▄──▄▄──▄▄");
            System.out.println("Nombre del archivo: " + openedFile.getName());
            System.out.println("Ubicacion del archivo: " + openedFile.getAbsolutePath());
            System.out.println("▄▄____▄▄____▄▄___▄▄___▄▄___▄▄__▄▄___▄▄___▄▄___▄▄");

            ubicationFile = openedFile.getAbsolutePath();
        }
        return (ubicationFile);
    }

    public void readerFile() {
        String openedFile = selectFile();
        BufferedReader objReader = null;
        try {
            String strCurrentLine;

            objReader = new BufferedReader(new FileReader(openedFile));
            int i = 0;
            while ((strCurrentLine = objReader.readLine()) != null) {
                String[] data = strCurrentLine.split(",");
                student = new Student(data[0], data[1], data[2], data[3], data[4]);
                registerStudents[i] = student;
                //arraid lista i == student.tostring
                //guarde un txt con la posicion
                //System.out.println(i + ")" + student.toString()); 
                //(esto es para ver cuales estudiantes se adjunto)
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int indice(int numMax) {

        count = 0;

        if (numMax == 0) {
            numMax = registerStudents.length;
        }
        numMax = numMax - 1;

        if (numMax >= 0) {

            numMax = indic(numMax, count);
        }

        if (numMax >= 0) {
            indice(numMax);
        }

        return -2;

    }

    public int indic(int numM, int count) {
        if (numM == 0) {
            if (registerRegion[count] == null) {
                registerRegion[count] = registerStudents[numM];
                /**
                 * System.out.println("Las ubicaciones actuales son " +
                 * registerRegion[count].getGeographicLocation()); *
                 */
                return indice(-1);
            }
        }
        if (registerRegion[count] == null) {
            registerRegion[count] = registerStudents[numM];
            /**
             * System.out.println("Las ubicaciones actuales son " +
             * registerRegion[count].getGeographicLocation()); este sout es para
             * mostrar ubicaciones *
             */
            return indice(numM);
        }
        if (registerStudents[numM].getGeographicLocation().equals(registerRegion[count].getGeographicLocation())) {
            if (numM == 0) {
                return indice(-1);
            }
            return indice(numM);
        }

        return indic(numM, count + 1);
    }

    /**
     * esta funcion esta a puro For e incompleta se encarga de Agrupar
     * estudiantes
     */
    public void readerData() {
        indice(0);
        int countGroup = 0;
        int numGroup = 1;
        exitAll = true;
        int t = 0;
        System.out.println("────────────────────╣");
        for (int i = 0; i < registerRegion.length; i++) {
            if (registerRegion[i] != null) {
                System.out.println((i + 1) + ")" + registerRegion[i].getGeographicLocation());
            }

        }
        System.out.println("────────────────────╣");
        System.out.println("seleccione la region que desea filtrar");
        System.out.print("─>");
        int locationPerson;
        int  countRegisterR = 0;

        locationPerson = scanner.nextInt();
        locationPerson = locationPerson - 1;

        for (int i = 0; i < registerStudents.length; i++) {
            if (registerRegion[locationPerson].getGeographicLocation().equalsIgnoreCase(registerStudents[i].getGeographicLocation())) {

                registerR[countRegisterR] = registerRamdomS[i];
                countGroup++;
                if (exitAll == true) {
                }
                if (countGroup == 3) {
                    countGroup = 0;
                    numGroup = numGroup + 1;
                }
                countRegisterR++;
            }
        }
        countRegisterR = 0;
        for (countRegisterR = 0; countRegisterR < registerR.length; countRegisterR++) {
            if (registerR[countRegisterR] == null) {
                break;
            }
        }
        System.out.println("la cantidad de estudiantes que hay es de " + countRegisterR);
        numGroup = 1;
        System.out.println("digite en la porcion de grupos que desea realizar");
        System.out.print("─>");
        int y = 0;
        y = scanner.nextInt();
        countGroup = 0;
        y = y;

        boolean var = true;

        for (int j = 0; j < registerR.length; j++) {
            if (registerR[j] == null) {
                break;
            }

            if (var == true) {
        System.out.println("─────────────────────────────────────────╣");
                System.out.println("Este es el grupo " + numGroup);
                var = false;
            }
            System.out.println("Estudiante " + (j + 1) + ") " + registerR[j].getName() + " N◦ carnet " + registerR[j].getIdStudent());

            if (exitAll == true) {
                int varStorange = countRegisterR / y;
                varStorange = varStorange * y;
                varStorange = countRegisterR - varStorange;

                if (varStorange == 1) {

                    countGroup = countGroup - 1;
                }
                exitAll = false;
            }
            countGroup++;
            if (countGroup == y) {
                countGroup = 0;
                var = true;
                numGroup = numGroup + 1;
            }

        }
         System.out.println("─────────────────────────────────────────╣");
        t = 0;
        for (int i = 0; i < registerStudents.length; i++) {
            if (registerRegion[locationPerson].getGeographicLocation().equalsIgnoreCase(registerStudents[i].getGeographicLocation())) {

                registerR[t] = null;
                t++;
            }
        }

    }

    public int selectName() {

        System.out.println("Digite el numero de persona para modificar el nombre");
        System.out.print("─>");
        int positionName = scanner.nextInt();
        return positionName - 1;
    }

    public int seePersonName(int c) {
        if (count != registerStudents.length) {
            System.out.println("╠──────────────────────────────╣");
            System.out.println("Estudiante Nᵒ" + (count + 1));
            System.out.println("Nombre: " + registerStudents[count].getName());
            System.out.println("Carnet: " + registerStudents[count].getIdStudent());
            System.out.println("╠──────────────────────────────╣");
            count++;
            return seePersonName(count);
        }
        count++;
        return (0);
    }

    public String modifytName() {
        int numStudent = selectName();
        System.out.println("╠──────────────────────────────╣");
        System.out.println("Usted selecciono al estudiante: " + registerStudents[numStudent].getName());
        System.out.println("Carnet: " + registerStudents[numStudent].getIdStudent());
        System.out.println("Digite el nombre que le desea asignar");
        System.out.println("╠──────────────────────────────╣");
        System.out.print("─>");
        String newName = scannerTwo.nextLine();
        registerStudents[numStudent].setName(newName);
        numStudent = 0;
        return null;
    }

    public int selectEmail() {
        count = 0;
        seePersonName(count);
        System.out.println("Digite la persona que desea modificar el Email");
        int positionEmail = scanner.nextInt();
        return positionEmail - 1;
    }

    public int seePersonEmail(int c) {
        if (count != registerStudents.length) {
            System.out.println("╠──────────────────────────────╣");
            System.out.println("Estudiante Nᵒ" + (count + 1));
            System.out.println("Nombre: " + registerStudents[count].getName());
            System.out.println("Email" + registerStudents[count].getEmail());
            System.out.println("╠──────────────────────────────╣");
            count++;
            return seePersonName(count);
        }
        count++;
        return (0);
    }

    public String modifytEmail() {
        int numStudent = selectEmail();
        System.out.println("╠──────────────────────────────╣");
        System.out.println("Usted selecciono al estudiante: " + registerStudents[numStudent].getName());
        System.out.println("Email: " + registerStudents[numStudent].getEmail());
        System.out.println("Digite el email le desea asignar");
        System.out.println("╠──────────────────────────────╣");
        System.out.print("─>");
        String newEmail = scannerTwo.nextLine();
        registerStudents[numStudent].setEmail(newEmail);
        numStudent = 0;
        return null;
    }

    public int selectGender() {
        count = 0;
        seePersonName(count);
        System.out.println("Digite la persona que desea modificar el Genero");
        System.out.print("─>");
        int positionGender = scanner.nextInt();
        return positionGender - 1;
    }

    public int seePersonGender(int c) {
        if (count != registerStudents.length) {
            System.out.println("╠──────────────────────────────╣");
            System.out.println("Estudiante Nᵒ" + (count + 1));
            System.out.println("Nombre: " + registerStudents[count].getName());
            System.out.println("Genero: " + registerStudents[count].getGender());
            System.out.println("╠──────────────────────────────╣");
            count++;
            return seePersonGender(count);
        }
        count++;
        return (0);
    }

    public String modifytGender() {
        int numStudent = selectGender();
        System.out.println("╠──────────────────────────────╣");
        System.out.println("Usted selecciono al estudiante: " + registerStudents[numStudent].getName());
        System.out.println("Genero: " + registerStudents[numStudent].getGender());
        System.out.println("Digite el genero que le desea asignar M/F");
        System.out.println("╠──────────────────────────────╣");
        System.out.print("─>");
        String newGender = scannerTwo.nextLine();
        registerStudents[numStudent].setGender(newGender);
        numStudent = 0;
        return null;
    }

    public int selectIdStudent() {
        count = 0;
        seeIdStudent(count);
        System.out.println("Digite la persona que desea modificar el carnet");
        int positionIdStudent = scanner.nextInt();
        return positionIdStudent - 1;
    }

    public int seeIdStudent(int c) {
        if (count != registerStudents.length) {
            System.out.println("╠──────────────────────────────╣");
            System.out.println("Estudiante Nᵒ" + (count + 1));
            System.out.println("Nombre: " + registerStudents[count].getName());
            System.out.println("Carnet: " + registerStudents[count].getIdStudent());
            System.out.println("╠──────────────────────────────╣");
            count++;
            return seeIdStudent(count);
        }
        count++;
        return (0);
    }

    public String modifyIdStudent() {
        int numStudent = selectIdStudent();
        System.out.println("╠──────────────────────────────╣");
        System.out.println("Usted selecciono al estudiante: " + registerStudents[numStudent].getName());
        System.out.println("Carnet: " + registerStudents[numStudent].getIdStudent());
        System.out.println("Digite el carnet que le desea asignar");
        System.out.println("╠──────────────────────────────╣");
        System.out.print("─>");
        String newIdStudent = scannerTwo.nextLine();
        registerStudents[numStudent].setIdStudent(newIdStudent);
        numStudent = 0;
        return null;
    }

    public void deleteAllData() {
        count = 0;
        seePersonName(count);
        System.out.println("Seleccione la persona que desea eliminar sus datos");
        System.out.print("─>");
        int dataDelete = scanner.nextInt() - 1;

        registerStudents[dataDelete].setName("Vacio");
        registerStudents[dataDelete].setIdStudent("Vacio");
        registerStudents[dataDelete].setGeographicLocation("Vacio");
        registerStudents[dataDelete].setGender("Vacio");
        registerStudents[dataDelete].setEmail("Vacio");
        System.out.println("Se elimino correctamente");
    }

    public int seeAllData(int count) {

        if (count != registerStudents.length) {
            System.out.println("╠──────────────────────────────╣");
            if (registerStudents[count].getName().equals("Vacio")) {
                System.out.println("Este espacio esta disponible");
            } else {
                System.out.println("Estudiante: " + registerStudents[count].getName());
            }
            if (registerStudents[count].getIdStudent().equals("Vacio")) {
            } else {
                System.out.println("Carnet: " + registerStudents[count].getIdStudent());
            }
            if (registerStudents[count].getEmail().equals("Vacio")) {
            } else {
                System.out.println("Gmail: " + registerStudents[count].getEmail());
            }
            if (registerStudents[count].getGeographicLocation().equals("Vacio")) {
            } else {
                System.out.println("Ubicacion: " + registerStudents[count].getGeographicLocation());
            }
            if (registerStudents[count].getGender().equals("Vacio")) {
            } else {
                System.out.println("Genero: " + registerStudents[count].getGender());
            }
            System.out.println("╠──────────────────────────────╣");
            count++;
            return seeAllData(count);
        }

        count++;

        return 0;
    }

    public int selectStudent() {
        count = 0;
        seeStudent(count);
        System.out.println("Digite la persona que desea modificar los datos");
        System.out.print("─>");
        int positionStudent = scanner.nextInt();
        return positionStudent - 1;
    }

    public int seeStudent(int c) {
        if (count != registerStudents.length) {
            System.out.println("╠──────────────────────────────╣");
            if (registerStudents[count].getName().equals("Vacio")) {
                System.out.println("Este espacio esta disponible");
            } else {
                System.out.println("Estudiante: " + registerStudents[count].getName());
            }
            if (registerStudents[count].getIdStudent().equals("Vacio")) {
            } else {
                System.out.println("Carnet: " + registerStudents[count].getIdStudent());
            }
            if (registerStudents[count].getEmail().equals("Vacio")) {
            } else {
                System.out.println("Gmail: " + registerStudents[count].getIdStudent());
            }
            if (registerStudents[count].getGeographicLocation().equals("Vacio")) {
            } else {
                System.out.println("Ubicacion: " + registerStudents[count].getGeographicLocation());
            }
            if (registerStudents[count].getGender().equals("Vacio")) {
            } else {
                System.out.println("Genero: " + registerStudents[count].getGender());
            }
            System.out.println("╠──────────────────────────────╣");
            count++;
            return seeStudent(count);
        }
        count++;
        return (0);
    }

    public String modifyStudent() {
        int numStudent = selectIdStudent();
        System.out.println("╠──────────────────────────────╣");
        if (registerStudents[numStudent].getName().equals("Vacio")) {
            System.out.println("Este espacio esta disponible");
        } else {
            System.out.println("Usted selecciono al estudiante: " + registerStudents[numStudent].getName());
        }

        if (registerStudents[numStudent].getIdStudent().equals("Vacio")) {
        } else {
            System.out.println("Carnet: " + registerStudents[numStudent].getIdStudent());
        }
        if (registerStudents[numStudent].getEmail().equals("Vacio")) {
        } else {
            System.out.println("Gmail: " + registerStudents[numStudent].getEmail());
        }
        if (registerStudents[numStudent].getGeographicLocation().equals("Vacio")) {
        } else {
            System.out.println("Ubicacion: " + registerStudents[numStudent].getGeographicLocation());
        }
        if (registerStudents[numStudent].getGender().equals("Vacio")) {
        } else {
            System.out.println("Genero: " + registerStudents[numStudent].getGender());
        }
        System.out.println("Digite el nombre que le desea asignar");
        System.out.println("╠──────────────────────────────╣");
        System.out.print("─>");
        String newName = scannerTwo.nextLine();
        registerStudents[numStudent].setName(newName);

        System.out.println("Digite el carnet que le desea asignar");
        System.out.println("╠──────────────────────────────╣");
        System.out.print("─>");
        String newIdStudent = scannerTwo.nextLine();
        registerStudents[numStudent].setIdStudent(newIdStudent);

        System.out.println("Digite el correo que le desea asignar");
        System.out.println("╠──────────────────────────────╣");
        System.out.print("─>");
        String newEmail = scannerTwo.nextLine();
        registerStudents[numStudent].setEmail(newEmail);

        System.out.println("Digite el ubicacion geografica que le desea asignar");
        System.out.println("╠──────────────────────────────╣");
        System.out.print("─>");
        String newGeographicLocation = scannerTwo.nextLine();
        registerStudents[numStudent].setGeographicLocation(newGeographicLocation);

        System.out.println("Digite el genero que le desea asignar M/F");
        System.out.println("╠──────────────────────────────╣");
        System.out.print("─>");
        String newGender = scannerTwo.nextLine();
        registerStudents[numStudent].setGender(newGender);

        numStudent = 0;
        return null;
        
    }
        
        public int groupRamdon(){
         
            
            if (exitAll==true) {
            for (int i = 0; i < registerStudents.length; i++) {
                ramdom[i]=-1;
                System.out.println(ramdom[i]);
                
                
            }
           count=0;
            exitAll=false;
            }
            if (count!=registerStudents.length) {
                int var;
                var =(int) ((Math.random() * 18) + 0);
             
                //var representa un math Ramdom
                int x;
                countVar=0;
                x =generateRamdon(var);
   
                registerRamdomS[count]=registerStudents[x];
                System.out.println(registerRamdomS[count]);
                count++;
                return groupRamdon();
            }
            count++;
          
    
   
            
            
   

        return 0;








}
        
        
       public int generateRamdon( int generateR){
    
            if (ramdom[countVar]==-1) {
               ramdom[countVar]=generateR;
   
           
               return generateR;
           }
             if (countVar==ramdom.length) {
                countVar=0;
               return generateR;
           }
           for (int i = 0; i < ramdom.length; i++) {
               if (generateR==ramdom[i]) {
                countVar =0;

                //llamar al metodo generar numero ramdon
                //asignar el numero a ge
                int var1;//esta va a ser la variable del math
                var1 =(int) ((Math.random() * 18) + 0);
                generateR = var1;
                return generateRamdon(generateR);            
           }
           }
        
            
           
           
            countVar++;

            if (countVar<ramdom.length) {
               return generateRamdon(generateR);
           }
     
   
            
            
   

        return  generateRamdon(generateR);








}
           
        
        
    }


