package com.example.api.models.computer;

import com.example.api.models.CPU;
import com.example.api.models.GPU;
import com.example.api.models.mod.Mod;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;

    public CPU cpu;

    public int price;

    @OneToMany(mappedBy = "computer")
    public List<GPU> gpuList;

    @ManyToMany
    public Set<Mod> listofMods = new HashSet<>();

    public Computer() {
    }

    public Computer(String name, CPU cpu, int price, List<GPU> gpuList, Set<Mod> listofMods) {
        this.name = name;
        this.cpu = cpu;
        this.price = price;
        this.gpuList = gpuList;
        this.listofMods = listofMods;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<GPU> getGpuList() {
        return gpuList;
    }

    public void setGpuList(List<GPU> gpuList) {
        this.gpuList = gpuList;
    }

    public Set<Mod> getListofMods() {
        return listofMods;
    }

    public void setListofMods(Set<Mod> listofMods) {
        this.listofMods = listofMods;
    }
}
