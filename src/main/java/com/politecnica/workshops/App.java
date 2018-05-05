package com.politecnica.workshops;

import com.politecnica.workshops.services.Other;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        Other other = new Other();

        logger.info("Iniciando aplicación");

        System.out.println("Prueba desde App");

        other.theMethod("A parameter");

        logger.debug("Terminando aplicación");

    }

}
