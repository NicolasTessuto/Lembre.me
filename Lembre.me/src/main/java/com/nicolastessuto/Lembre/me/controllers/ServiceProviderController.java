package com.nicolastessuto.Lembre.me.controllers;

import com.nicolastessuto.Lembre.me.entities.ServiceProvider;
import com.nicolastessuto.Lembre.me.repositorys.ServiceProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/servicesProviders")
public class ServiceProviderController {

    @Autowired
    private ServiceProviderRepository repository;

    @GetMapping
    public List<ServiceProvider> findAll(){
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public ServiceProvider findById(@PathVariable Long id){
        return repository.findById(id).get();
    }

    @PostMapping
    public ServiceProvider insert(@RequestBody ServiceProvider serviceProvider){
        return repository.save(serviceProvider);
    }


}
