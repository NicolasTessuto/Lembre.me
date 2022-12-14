package com.nicolastessuto.lembreme.controllers;

import com.nicolastessuto.lembreme.dto.ServiceProviderDTO;
import com.nicolastessuto.lembreme.entities.ServiceProvider;
import com.nicolastessuto.lembreme.exceptions.ServiceProviderAlreadyExistsException;
import com.nicolastessuto.lembreme.repositories.ServiceProviderRepository;
import com.nicolastessuto.lembreme.services.ServiceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping(value = "/servicesproviders")
public class ServiceProviderController { //Controller fornecedores cadastrados

    @Autowired
    private ServiceProviderService service;
    @Autowired
    private ServiceProviderRepository serviceProviderRepository;

    @GetMapping
    public ResponseEntity<List<ServiceProvider>> findAll(){
        List<ServiceProvider> tempListServiceProviders = service.findAllServiceProviders();
        return ResponseEntity.status(200).body(tempListServiceProviders);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ServiceProvider> findById(@PathVariable Long id){
        Optional<ServiceProvider> tempServiceProvider = service.findServiceProviderById(id);
        return ResponseEntity.of(tempServiceProvider);
    }

    @PostMapping
    public ResponseEntity<ServiceProvider> addServiceProvider(@RequestBody ServiceProviderDTO serviceProviderDTO){
            ServiceProvider tempServiceProvider = service.addServiceProvider(serviceProviderDTO);
            return ResponseEntity.status(200).body(tempServiceProvider);
    }

    @ExceptionHandler
    public ResponseEntity<Object> handleServiceProviderAreadyExists(ServiceProviderAlreadyExistsException e){
        return ResponseEntity.status(422).body(e.getMessage());
    }


}
