package ru.screamm.aspect.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.screamm.aspect.model.Rostik;
import ru.screamm.aspect.annotation.AspectLogger;

/**
 * @author Raspopov Anton
 */

@RestController
public class MainController {
    private static Logger logger = LoggerFactory.getLogger(MainController.class);

    @AspectLogger
    @GetMapping("/")
    public Rostik test() {
        logger.debug("Executing method");
        Rostik rost = new Rostik();
        rost.setAge(25);
        rost.setName("Rostislav");
        return rost;
    }

}
