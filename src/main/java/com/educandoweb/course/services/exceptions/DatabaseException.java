package com.educandoweb.course.services.exceptions;

public class DatabaseException extends RuntimeException{

    private static final Long serialVersioUID = 1l;

    public DatabaseException(String msg){
        super(msg);
    }

}
