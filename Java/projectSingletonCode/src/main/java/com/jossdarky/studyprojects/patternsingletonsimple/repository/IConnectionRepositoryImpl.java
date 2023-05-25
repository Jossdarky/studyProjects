package com.jossdarky.studyprojects.patternsingletonsimple.repository;

import lombok.Getter;

public class IConnectionRepositoryImpl implements IConnectionRepository{

    private static IConnectionRepository connectionDB;

    private IConnectionRepositoryImpl(){
        // Private contructor to prevent instantiation from outside the class 
    }

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

    public String getStatus(){
        return Boolean.toString(IConnectionRepositoryImpl.getInstance().isConnected());
    }

}
