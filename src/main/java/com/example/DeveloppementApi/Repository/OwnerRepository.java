package com.example.DeveloppementApi.Repository;

import com.example.DeveloppementApi.Model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
