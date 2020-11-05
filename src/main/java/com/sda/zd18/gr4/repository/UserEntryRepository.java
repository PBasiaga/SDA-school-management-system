package com.sda.zd18.gr4.repository;

import com.sda.zd18.gr4.model.UserEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntryRepository extends JpaRepository<UserEntry, Long> {
}
