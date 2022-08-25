package com.example.fundamento.Model;

import javax.persistence.*;

@Entity                             //indica que a classe e armazenanda no banco
@Table(name="departamento")         //Torna explicito o nome da table

public class DepartamentoModel {
    @Column(name="id")              ///nome da coluna
    @Id                             //mostro que e  o id ou pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
    private Integer codigo;
    @Column(name="nome", length =50, nullable = false)
    private String nome;
    @Column(name="descricao", length =50, nullable = false)
    private String descricao;


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}
