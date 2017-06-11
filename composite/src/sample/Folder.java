package sample;

import java.util.ArrayList;

/**
 * Created by ray on 2017/6/11.
 */
public class Folder implements File {
    private ArrayList<File> files=new ArrayList<File>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(File file) {
        files.add(file);
        System.out.println("添加"+file.toString()+":"+file.getName());
    }

    @Override
    public void remove(File file) {
        files.remove(file);
    }

    @Override
    public File getChild(int id) {
        return (File)files.get(id);
    }

    @Override
    public void killVirus() {
        System.out.println("对文件夹进行杀毒");
        for (File file:files
             ) {
            file.killVirus();
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
