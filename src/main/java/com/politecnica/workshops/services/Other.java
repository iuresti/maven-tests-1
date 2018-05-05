package com.politecnica.workshops.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Other {

    private static final Logger logger = LoggerFactory.getLogger(Other.class);

    public void theMethod(String theParam){
        logger.debug("Log at debug level: {}", theParam);

        logger.info("Log at info level: {}", theParam);


    }
}
