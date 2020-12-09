package model;

import lombok.*;

@Data
@Builder
@EqualsAndHashCode
@AllArgsConstructor
public class Product {

    private String id;
    private String name;
    private Double price;

}
