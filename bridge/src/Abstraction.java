/**
 * Created by ray on 2017/6/7.
 */
public abstract class Abstraction {
    //定义实现接口的对象,
    //可见性为protected，以便在子类中访问Implementor的方法
    //子类一般为扩充抽象类或（RefinedAbstractio）细化抽象类
    protected Implementor iml;

    //通过注入的方式给该对象赋值，
    public void setIml(Implementor iml) {
        this.iml = iml;
    }

    public abstract void operation();//声明抽象的业务方法
}
