/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.tads.dsw.sisfin.model;

/**
 *
 * @author carloseduardobeluzo
 */
public class Card {
    private int number;
    private String validade;

    public Card (int number, String validade) {
        this.number = number;
        this.validade = validade;
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String Validade) {
        this.validade = Validade;
    }
    
}
