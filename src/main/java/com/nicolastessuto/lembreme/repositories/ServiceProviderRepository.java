package com.nicolastessuto.lembreme.repositories;

import com.nicolastessuto.lembreme.entities.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ServiceProviderRepository extends JpaRepository<ServiceProvider, Long> {

    Optional<ServiceProvider> findByCnpj(long cnpj);

}
