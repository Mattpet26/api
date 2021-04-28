package com.example.api.models.mod;

import com.example.api.models.computer.Computer;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Mod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;

    public int price;

    @Enumerated(EnumType.ORDINAL)
    public Modtype modtype;

    @ManyToMany(cascade = CascadeType.REMOVE)
    @JoinTable(
            name = "ModsToComputers",
            joinColumns = {@JoinColumn(name = "modId")},
            inverseJoinColumns = {@JoinColumn(name = "computerId")}
    )
    public Set<Computer> listofComputers = new HashSet<>();

    public Mod() {
    }

    public Mod(String name, int price, Modtype modtype, Set<Computer> listofComputers) {
        this.name = name;
        this.price = price;
        this.modtype = modtype;
        this.listofComputers = listofComputers;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Modtype getModtype() {
        return modtype;
    }

    public void setModtype(Modtype modtype) {
        this.modtype = modtype;
    }

    public Set<Computer> getListofComputers() {
        return listofComputers;
    }

    public void setListofComputers(Set<Computer> listofComputers) {
        this.listofComputers = listofComputers;
    }
}
