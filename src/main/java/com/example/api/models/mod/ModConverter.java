package com.example.api.models.mod;

import com.example.api.models.mod.Modtype;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class ModConverter implements AttributeConverter<Modtype, String> {

    @Override
    public String convertToDatabaseColumn(Modtype attribute) {
        if(attribute == null){
            return null;
        }
        return attribute.getCode();
    }

    @Override
    public Modtype convertToEntityAttribute(String code) {
        if(code == null){
            return null;
        }
        return Stream.of(Modtype.values())
                .filter(c -> c.getCode().equals(code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
