public class Consulta implements Agendamento {
    private Paciente paciente;
    private Medico medico;
    private String dataConsulta;
    private String horaConsulta;
    private String status;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    Consulta(){};
    Consulta(Paciente paciente, Medico medico, String dataConsulta, String horaConsulta, String status){
        this.paciente = paciente;
        this.medico = medico;
        this.dataConsulta = dataConsulta;
        this.horaConsulta = horaConsulta;
        this.status = status;
    }

    @Override
    public void agendarConsulta(Paciente paciente, Medico medico, String data, String hora) {

    }

    @Override
    public void cancelarConsulta(int consultaId) {

    }

    @Override
    public String toString() {
        return "Paciente: " + this.paciente + ", Médico:" + this.medico + ", Data e hora: " +
                this.dataConsulta + " " + this.horaConsulta + ", Status: " + this.status;
    }
}
