public interface Agendamento {

    public void agendarConsulta(Paciente paciente, Medico medico, String data, String hora);

    public void cancelarConsulta(int consultaId);

}
