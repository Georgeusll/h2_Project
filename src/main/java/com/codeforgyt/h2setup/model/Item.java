package com.codeforgyt.h2setup.model;

import com.codeforgyt.h2setup.model.dto.ItemDto;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String serialNumber;
@ManyToOne
private Cart cart;

    public Item() {
    }
    public static Item from(ItemDto itemDto){
    Item item = new Item();
    item.setSerialNumber(itemDto.getSerialNumber());
    return item;

    }

}
