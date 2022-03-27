package com.puja.vms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.puja.vms.entity.Services;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Long>{

}
