package com.jossdarky.studyprojects.patternsingletonsimple.service;

import java.util.Scanner;

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
		LOG.info( "\n\nWELCOME, Select an option:\n\n1.Connect\n2.Dissconect\n3.Check status\n0.Exit" );
		try (Scanner scanner = new Scanner(System.in)) {
			String line = "";
			while( ! line.equals("0")){
				line = scanner.nextLine();
				switch (line)
				{
					case "0":
						LOG.info( "Bye bye!" );
						break;
					case "1":
						connect();
						break;
					case "2":
						disconnect();
						break;
					case "3":
						checkConnection();
						break;
					default:
						LOG.error("Command not valid");
				}
				
			}
		}
    }

	@Override
	public void connect() {
		if( ! IConnectionRepositoryImpl.getInstance().isConnected()){
			LOG.info( "Connection enabled" );
			IConnectionRepositoryImpl.getInstance().connect();
		}else{
			LOG.warn("is currently enabled!");
		}
	}

	@Override
	public void disconnect() {
		if(IConnectionRepositoryImpl.getInstance().isConnected()){
			LOG.info( "Connection disabled" );
			IConnectionRepositoryImpl.getInstance().disconnect();
		}else{
			LOG.warn("is currently dissabled!");
		}
	}

	@Override
	public void checkConnection() {
		LOG.info( Strings.concat( "is connected?: " , IConnectionRepositoryImpl.getInstance().getStatus())  );
	}

	


    
}
