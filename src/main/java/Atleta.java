import java.util.List;
public class Atleta {
    private String nombre;
    private String pais;
    private int edad;
    private List<Disciplinas> disciplinas;

    public Atleta(String nombre, String pais, int edad, List<Disciplinas> disciplinas) {
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
        this.disciplinas = disciplinas;
    }

    public String getNombre() {
        return nombre;
    }
    public String getPais() {
        return pais;
    }
    public int getEdad() {
        return edad;
    }
    public List<Disciplinas> getDisciplinas() {
        return disciplinas;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setDisciplinas(List<Disciplinas> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void agregarDisciplina(Disciplinas disciplina) {
        if (disciplina != null && !disciplinas.contains(disciplina)) {
            disciplinas.add(disciplina);
        }
    }
    public void eliminarDisciplina(Disciplinas disciplina) {
        if (disciplina != null && disciplinas.contains(disciplina)) {
            disciplinas.remove(disciplina);
        }
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", edad=" + edad +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
