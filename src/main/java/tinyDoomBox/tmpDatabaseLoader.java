package tinyDoomBox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import tinyDoomBox.box.Box;
import tinyDoomBox.box.BoxService;

@Component
public class tmpDatabaseLoader implements CommandLineRunner
{
    @Autowired
    private BoxService service;

    @Override
    public void run(String... args) throws Exception
    {
        Box b1 = new Box();
        b1.setId(1L);
        b1.setNumber("123abc");
        service.save(new Box());

        Box b2 = new Box();
        b2.setId(2L);
        b2.setNumber("456def");
        service.save(new Box());

        System.out.println("Stuff in memory:");
        System.out.println(service.findAll());
    }
}
