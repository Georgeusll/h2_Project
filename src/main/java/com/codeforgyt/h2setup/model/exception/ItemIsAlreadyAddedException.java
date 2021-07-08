package com.codeforgyt.h2setup.model.exception;

import java.text.MessageFormat;

public class ItemIsAlreadyAddedException extends RuntimeException{
    public ItemIsAlreadyAddedException(final Long  itemId, final  Long cartId){
    super(MessageFormat.format("Item:{0} is already in cart: {1}", itemId, cartId));
    }
}
