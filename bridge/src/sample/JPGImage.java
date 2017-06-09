package sample;

/**
 * Created by ray on 2017/6/7.
 */
public class JPGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix matrix=new Matrix();//模拟把图片解析成矩阵的过程
        imageImp.doPaint(matrix);
        System.out.println(fileName+"格式为JPG");
    }
}
