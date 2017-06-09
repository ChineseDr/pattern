package sample;

/**
 * Created by ray on 2017/6/7.
 */
public class Test {
    public static void main(String[] args){
        Image image;
        image=new BMPImage();
        ImageImp imageImp;
        imageImp=new MacImp();
        image.setImageImp(imageImp);
        image.parseFile("xiao");
    }
}
