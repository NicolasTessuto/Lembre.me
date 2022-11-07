package com.nicolastessuto.Lembre.me.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "tb_ServicesProviders")
public class ServiceProvider {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long  id;
    private long cnpj;
    private String name;
    private java.sql.Date stipulatedPaymentDate;


    public ServiceProvider(long cnpj, String name, Long id, Date stipulatedPaymentDate) {
        this.cnpj = cnpj;
        this.name = name;
        this.id = id;
        this.stipulatedPaymentDate = stipulatedPaymentDate;
    }

    public ServiceProvider() {
    } //empty constructor for tests.

    public double getCnpj() {
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

    public Date getStipulatedPaymentDate() {
        return stipulatedPaymentDate;
    }

    public void setStipulatedPaymentDate(Date stipulatedPaymentDate) {
        this.stipulatedPaymentDate = stipulatedPaymentDate;
    }

    @Override
    public String toString() {
        return "FORNECEDOR DE SERVICO:[" + id + "]\n {" +
                "CNPJ=" + cnpj +
                ", NOME DO FORNECEDOR='" + name +
                ", ID='" + id +
                ", DATA DE PAGAMENTO ESTIPULADA=" + stipulatedPaymentDate +
                ", notasFiscais=" +
                '}';
    }

}
