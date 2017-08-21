package com.joemulvey.controllers;

import com.joemulvey.models.SailBoat;
import com.joemulvey.repositories.SailBoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SailBoatRestController {

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
        return sailBoatRepository.findOne(boat_id);
    }

}
