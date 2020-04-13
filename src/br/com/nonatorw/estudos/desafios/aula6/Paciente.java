package br.com.nonatorw.estudos.desafios.aula6;

import java.time.LocalDateTime;

public class Paciente {
    private Integer codigo;
    private String nome;
    private String sobrenome;
    private Integer idade;
    private String sexo;
    private String telefone;
    private String endereço;

    public Paciente(Integer codigo, String nome, String sobrenome, Integer idade, String sexo, String telefone, String endereço) {
        this.codigo = codigo;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereço = endereço;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void marcarConsulta(LocalDateTime dhConsulta) {
    }

    public void remarcarConsulta(LocalDateTime dhConsultaAtual, LocalDateTime dhConsultaRemarcada) {
    }

    public void consultarConsulta(LocalDateTime dhConsulta) {
    }

    public void cancelarConsulta(LocalDateTime dhConsulta) {
    }
}
