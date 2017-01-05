package tinyDoomBox.box;

import java.util.List;

public interface BoxService
{
    public void save(Box box);

    public List<Box> findAll();
}
