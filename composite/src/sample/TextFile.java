package sample;

/**
 * Created by ray on 2017/6/11.
 */
public class TextFile implements File {
    private  String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void add(File file) {
        System.out.println(name+"不能添加子文件");
    }

    @Override
    public void remove(File file) {
        System.out.println(name+"不能进行删除子文件操作");
    }

    @Override
    public File getChild(int id) {
        System.out.println("没有子文件");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("正在对"+toString()+":"+name+"进行杀毒");
    }

    @Override
    public String toString() {
        return "文本文件";
    }

    public String getName() {
        return name;
    }
}
