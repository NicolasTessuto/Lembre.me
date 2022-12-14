package com.nicolastessuto.lembreme.services;

import com.nicolastessuto.lembreme.dto.ServiceProviderDTO;
import com.nicolastessuto.lembreme.entities.ServiceProvider;
import com.nicolastessuto.lembreme.exceptions.ServiceProviderAlreadyExistsException;
import com.nicolastessuto.lembreme.repositories.ServiceProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceProviderService {
    @Autowired
    private ServiceProviderRepository repository;

    public Optional<ServiceProvider> findServiceProviderById(Long id ){
        return repository.findById(id);
    }
    public List<ServiceProvider> findAllServiceProviders(){
        return repository.findAll();
    }


    public ServiceProvider addServiceProvider(ServiceProviderDTO serviceProviderDTO){

        Long transitionCnpj = Long.parseLong(serviceProviderDTO.cnpj());

        if(repository.findByCnpj(transitionCnpj).isPresent()) {
            throw new ServiceProviderAlreadyExistsException("Service Provider Already Exists");
        }else{

        LocalDate transitionStipulatePaymentDate = LocalDate.parse(serviceProviderDTO.stipulatedPaymentDate());
        ServiceProvider serviceProvider = new ServiceProvider();
        serviceProvider.setCnpj(transitionCnpj);
        serviceProvider.setName(serviceProviderDTO.name());
        serviceProvider.setStipulatedPaymentDate(transitionStipulatePaymentDate);

        return repository.save(serviceProvider);
        }
    }



}
