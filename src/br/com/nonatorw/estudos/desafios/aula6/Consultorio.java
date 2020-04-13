package br.com.nonatorw.estudos.desafios.aula6;

import java.time.LocalDateTime;

public class Consultorio {
    public static void main(String[] args) {
        Dentista dentista = new Dentista("Carlos",
                "Silva",
                "Cirurgião Dentista",
                "SP-CS-01",
                true);

        dentista.atenderPaciente();
        dentista.marcarConsulta(LocalDateTime.now());
        dentista.remarcarConsulta(LocalDateTime.now(), LocalDateTime.now().plusDays(5));
        dentista.cancelarConsulta(LocalDateTime.now().plusDays(5));
        dentista.viajarCongresso();

        Paciente paciente = new Paciente(
                1,
                "Maria",
                "Sousa",
                33,
                "Feminino",
                "11-91111-1111",
                "Rua Central, 100 - São Paulo - SP"
        );

        paciente.marcarConsulta(LocalDateTime.now());
        paciente.remarcarConsulta(LocalDateTime.now(), LocalDateTime.now().plusDays(5));
        paciente.consultarConsulta(LocalDateTime.now().plusDays(5));
        paciente.cancelarConsulta(LocalDateTime.now().plusDays(5));

    }
}
