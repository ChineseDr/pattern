package sample;

/**
 * Created by ray on 2017/6/7.
 */
public abstract class Image {
    protected ImageImp imageImp;

    public void setImageImp(ImageImp imageImp) {
        this.imageImp = imageImp;
    }

    public abstract void parseFile(String fileName);//把图片解析成矩阵
}
