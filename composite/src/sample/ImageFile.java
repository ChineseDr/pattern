package sample;

/**
 * Created by ray on 2017/6/11.
 */
public class ImageFile implements File {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void add(File file) {
        System.out.println("叶子结点作为非构件容器不能添加子元素");
    }

    @Override
    public void remove(File file) {
        System.out.println("叶子结点没有子元素，无法执行删除操作");
    }

    @Override
    public File getChild(int id) {
        System.out.println("非构件容器不支持该方法");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("……对图片文件"+name+"进行杀毒");
    }

    @Override
    public String toString() {
        return "图片文件";
    }

    public String getName() {
        return name;
    }
}

