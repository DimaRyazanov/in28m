package com.ryazanov.rest.webservices.restfulwebservices.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value = {"field1", "field2"})
public class SomeBean {
    private String field1;
    private String field2;
    private String field3;
}
