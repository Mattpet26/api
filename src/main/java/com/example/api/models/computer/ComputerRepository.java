package com.example.api.models.computer;

import com.example.api.models.mod.Modtype;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ComputerRepository extends MongoRepository<Computer, String> {
    Computer findByMod(Modtype modtype);
    List<Computer> findAllByPriceDescend();
}
