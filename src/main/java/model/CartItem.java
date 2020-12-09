package model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Builder
@Data
public class CartItem {

    private String id;
    private Product product;
    private Integer quantity;
}
