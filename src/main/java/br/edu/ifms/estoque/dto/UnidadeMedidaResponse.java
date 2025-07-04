/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.estoque.dto;

/**
 *
 * @author 1513003
 */
public class UnidadeMedidaResponse extends DefaultResponse {

    private Boolean fracionado;
    
    public UnidadeMedidaResponse() {
    }

    public UnidadeMedidaResponse(Long id, String nome, Boolean fracionado) {
        super(id, nome);
        this.fracionado = fracionado;
    }

    public Boolean getFracionado() {
        return fracionado;
    }
    
}
