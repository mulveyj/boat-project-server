package com.joemulvey.controllers;

import com.joemulvey.models.SailBoat;
import com.joemulvey.repositories.SailBoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
public class SailBoatRestController {

    private final Logger logger = LoggerFactory.getLogger(SailBoatRestController.class);

    @Autowired
    protected SailBoatRepository sailBoatRepository;

    @CrossOrigin("*")
    @RequestMapping(value="/sailboats", method=RequestMethod.GET)
    public List<SailBoat> getAllSailBoats() {
        return (List<SailBoat>) sailBoatRepository.findAll();
    }
    @CrossOrigin("*")
    @RequestMapping(value="/sailboats/{boat_id}", method=RequestMethod.GET)
    public SailBoat getSailBoat(@PathVariable Long boat_id) {

        logger.debug("Starting getSailBoat");

        SailBoat thisboat = sailBoatRepository.findOne(boat_id);

        if (thisboat == null) {
            logger.warn("No SailBoat with ID {}", boat_id);
        }

        logger.debug("Exiting getSailBoat");

        return thisboat;
    }

}
