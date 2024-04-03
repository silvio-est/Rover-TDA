package org.liz.test.controllers;

import org.liz.test.models.CommandEnum;
import org.liz.test.services.RoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/rover")

public class RoverController {

    @Autowired
    private RoverService roverService;

    @GetMapping("/send/{commands}/{z}")
    void sendCommand(@PathVariable String commands, @PathVariable("z") Integer z){
        if (commands == null || z == null ) throw new IllegalArgumentException("The command have not null");

        if (z < 1 || z > 4) throw new IllegalArgumentException("Error in the argument z");

        for (int i = 0; i < commands.length(); i++) {
            Character command = commands.charAt(i);
            if (!CommandEnum.isCode(command)) throw new IllegalArgumentException("The command is incorrect");
        }

        roverService.executeCommand(commands, z);

    }
}
