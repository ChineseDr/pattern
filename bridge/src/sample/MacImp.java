package sample;

/**
 * Created by ray on 2017/6/7.
 */
public class MacImp implements ImageImp{
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("在Mac系统显示图像");
    }
}
