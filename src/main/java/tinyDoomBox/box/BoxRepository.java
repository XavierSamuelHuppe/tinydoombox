package tinyDoomBox.box;

import java.util.List;

public interface BoxRepository
{
    public void save(Box box);

    public List<Box> findAll();
}
