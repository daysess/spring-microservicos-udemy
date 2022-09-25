package com.daysesoares.hrworker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daysesoares.hrworker.entities.Worker;
import com.daysesoares.hrworker.repository.WorkerRepository;
import com.daysesoares.hrworker.resource.WorkerResource;

@Service
public class DBService {
	
	@Autowired
	private WorkerRepository workerRepository;
	
	public void inicializandoBDTest() {
		Worker worker = new Worker();
		worker.setName("Bob");
		worker.setDailyIncome(200.0);
		workerRepository.save(worker);
		
		worker = new Worker();
		worker.setName("Maria");
		worker.setDailyIncome(250.0);
		workerRepository.save(worker);
		
	}

}
