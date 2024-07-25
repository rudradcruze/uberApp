package com.rudradcruze.project.uber.uberApp.repositories;

import com.rudradcruze.project.uber.uberApp.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}
