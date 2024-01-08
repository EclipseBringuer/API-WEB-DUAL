package com.gabimiguesamu.appWebDual.repository;

import com.gabimiguesamu.appWebDual.model.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {
}
