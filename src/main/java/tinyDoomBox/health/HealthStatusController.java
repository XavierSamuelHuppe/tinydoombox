package tinyDoomBox.health;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HealthStatusController {

    @RequestMapping("/healthstatus")
    public String index() {
        return "Tiny Doom Box is alive!";
    }

}