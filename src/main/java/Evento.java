
import java.util.List;

public class Evento {
    private Disciplinas disciplina;
    private List<Equipo> equipos;
    //fecha
    private String fecha;

    public Evento(Disciplinas disciplina, List<Equipo> equipos, String fecha) {
        this.disciplina = disciplina;
        this.equipos = equipos;
        this.fecha = fecha;
    }
    public Disciplinas getDisciplina() {
        return disciplina;
    }
    public List<Equipo> getEquipos() {
        return equipos;
    }
    public String getFecha() {
        return fecha;
    }
    public void setDisciplina(Disciplinas disciplina) {
        this.disciplina = disciplina;
    }
    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void agregarEquipo(Equipo equipo) {
        if (equipo != null && !equipos.contains(equipo)) {
            equipos.add(equipo);
        }
    }

    public void eliminarEquipo(Equipo equipo) {
        if (equipo != null && equipos.contains(equipo)) {
            equipos.remove(equipo);
        }
    }

    @Override
    public String toString() {
        return "Evento{" +
                "disciplina=" + disciplina +
                ", equipos=" + equipos +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
