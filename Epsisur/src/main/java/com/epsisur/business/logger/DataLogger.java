package com.epsisur.business.logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class DataLogger
{
	private Log logger;
	
    public DataLogger() 
    {
    	logger = LogFactory.getLog(this.getClass());
    }
    
    public void infoLog(String info)
    {
    	logger.info(info);
    }
    
    public void debugLog(String debug)
    {
    	logger.debug(debug);
    }
    
    public void errorLog(String error)
    {
    	logger.error(error);
    }
}
