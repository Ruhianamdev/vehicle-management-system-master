package com.puja.vms.service;

import java.util.List;

import com.puja.vms.entity.Customer;
import com.puja.vms.entity.Services;

public interface ServicesService {
	List<Services> getAllServices();
	void saveServices(Services services);
	Services getServicesById(Long id);
	void deleteServicesById(Long id);
}
