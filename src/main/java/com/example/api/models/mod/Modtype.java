package com.example.api.models.mod;

public enum Modtype {
    ONE("1"), TWO("2"), THREE("3"), FOUR("4");

    private String code;

    private Modtype(String code){
        this.code = code;
    }

    public String getCode(){
        return code;
    }
}
