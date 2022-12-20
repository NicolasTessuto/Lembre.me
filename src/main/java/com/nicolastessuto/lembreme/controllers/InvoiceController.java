package com.nicolastessuto.lembreme.controllers;

import com.nicolastessuto.lembreme.entities.Invoice;
import com.nicolastessuto.lembreme.repositories.InvoiceRepository;
import com.nicolastessuto.lembreme.services.InvoiceService;
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
    private InvoiceRepository repository;
    @GetMapping(value = "/{number}")
    public ResponseEntity<Invoice> findByInvoiceNumber(@PathVariable int number) {
        Optional<Invoice> tempInvoice = service.findByInvoiceNumber(number);
        return ResponseEntity.of(tempInvoice);

    }
    @GetMapping(value = "/serviceProvider/{id}")
    public ResponseEntity<List<Invoice>> findInvoicesByServiceProviderId(@PathVariable long id) {
        List<Invoice> tempInvoiceList = service.findInvoicesByServiceProviderId(id);
        return ResponseEntity.status(200).body(tempInvoiceList);
    }





}
