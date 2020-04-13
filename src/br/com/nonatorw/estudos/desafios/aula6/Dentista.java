package br.com.nonatorw.estudos.desafios.aula6;

import java.time.LocalDateTime;

public class Dentista {
    private String nome;
    private String sobrenome;
    private String especialidade;
    private String registroCRO;
    private Boolean ativo;

    public Dentista(String nome, String sobrenome, String especialidade, String registroCRO, Boolean ativo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.especialidade = especialidade;
        this.registroCRO = registroCRO;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getRegistroCRO() {
        return registroCRO;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void atenderPaciente() {
        System.out.println("O Dr." + this.getNome() + " está atendendo o paciente!");
    }

    public void marcarConsulta(LocalDateTime dhConsulta) {
        System.out.println("Marcando consulta com o paciente!");
    }

    public void remarcarConsulta(LocalDateTime dhConsulta, LocalDateTime dhNovaConsulta) {
        System.out.println("Remarcando consulta com o paciente!");
    }

    public void cancelarConsulta(LocalDateTime dhConsulta) {
        System.out.println("Cancelando consulta com o paciente!");
    }

    public void estaDisponivel() {
        System.out.println("Dr. " + this.getNome() + (!this.getAtivo() ? " não " : "") + " está disponível para consultas");
    }

    public void viajarCongresso() {
        this.ativo = Boolean.FALSE;
        System.out.println("Indisponível, pois está em um congresso!");
    }
}
