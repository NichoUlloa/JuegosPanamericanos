public class Disciplinas {

    private String nombreAtleta;
    private int numeroParticipantes;
    private double recordMundial;

    public Disciplinas(String nombre, int numeroParticipantes, double recordMundial) {
        this.nombreAtleta = nombre;
        this.numeroParticipantes = numeroParticipantes;
        this.recordMundial = recordMundial;
    }

    public String getNombre() {
        return nombreAtleta;
    }
    public int getNumeroParticipantes() {
        return numeroParticipantes;
    }
    public double getRecordMundial() {
        return recordMundial;
    }
    public void setNombre(String nombre) {
        this.nombreAtleta = nombre;
    }
    public void setNumeroParticipantes(int numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }
    public void setRecordMundial(double recordMundial) {
        this.recordMundial = recordMundial;
    }

    public void agregarAtletaIndividual(Atleta atleta) {
        if (atleta != null && !atletas.contains(atleta)) {
            atletas.add(atleta);
        }
    }
    public void eliminarAtletaIndividual(Atleta atleta) {
        if (atleta != null && atletas.contains(atleta)) {
            atletas.remove(atleta);
        }
    }

    @Override
    public String toString() {
        return "Disciplinas{" +
                "nombre='" + nombreAtleta + '\'' +
                ", numeroParticipantes=" + numeroParticipantes +
                ", recordMundial=" + recordMundial +
                '}';
    }

}
