package com.nicolastessuto.lembreme.services;

import com.nicolastessuto.lembreme.entities.Invoice;
import com.nicolastessuto.lembreme.repositories.InvoiceRepository;
import com.nicolastessuto.lembreme.repositories.ServiceProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private ServiceProviderRepository serviceProviderRepository;

    public Optional<Invoice> findByInvoiceNumber(int invoiceNumber){
        return invoiceRepository.findByInvoiceNumber(invoiceNumber);
    }

    public List<Invoice> findInvoicesByServiceProviderId(long id){
        return serviceProviderRepository.findById(id)
                .map(serviceProvider -> serviceProvider.getInvoicesList())
                    .orElseGet(() -> List.of());
    }



}
