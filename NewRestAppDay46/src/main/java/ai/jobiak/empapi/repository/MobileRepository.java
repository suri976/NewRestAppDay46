package ai.jobiak.empapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ai.jobiak.empapi.model.Mobile;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Long>{
}

