package model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@Builder
@EqualsAndHashCode
public class CartItem {

    private String id;
    private Product product;
    private Integer quantity;

    public CartItem(String id, Integer quantity){
        this.id = id;
        this.quantity = quantity;
    }
}
