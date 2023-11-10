public class Principal {
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.inicializar();
    }

    public void inicializar() {
        JuegosPanamericanos juegosPanamericanos = new JuegosPanamericanos("Juegos Panamericanos 2019", null, null);

        juegosPanamericanos.agregarAtleta("Atleta 1", "Colombia", 20, null);
        juegosPanamericanos.agregarAtleta("Atleta 2", "Colombia", 20, null);

        juegosPanamericanos.agregarDisciplina("Disciplina 1", 10, 10.0);
        juegosPanamericanos.agregarDisciplina("Disciplina 2", 10, 10.0);

        juegosPanamericanos.agregarEquipo("Equipo 1", null, null);
        juegosPanamericanos.agregarEquipo("Equipo 2", null, null);

        juegosPanamericanos.agregarEvento(null, null, "01/01/2019");
        juegosPanamericanos.agregarEvento(null, null, "01/01/2019");

        juegosPanamericanos.agregarAtletaEnDisciplina("Atleta 1", "Disciplina 1");
        juegosPanamericanos.agregarAtletaEnDisciplina("Atleta 2", "Disciplina 1");

        juegosPanamericanos.agregarAtletaEnEquipo("Atleta 1", "Equipo 1");
        juegosPanamericanos.agregarAtletaEnEquipo("Atleta 2", "Equipo 1");

        System.out.println(juegosPanamericanos.toString());





    }
}
