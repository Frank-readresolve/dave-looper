package co.simplon.davelooper.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.davelooper.dtos.DeveloperView;
import co.simplon.davelooper.entities.Developer;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {

    Optional<DeveloperView> findByRegistrationNumber(String number);
    // Developer findByRegistrationNumber(String number);
}
