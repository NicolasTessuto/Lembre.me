package com.nicolastessuto.lembreme.entities;

import com.nicolastessuto.lembreme.enums.PaymentMethod;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_Invoices")
public class Invoice { //Nota Fiscal

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    @ManyToOne
    @JoinColumn(name = "serviceProviderId")
    private ServiceProvider serviceProvider;

    private int invoiceNumber;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private Enum<PaymentMethod> paymentMethod;

    private float price;
    private boolean payed;

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
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

    public Invoice(ServiceProvider invoiceNumber, LocalDate issueDate, LocalDate dueDate) {
        this.serviceProvider = invoiceNumber;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
    }

    public Invoice(ServiceProvider invoiceNumber, LocalDate issueDate, LocalDate dueDate, Enum<PaymentMethod> formaDePagamento) {
        this.serviceProvider = invoiceNumber;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.paymentMethod = formaDePagamento;
    }

    public Invoice() { //Construtor vazio para que nao seja preciso instanciar o objeto inteiro
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "numeroNf=" + serviceProvider +
                ", emissao=" + issueDate +
                ", vencimento=" + dueDate +
                ", formaDePagamento=" + paymentMethod +
                ", paga=" + payed +
                '}';
    }

}
