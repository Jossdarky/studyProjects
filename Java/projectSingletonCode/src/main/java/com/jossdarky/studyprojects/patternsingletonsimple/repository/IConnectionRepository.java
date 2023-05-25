package com.jossdarky.studyprojects.patternsingletonsimple.repository;

public interface IConnectionRepository {

    public void connect();

    public void disconnect();

    public boolean isConnected();

    public String getStatus();
}
