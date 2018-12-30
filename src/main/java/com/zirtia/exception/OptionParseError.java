package com.zirtia.exception;

public class OptionParseError extends Error {
    public OptionParseError(String msg) {
        super(msg);
    }
}
