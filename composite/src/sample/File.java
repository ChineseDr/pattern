package sample;

/**
 * Created by ray on 2017/6/11.
 */
public interface File {
    void add(File file);
    void remove(File file);
    File getChild(int id);
    void killVirus();
    String getName();
}
