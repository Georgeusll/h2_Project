package com.codeforgyt.h2setup.Controller;

import com.codeforgyt.h2setup.model.Item;
import com.codeforgyt.h2setup.model.dto.ItemDto;
import com.codeforgyt.h2setup.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/items")
public class ItemController {
    private final ItemService itemservice;

    @Autowired
    public ItemController(ItemService itemservice) {
        this.itemservice = itemservice;
    }

    @PostMapping
    public ResponseEntity<ItemDto> addItem(@RequestBody final ItemDto itemDto){

        Item item = itemservice.addItem(Item.from(itemDto));
        return new ResponseEntity<>(ItemDto.from(item), HttpStatus.OK);

    }
    @GetMapping
    public ResponseEntity<List<ItemDto>> getItems(){
    List<Item>items = itemservice.getItems();
    List<ItemDto> itemsDto = items.stream().map(ItemDto::from).collect(Collectors.toList());
    return new ResponseEntity<>(itemsDto,HttpStatus.OK);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<ItemDto> getItem(@PathVariable final Long id){
        Item item = itemservice.getItem(id);
        return new ResponseEntity<>(ItemDto.from(item),HttpStatus.OK);
    }
    @DeleteMapping(value = "{id}")
    public ResponseEntity<ItemDto> deleteItem(@PathVariable final Long id){
        Item item = itemservice.deleteItem(id);
        return new ResponseEntity<>(ItemDto.from(item),HttpStatus.OK);
    }
    @PutMapping(value = "{id}")
    public ResponseEntity<ItemDto> editItem(@PathVariable final Long id,
                                            @RequestBody final ItemDto itemDto){
        Item editedItem = itemservice.editItem(id, Item.from(itemDto));
        return new ResponseEntity<>(ItemDto.from(editedItem),HttpStatus.OK);

    }
}
