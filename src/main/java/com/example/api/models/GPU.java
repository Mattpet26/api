package com.example.api.models;

import com.example.api.models.computer.Computer;

import javax.persistence.*;

@Entity
public class GPU {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public String name;

    @ManyToOne
    public Computer computers;
}
