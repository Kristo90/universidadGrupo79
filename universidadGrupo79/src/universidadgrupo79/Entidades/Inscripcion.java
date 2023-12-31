
package universidadgrupo79.Entidades;

/**
 *
 * @author kristo
 */
public class Inscripcion {
    
    private int idInscripcion;
    private Alumno alumno;
    private Materia materia;
    private double note;

    public Inscripcion() {
    }

    public Inscripcion(int idInscripcion, Alumno alumno, Materia materia, double note) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.note = note;
    }

    public Inscripcion(Alumno alumno, Materia materia, double note) {
        this.alumno = alumno;
        this.materia = materia;
        this.note = note;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
    

//    @Override
//    public String toString() {
//       String insc=idInscripcion + ", " + note + ", " + alumno.getIdAlumno() + ", " + materia.getIdMateria();
//       return insc;
//    }

    @Override
    public String toString() {
        String insc= materia.getIdMateria() +" "+ alumno.getIdAlumno()+ ", "+materia.getIdMateria();
        return insc;
    }
    
}
