package com.nicolastessuto.lembreme.repositories;

import com.nicolastessuto.lembreme.entities.Invoice;
import com.nicolastessuto.lembreme.entities.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    Optional<Invoice> findByInvoiceNumber(int invoiceNumber);

}
