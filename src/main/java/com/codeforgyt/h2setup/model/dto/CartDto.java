package com.codeforgyt.h2setup.model.dto;

import com.codeforgyt.h2setup.model.Cart;
import com.codeforgyt.h2setup.model.Item;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//dto - data transfer object
@Data
public class CartDto {

    private Long id;
    private String name;
    private List<ItemDto> itemsDto = new ArrayList<>();

    public static CartDto from(Cart cart){
        CartDto cartDto = new CartDto();
        cartDto.setId(cart.getId());
        cartDto.setName(cart.getName());
        cartDto.setItemsDto(cart.getItems().stream().map(ItemDto::from).collect(Collectors.toList()));

        return cartDto;
    }
}
