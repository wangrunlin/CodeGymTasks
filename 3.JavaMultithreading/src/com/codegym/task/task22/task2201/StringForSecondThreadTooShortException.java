package com.codegym.task.task22.task2201;

public class StringForSecondThreadTooShortException extends RuntimeException {

    public StringForSecondThreadTooShortException(Exception e) {
        super(e);
    }
}