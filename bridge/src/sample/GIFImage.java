package sample;

/**
 * Created by ray on 2017/6/7.
 */
public class GIFImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix matrix=new Matrix();
        imageImp.doPaint(matrix);
        System.out.println(fileName+"格式为GIF");
    }
}
