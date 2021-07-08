package com.codeforgyt.h2setup.model.exception;

import java.text.MessageFormat;

public class ItemNotFoundException extends RuntimeException{
    public ItemNotFoundException(final Long id){
        super(MessageFormat.format("Could not find Item with Id: {0}", id));
    }
}
