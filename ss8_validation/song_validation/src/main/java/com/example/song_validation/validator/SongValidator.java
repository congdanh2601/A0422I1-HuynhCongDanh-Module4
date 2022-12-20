package com.example.song_validation.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class SongValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
