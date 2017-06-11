package instruction;

import java.util.ArrayList;

/**
 * Created by ray on 2017/6/11.
 */
public class Composite implements Component {
    private ArrayList<Component> list=new ArrayList<Component>();
    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int id) {
        return (Component)list.get(id);
    }

    @Override
    public void operation() {
        //容器构件的业务具体实现
        //递归调用成员构件业务方法
        for (Object obj :list) {
            ((Component)obj).operation();
        }
    }
}
