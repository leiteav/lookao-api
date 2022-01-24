package br.com.lookao.lookao_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PetNotFoundException extends Exception{

    public PetNotFoundException (final Long id){
        super(String.format("Pet não localizado com o id ", id));
    }
}
