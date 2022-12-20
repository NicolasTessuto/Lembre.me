package com.nicolastessuto.lembreme.entities;

import com.nicolastessuto.lembreme.enums.PaymentMethod;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "tb_Invoices")
public class Invoice { //Nota Fiscal

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    @ManyToOne
    private ServiceProvider serviceProvider;
    private int invoiceNumber;
    private java.sql.Date issueDate;
    private java.sql.Date dueDate;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    private float price;
    private boolean payed;

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
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

    public void setPaymentMethod(PaymentMethod formaDePagamento) {
        this.paymentMethod = formaDePagamento;
    }

    public boolean itsPayed() {
        return payed;
    }

    public void setPayed(boolean payed) {
        this.payed = payed;
    }

    public Invoice(ServiceProvider invoiceNumber, java.sql.Date issueDate, java.sql.Date dueDate) {
        this.serviceProvider = invoiceNumber;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
    }

    public Invoice(ServiceProvider invoiceNumber, java.sql.Date issueDate, java.sql.Date dueDate, PaymentMethod formaDePagamento) {
        this.serviceProvider = invoiceNumber;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.paymentMethod = formaDePagamento;
    }

    public Invoice() { //Construtor vazio para que nao seja preciso instanciar o objeto inteiro
    }



}
