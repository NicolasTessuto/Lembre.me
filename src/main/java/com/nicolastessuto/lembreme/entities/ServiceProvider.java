package com.nicolastessuto.lembreme.entities;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_ServicesProviders")
public class ServiceProvider { // Fornecedor de servico

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long  id;
    private long cnpj;
    private String name;
    private LocalDate stipulatedPaymentDate;
    private List<Invoice> invoices;


    public ServiceProvider(long cnpj, String name, Long id, LocalDate stipulatedPaymentDate) {
        this.cnpj = cnpj;
        this.name = name;
        this.id = id;
        this.stipulatedPaymentDate = stipulatedPaymentDate;
    }

    public ServiceProvider() {
    } //empty constructor for tests.

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
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

}
