package com.nicolastessuto.Lembre.me.entities;

import java.util.Date;


public class Invoice {

    private int numeroNf;
    private Date emissao;
    private Date vencimento;
    private enum<PaymentMethod> formaDePagamento;
    private boolean paga;

    public int getNumeroNf() {
        return numeroNf;
    }

    public void setNumeroNf(int numeroNf) {
        this.numeroNf = numeroNf;
    }

    public Date getEmissao() {
        return emissao;
    }

    public void setEmissao(Date emissao) {
        this.emissao = emissao;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public Enum<FormasDePagamento> getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(Enum<FormasDePagamento> formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }

    public Invoice(int numeroNf, Date emissao, Date vencimento) {
        this.numeroNf = numeroNf;
        this.emissao = emissao;
        this.vencimento = vencimento;
    }

    public Invoice(int numeroNf, Date emissao, Date vencimento, Enum<FormasDePagamento> formaDePagamento) {
        this.numeroNf = numeroNf;
        this.emissao = emissao;
        this.vencimento = vencimento;
        this.formaDePagamento = formaDePagamento;
    }

    public Invoice() { //Construtor vazio para que nao seja preciso instanciar o objeto inteiro
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "numeroNf=" + numeroNf +
                ", emissao=" + emissao +
                ", vencimento=" + vencimento +
                ", formaDePagamento=" + formaDePagamento +
                ", paga=" + paga +
                '}';
    }

}
