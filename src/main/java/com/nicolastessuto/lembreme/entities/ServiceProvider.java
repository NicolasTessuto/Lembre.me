package com.nicolastessuto.lembreme.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_ServicesProviders")
public class ServiceProvider { // Fornecedor de servico

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long  id;
    private String cnpj;
    private String name;
    private LocalDate stipulatedPaymentDate;
    @OneToMany
    private List<Invoice> invoicesList;

    public ServiceProvider(String cnpj, String name, Long id, LocalDate stipulatedPaymentDate) {
        this.cnpj = cnpj;
        this.name = name;
        this.id = id;
        this.stipulatedPaymentDate = stipulatedPaymentDate;
    }

    public ServiceProvider() {
    } //empty constructor for tests.

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStipulatedPaymentDate() {
        return stipulatedPaymentDate;
    }

    public void setStipulatedPaymentDate(LocalDate stipulatedPaymentDate) {
        this.stipulatedPaymentDate = stipulatedPaymentDate;
    }

    public List<Invoice> getInvoicesList() {
        return invoicesList;
    }

    public void setInvoicesList(List<Invoice> invoicesList) {
        this.invoicesList = invoicesList;
    }
}
