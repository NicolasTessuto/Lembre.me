package com.nicolastessuto.lembreme.services;

import com.nicolastessuto.lembreme.dto.ServiceProviderDTO;
import com.nicolastessuto.lembreme.entities.Invoice;
import com.nicolastessuto.lembreme.entities.ServiceProvider;
import com.nicolastessuto.lembreme.exceptions.ServiceProviderAlreadyExistsException;
import com.nicolastessuto.lembreme.repositories.ServiceProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceProviderService {
    @Autowired
    private ServiceProviderRepository repository;

    public Optional<ServiceProvider> findServiceProviderById(Long id) {
        return repository.findById(id);
    }

    public Optional<ServiceProvider> findServiceProviderByCnpj(String cnpj) {
        return repository.findByCnpj(cnpj);
    }

    public Optional<ServiceProvider> findServiceProviderByName(String name) {
        return repository.findByName(name);
    }


    public List<ServiceProvider> findAllServiceProviders() {
        return repository.findAll();
    }


    public ServiceProvider addServiceProvider(ServiceProviderDTO serviceProviderDTO) {

        if (repository.findByCnpj(serviceProviderDTO.cnpj()).isPresent()) {
            throw new ServiceProviderAlreadyExistsException("Service Provider Already Exists");
        } else {

            LocalDate transitionStipulatePaymentDate = LocalDate.parse(serviceProviderDTO.stipulatedPaymentDate());
            ServiceProvider serviceProvider = new ServiceProvider();
            serviceProvider.setCnpj(serviceProviderDTO.cnpj());
            serviceProvider.setName(serviceProviderDTO.name());
            serviceProvider.setStipulatedPaymentDate(transitionStipulatePaymentDate);

            return repository.save(serviceProvider);
        }
    }


}
