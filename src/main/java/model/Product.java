package model;

import lombok.*;

@Data
@ToString
@Builder
@EqualsAndHashCode
public class Product {

    private String id;
    private String name;
    private Double price;

}
