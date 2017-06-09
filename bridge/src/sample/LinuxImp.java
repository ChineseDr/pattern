package sample;

/**
 * Created by ray on 2017/6/7.
 */
public class LinuxImp implements ImageImp {
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("在Linux里显示图像");
    }
}
