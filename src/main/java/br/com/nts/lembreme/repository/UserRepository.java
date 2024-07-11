package br.com.nts.lembreme.repository;

import br.com.nts.lembreme.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
