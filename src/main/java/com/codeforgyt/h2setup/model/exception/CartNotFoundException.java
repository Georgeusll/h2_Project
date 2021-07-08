package com.codeforgyt.h2setup.model.exception;

import java.text.MessageFormat;

public class CartNotFoundException extends RuntimeException{
    public CartNotFoundException(final Long id){
        super(MessageFormat.format("Could not find Cart with Id: {0}", id));
    }
}
