package instruction;

/**
 * Created by ray on 2017/6/11.
 */
public interface Component {
    void add(Component c);//增加成员
    void remove(Component c);//删除成员
    Component getChild(int id);//获取成员
    void operation();//处理业务
}
