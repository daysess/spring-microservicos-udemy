package com.daysesoares.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daysesoares.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
