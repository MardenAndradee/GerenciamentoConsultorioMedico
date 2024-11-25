import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Paciente> pacientes = new ArrayList<>();
        List<Medico> medicos = new ArrayList<>();
        List<Consulta> consultas = new ArrayList<>();

        int opc;
        int opcModulo;
        int index;

        do {

            System.out.println("=====MENU=====");
            System.out.println("1.Gerenciar Médicos");
            System.out.println("2.Gerenciar Pacientes");
            System.out.println("3.Gerenciar Consultas");
            System.out.println("4.Relatório mensal por especialidade médica");
            System.out.println("0.Sair");


            opc = sc.nextInt();


           switch (opc){
               case 1:
                   System.out.println("== MÓDULO MÉDICOS ==");
                   System.out.println("1.Cadastrar Médicos");
                   System.out.println("2.Vizualizar médicos cadastrados");
                   System.out.println("3.Remover Médico");
                   System.out.println("3.Relatório mensal de consultas por especialidade médica ");
                   System.out.println("0.Voltar");
                   opcModulo = sc.nextInt();

                   if(opcModulo == 1){
                       System.out.println("Digite o nome do Médico: ");
                       sc.nextLine();
                       String nomeMedico = sc.nextLine();

                       System.out.println("Digite o cpf do Médico: ");
                       String cpfMedico = sc.nextLine();

                       System.out.println("Digite o telefone do Médico: ");
                       String telefoneMedico = sc.nextLine();

                       System.out.println("Digite a especialidade do Médico: ");
                       String especialidade = sc.nextLine();

                       System.out.println("Digite o crm do Médico: ");
                       String crm = sc.nextLine();

                       Medico medico = new Medico(nomeMedico,cpfMedico,telefoneMedico,especialidade,crm);

                       medicos.add(medico);


                   }else if(opcModulo == 2) {
                       System.out.println("MÉDICOS CADASTRADOS");
                       index = 1;

                       for (Medico medico : medicos) {
                           System.out.println(index + "." +medico);
                           index++;
                       }

                   }else if(opcModulo == 3){
                       System.out.println("SELECIONE O MÉDICO QUE DESEJA REMOVER");

                       index = 1;

                       for (Medico medico : medicos) {
                           System.out.println(index + "." +medico);
                           index++;
                       }

                       int escolha = sc.nextInt();


                       //verifica se o medico não tem consulta agendada
                       for (Consulta c : consultas) {
                           System.out.println(c.getMedico() + c.getStatus());
                           if (c.getStatus().equals("Agendado")) {
                               System.out.println("O médico tem consultas agendadas, antes de excluir," +
                                       "cancele as consultas agendadas");
                               break;
                           }else{
                               medicos.remove(escolha - 1);
                               System.out.println("Removido com sucesso!");
                           }
                       }

                   }else{
                       break;
                   }

                   break;
               case 2:
                   System.out.println("== MÓDULO PACIENTES ==");
                   System.out.println("1.Cadastrar Pacientes");
                   System.out.println("2.Vizualizar Pacientes cadastrados");
                   System.out.println("3.Remover Paciente");
                   System.out.println("0.Voltar");
                   opcModulo = sc.nextInt();

                   if(opcModulo == 1){
                       System.out.println("Digite o nome do Paciente: ");
                       sc.nextLine();
                       String nomePaciente = sc.nextLine();

                       System.out.println("Digite o cpf do Paciente: ");
                       String cpfPaciente = sc.nextLine();

                       System.out.println("Digite o telefone do Paciente: ");
                       String telefonePaciente = sc.nextLine();

                       Paciente paciente = new Paciente(nomePaciente,cpfPaciente,telefonePaciente);

                       pacientes.add(paciente);


                   }else if(opcModulo == 2) {
                       System.out.println("PACIENTES CADASTRADOS");
                       index = 1;

                       for (Paciente paciente : pacientes) {
                           System.out.println(index + "." + paciente);
                           index++;
                       }

                   }else if(opcModulo == 3){
                       System.out.println("SELECIONE O PACIENTE QUE DESEJA REMOVER");

                       index = 1;

                       for (Paciente paciente : pacientes) {
                           System.out.println(index + "." + paciente);
                           index++;
                       }

                       int escolha = sc.nextInt();


                       //verifica se o medico não tem consulta agendada
                       for (Consulta c : consultas) {
                           System.out.println(c.getPaciente() + c.getStatus());
                           if (c.getStatus().equals("Agendado")) {
                               System.out.println("O paciente tem consultas agendadas, antes de excluir," +
                                       "cancele as consultas agendadas");
                               break;
                           }else{
                               pacientes.remove(escolha - 1);
                               System.out.println("Removido com sucesso!");
                           }
                       }



                   }else{
                       break;
                   }


                   break;
               case 3:
                   System.out.println("== MÓDULO CONSULTAS ==");
                   System.out.println("1.Cadastrar Consultas");
                   System.out.println("2.Vizualizar Consultas cadastradas");
                   System.out.println("3.Cancelar Consulta");
                   System.out.println("0.Voltar");
                   opcModulo = sc.nextInt();

                   if(opcModulo == 1){
                       //CADASTRAR CONSULTA

                       //consulta não pode ser realizada se o horário nao estiver disponível


                       //listar Paciente
                       System.out.println("PACIENTES");
                       System.out.println(" ");
                       index = 1;

                       for (Paciente paciente : pacientes) {
                           System.out.println(index + "." + paciente);
                           index++;
                       }

                       // Selecionando um paciente
                       System.out.println("Digite o número do paciente: ");
                       int escolha = sc.nextInt();

                       Paciente pacienteSelec = pacientes.get(escolha - 1);


                       //listar medico
                       System.out.println("MÉDICOS");
                       System.out.println(" ");
                       index = 1;

                       for(Medico medico : medicos){
                           System.out.println(index + "." + medico);
                           index++;
                       }

                       //Selecionando um Médico
                       System.out.println("Digite o número do médico responsável pela consulta");
                       escolha = sc.nextInt();

                       Medico medicoSelec = medicos.get(escolha - 1);




                       System.out.println("Digite a data da consulta: ");
                       sc.nextLine();
                       String data = sc.nextLine();

                       System.out.println("Digite a hora da consulta: ");
                       String hora = sc.nextLine();

                       boolean isHorarioDisponivel = true;
                       for (Consulta c : consultas) {
                           if (c.getMedico().equals(medicoSelec) && c.getDataConsulta().equals(data) && c.getHoraConsulta().equals(hora)) {
                               isHorarioDisponivel = false;
                               break;
                           }
                       }

                       if (!isHorarioDisponivel) {
                           System.out.println("O médico selecionado já tem uma consulta agendada para esse horário.");
                       } else {
                           Consulta consulta = new Consulta(pacienteSelec,medicoSelec,data,hora,"Agendado");

                           consultas.add(consulta);

                           consulta.agendarConsulta(pacienteSelec,medicoSelec,data,hora);
                           System.out.println("Consulta agendada com sucesso!");
                       }



                   }else if(opcModulo == 2) {
                       //VIZUALIZAR CONSULTAS

                       for(Consulta consulta : consultas){
                           System.out.println(consulta.toString());
                       }

                   }else if(opcModulo ==3) {
                       try {
                           System.out.println("Selecione a consulta que deseja cancelar: ");
                           index = 1;

                           for (Consulta consulta : consultas) {
                               System.out.println(index + consulta.toString());
                               index++;
                           }


                           int escolha = sc.nextInt();

                           Consulta consultaSelec = consultas.get(escolha - 1);
                           consultaSelec.setStatus("CANCELADO");

                           System.out.println("Consulta cancelada!");

                       } catch (Exception e) {
                           throw new RuntimeException("Erro consulta não encontrada, " + e);
                       }


                   }else{
                       break;
                   }

                   break;

               case 4:
                   System.out.println("Digite o mês (1-12)");
                   int mes = sc.nextInt();

                   System.out.println("Digite o ano: ");
                   int ano = sc.nextInt();

                   System.out.println("Relatório de Consultas:");

                   for (Consulta consulta : consultas) {
                       String[] dataSplit = consulta.getDataConsulta().split("/");
                       int mesConsulta = Integer.parseInt(dataSplit[1]);
                       int anoConsulta = Integer.parseInt(dataSplit[2]);

                       if (mesConsulta == mes && anoConsulta == ano) {

                           System.out.println(consulta.ConsultasEspecialidade());
                       }
                   }

                   break;

           }


        }while(opc != 0);



    }
}