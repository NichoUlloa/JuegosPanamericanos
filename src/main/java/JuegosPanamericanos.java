import java.util.List;
public class JuegosPanamericanos {
    private String nombre;
    private List<Equipo> equipos;
    private List<Evento> eventos;

    public JuegosPanamericanos(String nombre, List<Equipo> equipos, List<Evento> eventos) {
        this.nombre = nombre;
        this.equipos = equipos;
        this.eventos = eventos;
    }

    public String getNombre() {
        return nombre;
    }
    public List<Equipo> getEquipos() {
        return equipos;
    }
    public List<Evento> getEventos() {
        return eventos;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }
    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
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
    public void agregarEvento(Evento evento) {
        if (evento != null && !eventos.contains(evento)) {
            eventos.add(evento);
        }
    }

    public void eliminarEvento(Evento evento) {
        if (evento != null && eventos.contains(evento)) {
            eventos.remove(evento);
        }
    }

    @Override
    public String toString() {
        return "JuegosPanamericanos{" +
                "nombre='" + nombre + '\'' +
                ", equipos=" + equipos +
                ", eventos=" + eventos +
                '}';
    }
}
