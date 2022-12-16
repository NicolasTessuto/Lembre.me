package com.nicolastessuto.lembreme.controllers;

import com.nicolastessuto.lembreme.entities.Invoice;
import com.nicolastessuto.lembreme.repositories.InvoiceRepository;
import com.nicolastessuto.lembreme.services.InvoiceService;
import org.springframework.web.bind.annotation.RequestMapping;
import com.nicolastessuto.lembreme.dto.ServiceProviderDTO;
import com.nicolastessuto.lembreme.entities.ServiceProvider;
import com.nicolastessuto.lembreme.exceptions.ServiceProviderAlreadyExistsException;
import com.nicolastessuto.lembreme.repositories.ServiceProviderRepository;
import com.nicolastessuto.lembreme.services.ServiceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(value = "/invoices")
public class InvoiceController { //Controller Nota Fiscal

    @Autowired
    private InvoiceService service;

    @Autowired
    private InvoiceRepository invoiceRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Invoice> findById(@PathVariable Long id){
        Optional<Invoice> tempInvoice = service.findInvoiceById(id);
        return ResponseEntity.of(tempInvoice);
    }








}
