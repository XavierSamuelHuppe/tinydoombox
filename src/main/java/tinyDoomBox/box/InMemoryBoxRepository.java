package tinyDoomBox.box;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class InMemoryBoxRepository implements BoxRepository
{
    List<Box> boxes;

    public InMemoryBoxRepository()
    {
        boxes = new ArrayList<Box>();
    }

    @Override
    public void save(Box box)
    {
        boxes.add(box);
    }

    @Override
    public List<Box> findAll()
    {
        return boxes;
    }
}
