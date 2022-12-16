package com.nicolastessuto.lembreme.services;

import com.nicolastessuto.lembreme.dto.InvoiceDTO;
import com.nicolastessuto.lembreme.entities.Invoice;
import com.nicolastessuto.lembreme.entities.ServiceProvider;
import com.nicolastessuto.lembreme.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository repository;

    public Optional<Invoice> findInvoiceById(Long id) {
        return repository.findById(id);
    }
    public List<Invoice> findAllInvoices(){return repository.findAll();}

    public ServiceProvider addInvoice(InvoiceDTO invoiceDTO){




        Long invoiceIssuerCnpj = Long.parseLong(invoiceDTO.serviceProvider().getCnpj());












    }
}
