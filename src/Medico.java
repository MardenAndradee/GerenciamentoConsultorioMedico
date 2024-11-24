public class Medico extends Pessoa{

    private String especialidade;
    private String crm;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    Medico(String nome, String cpf,String telefone, String especialidade, String crm){

        super(nome,telefone,telefone);
        this.especialidade = especialidade;
        this.crm = crm;

    }

    public String toString() {
        return super.toString() + ", Especialidade: " + especialidade + ", CRM: " + crm;
    }


}
