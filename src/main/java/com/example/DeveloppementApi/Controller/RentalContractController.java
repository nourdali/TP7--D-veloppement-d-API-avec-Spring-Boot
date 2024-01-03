package com.example.DeveloppementApi.Controller;


import com.example.DeveloppementApi.Model.RentalContract;
import com.example.DeveloppementApi.Service.RentalContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rental-contracts")
public class RentalContractController {

    @Autowired
    private RentalContractService rentalContractService;


    public RentalContractController(RentalContractService rentalContractService) {
        this.rentalContractService = rentalContractService;
    }

    @GetMapping
    public List<RentalContract> getAllRentalContracts() {
        return rentalContractService.getAllRentalContracts();
    }

    @GetMapping("/{id}")
    public RentalContract getRentalContractById(@PathVariable Long id) {
        return rentalContractService.getRentalContractById(id)
                .orElseThrow(() -> new RuntimeException("Rental Contract not found with id: " + id));
    }

    @PostMapping
    public RentalContract saveRentalContract(@RequestBody RentalContract rentalContract) {
        return rentalContractService.saveRentalContract(rentalContract);
    }

    @PutMapping("/{id}")
    public RentalContract updateRentalContract(@PathVariable Long id, @RequestBody RentalContract rentalContract) {
        rentalContract.setId(id);
        return rentalContractService.saveRentalContract(rentalContract);
    }

    @DeleteMapping("/{id}")
    public void deleteRentalContract(@PathVariable Long id) {
        rentalContractService.deleteRentalContract(id);
    }
}