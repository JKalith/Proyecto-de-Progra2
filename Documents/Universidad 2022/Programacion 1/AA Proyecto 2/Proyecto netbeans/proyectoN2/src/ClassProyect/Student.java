package ClassProyect;

/**
 *
 * @author James Arias Avalos
 * @author Diego Herrera López
 */
public class Student extends person {

    private String idStudent;

    /**
     * Este es el constructor vacio de estudiantes.
     */
    public Student() {
    }

    /**
     *
     * @param idStudent Estos son los get y set de estudiantes con sus
     * respectivos datos.
     */
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