package classroom;

public class Grupo {

    Persona[] estudiantes;
    Persona profesor;
    Asignatura asignatura;
    final int codigo;
    String horario;

    Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        Persona[] personas = new Persona[cantidadEstudiantes];
        this(profesor, asignatura, codigo, horario);
        this.setEstudiantes(personas);
    }

    Grupo(Persona profesor,Asignatura asignatura,int codigo, String horario ){
        this.codigo = codigo;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.horario = horario;
    }

    void setEstudiantes(Persona[] estd){
        this.estudiantes = estud;
    }

    Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura) {
        this.codigo = 0;
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
    }

    void cambiarEstudiante(Persona estudianteViejo, Persona estudianteNuevo) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getCedula() == estudianteViejo.getCedula()) {
                estudiantes[i] = estudianteNuevo;
                break;
            }
        }
    }
    
    void cambiarEstudiante(int indice, Persona estudiante) {
        estudiantes[indice] = estudiante;
    }
}
