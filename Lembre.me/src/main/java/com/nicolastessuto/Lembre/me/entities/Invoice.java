package com.nicolastessuto.Lembre.me.entities;

import com.nicolastessuto.Lembre.me.enums.PaymentMethod;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "tb_Invoices")
public class Invoice {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    @ManyToOne
    @JoinColumn(name = "serviceProviderId")
    private ServiceProvider serviceProviderId;

    private int invoiceNumber;
    private java.sql.Date issueDate;
    private java.sql.Date dueDate;
    private Enum<PaymentMethod> paymentMethod;

    private float price;
    private boolean payed;

    public ServiceProvider getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(ServiceProvider serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(java.sql.Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(java.sql.Date dueDate) {
        this.dueDate = dueDate;
    }

    public Enum<PaymentMethod> getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Enum<PaymentMethod> formaDePagamento) {
        this.paymentMethod = formaDePagamento;
    }

    public boolean itsPayed() {
        return payed;
    }

    public void setPayed(boolean payed) {
        this.payed = payed;
    }

    public Invoice(ServiceProvider invoiceNumber, java.sql.Date issueDate, java.sql.Date dueDate) {
        this.serviceProviderId = invoiceNumber;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
    }

    public Invoice(ServiceProvider invoiceNumber, java.sql.Date issueDate, java.sql.Date dueDate, Enum<PaymentMethod> formaDePagamento) {
        this.serviceProviderId = invoiceNumber;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.paymentMethod = formaDePagamento;
    }

    public Invoice() { //Construtor vazio para que nao seja preciso instanciar o objeto inteiro
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "numeroNf=" + serviceProviderId +
                ", emissao=" + issueDate +
                ", vencimento=" + dueDate +
                ", formaDePagamento=" + paymentMethod +
                ", paga=" + payed +
                '}';
    }

}
