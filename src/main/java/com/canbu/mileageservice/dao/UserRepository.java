package com.canbu.mileageservice.dao;


import com.canbu.mileageservice.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<Users, UUID> {
}
