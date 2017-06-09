package sample;

/**
 * Created by ray on 2017/6/7.
 */
public class WindowImp implements ImageImp {
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("在window里显示图像");
    }
}
