package tinyDoomBox.box;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersistenceBoxService implements BoxService
{
    BoxRepository repository;

    @Autowired
    public PersistenceBoxService(BoxRepository repository)
    {
        this.repository = repository;
    }

    @Override
    public void save(Box box)
    {
        repository.save(box);
    }

    @Override
    public List<Box> findAll()
    {
        return repository.findAll();
    }
}
