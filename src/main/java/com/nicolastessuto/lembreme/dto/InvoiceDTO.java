package com.nicolastessuto.lembreme.dto;

import com.nicolastessuto.lembreme.entities.ServiceProvider;
import com.nicolastessuto.lembreme.enums.PaymentMethod;

import java.time.LocalDate;

public record InvoiceDTO(

        String cnpj,

        String invoiceNumber,
        LocalDate issueDate,
        LocalDate dueDate,
        Enum<PaymentMethod> paymentMethod

) {
}
