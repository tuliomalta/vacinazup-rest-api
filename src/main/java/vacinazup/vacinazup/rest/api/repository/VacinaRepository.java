package vacinazup.vacinazup.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vacinazup.vacinazup.rest.api.model.Vacina;

@Repository
public interface VacinaRepository extends JpaRepository<Vacina, Long> {
}