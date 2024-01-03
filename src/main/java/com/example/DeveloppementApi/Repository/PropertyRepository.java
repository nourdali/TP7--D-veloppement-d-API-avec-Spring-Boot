package com.example.DeveloppementApi.Repository;

import com.example.DeveloppementApi.Model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}
