/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassProyect;

/**
 *
 * @author james
 */
public class Student extends person{
    private String idStudent;

    public Student() {
    }

    public Student(String idStudent) {
        this.idStudent = idStudent;
    }

    public Student(String idStudent, String name, String email, String gender, String geographicLocation) {
        super(name, email, gender, geographicLocation);
        this.idStudent = idStudent;
    }

    /**
     * @return the idStudent
     */
    public String getIdStudent() {
        return idStudent;
    }

    /**
     * @param idStudent the idStudent to set
     */
    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public String toString() {
        return '}' + super.toString() + "Student{" + "idStudent=" + idStudent;
        
    }






    
}
