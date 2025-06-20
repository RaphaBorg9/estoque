/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.estoque.dto;

/**
 *
 * @author 1513003
 */
public class TipoLogradouroResponse {
    private Long id;
    private String nome;
    private String sigla;

    public TipoLogradouroResponse() {
    }

    public TipoLogradouroResponse(Long id, String nome, String sigla) {
        this.id = id;
        this.sigla = sigla;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
