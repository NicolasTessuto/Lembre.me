package br.com.nts.lembreme.repository;

import br.com.nts.lembreme.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
