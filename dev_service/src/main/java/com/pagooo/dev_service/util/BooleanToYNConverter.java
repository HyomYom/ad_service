package com.pagooo.dev_service.util;


import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Convert;

@Convert
public class BooleanToYNConverter implements AttributeConverter<Boolean, String> {


    @Override
    public String convertToDatabaseColumn(Boolean attribute) {
        return (attribute != null && attribute) ? "Y":"N";
    }

    @Override
    public Boolean convertToEntityAttribute(String dbData) {
        return "Y".equalsIgnoreCase(dbData);
    }
}
