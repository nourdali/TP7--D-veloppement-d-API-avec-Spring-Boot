package com.example.DeveloppementApi.Service;

import com.example.DeveloppementApi.Model.RentalContract;
import com.example.DeveloppementApi.Repository.RentalContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RentalContractService {
    @Autowired
    private RentalContractRepository rentalContractRepository;


    public RentalContractService(RentalContractRepository rentalContractRepository) {
        this.rentalContractRepository = rentalContractRepository;
    }

    public List<RentalContract> getAllRentalContracts() {
        return rentalContractRepository.findAll();
    }

    public Optional<RentalContract> getRentalContractById(Long id) {
        return rentalContractRepository.findById(id);
    }

    public RentalContract saveRentalContract(RentalContract rentalContract) {
        return rentalContractRepository.save(rentalContract);
    }

    public void deleteRentalContract(Long id) {
        rentalContractRepository.deleteById(id);
    }
}

