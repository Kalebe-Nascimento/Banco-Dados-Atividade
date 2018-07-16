/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kalebe.controledegastos;

/**
 *
 * @author aluno
 */
public class Funcao {

    /**
     * @return the acessoRestristo
     */
    public boolean isAcessoRestristo() {
        return acessoRestristo;
    }

    /**
     * @param acessoRestristo the acessoRestristo to set
     */
    public void setAcessoRestristo(boolean acessoRestristo) {
        this.acessoRestristo = acessoRestristo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    private boolean acessoRestristo;
    private String descricao;
    
}
