package com.jossdarky.studyprojects.patternsingletonsimple.repository;

import lombok.Getter;

public class IConnectionRepositoryImpl implements IConnectionRepository{

    static IConnectionRepository connectionDB;

    @Getter
    boolean connected = false;

    public static IConnectionRepository getInstance() {
        if(connectionDB == null){
            connectionDB = new IConnectionRepositoryImpl();
        }
        return connectionDB;
    }
    
    @Override
    public void connect() {
        connected = true;
    }

    @Override
    public void disconnect() {
        connected = false;
    }

}
