package com.codeforgyt.h2setup.model.dto;

import com.codeforgyt.h2setup.model.Item;
import lombok.Data;

import java.util.Objects;

@Data
public class ItemDto {
    private Long id;
    private String serialNumber;
    private PlainCartDto plainCartDto;

    public static ItemDto from (Item item){
        ItemDto itemDto = new ItemDto();
        itemDto.setId(item.getId());
        itemDto.setSerialNumber(item.getSerialNumber());
        if(Objects.nonNull(item.getCart()))
        {
            itemDto.setPlainCartDto(PlainCartDto.from(item.getCart()));
        }
        return itemDto;
    }
}
