package com.nicolastessuto.Lembre.me.entities;


import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ServiceProvider {


    private double cnpj;
    private String name;
    private String id;
    private Date stipulatedPaymentDate;
    public ArrayList<NotaFiscal> notasFiscais;

    Scanner sc = new Scanner(System.in);

    public ServiceProvider(double cnpj, String name, String id, Date stipulatedPaymentDate) {
        this.cnpj = cnpj;
        this.name = name;
        this.id = id;
        this.stipulatedPaymentDate = stipulatedPaymentDate;
    }

    public ServiceProvider() {
    } //Criado um consrutor vazio para que nao seja necessário intanciar a variavel toda nos testes

    public double getCnpj() {
        return cnpj;
    }

    public void setCnpj(double cnpj) {
        this.cnpj = cnpj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        return "FORNECEDOR DE SERVICO:[" + id +  "]\n {" +
                "CNPJ=" + cnpj +
                ", NOME DO FORNECEDOR='" + name +
                ", ID='" + id +
                ", DATA DE PAGAMENTO ESTIPULADA=" + stipulatedPaymentDate +
                ", notasFiscais=" + notasFiscais +
                '}';
    }

}
