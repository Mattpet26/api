package com.example.api.service;

import com.example.api.models.computer.Computer;
import com.example.api.models.mod.Modtype;

import java.util.List;

public interface ComputerService {
    Computer findByMod(Modtype modtype);
    List<Computer> findAllByPriceDescend();
    void deleteComputerById(String id);
}
