package com.jossdarky.studyprojects.patternsingletonsimple.service;

import org.apache.logging.log4j.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.jossdarky.studyprojects.patternsingletonsimple.repository.IConnectionRepositoryImpl;

@Service
public class IBusinessServiceImpl implements IBusinessService{

    private static Logger LOG = LoggerFactory.getLogger(IBusinessServiceImpl.class);

    @Override
    public void proccess() {
        LOG.info("Step 1. check");
		LOG.info(Strings.concat("Connection: ", Boolean.toString(IConnectionRepositoryImpl.getInstance().isConnected())));
		LOG.info("Step 2. connect");
		IConnectionRepositoryImpl.getInstance().connect();
		LOG.info(Strings.concat("Connection: ", Boolean.toString(IConnectionRepositoryImpl.getInstance().isConnected())));
		LOG.info("Step 3. disconnect");
		IConnectionRepositoryImpl.getInstance().disconnect();
		LOG.info(Strings.concat("Connection: ", Boolean.toString(IConnectionRepositoryImpl.getInstance().isConnected())));
    }
    
}
