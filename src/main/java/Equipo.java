import java.util.List;

public class Equipo {
    private String nombreEquipo;
    private List<Atleta> atletas;
    private List<Disciplinas> disciplinas;

    public Equipo(String nombre, List<Atleta> atletas, List<Disciplinas> disciplinas) {
        this.nombreEquipo = nombre;
        this.atletas = atletas;
        this.disciplinas = disciplinas;
    }

    public String getNombre() {
        return nombreEquipo;
    }
    public List<Atleta> getAtletas() {
        return atletas;
    }
    public List<Disciplinas> getDisciplinas() {
        return disciplinas;
    }
    public void setNombre(String nombre) {
        this.nombreEquipo = nombre;
    }
    public void setAtletas(List<Atleta> atletas) {
        this.atletas = atletas;
    }
    public void setDisciplinas(List<Disciplinas> disciplinas) {
        this.disciplinas = disciplinas;
    }


    public void agregarAtletaEnEquipo(Atleta atleta) {
        if (atleta != null && !atletas.contains(atleta)) {
            atletas.add(atleta);
        }
    }

    public void eliminarAtletaEnEquipo(Atleta atleta) {
        if (atleta != null && atletas.contains(atleta)) {
            atletas.remove(atleta);
        }
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombreEquipo + '\'' +
                ", atletas=" + atletas +
                ", disciplinas=" + disciplinas +
                '}';
    }
}