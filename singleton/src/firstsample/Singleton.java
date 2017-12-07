package firstsample;

/**
 * Created by ray on 2017/11/12.
 */
public class Singleton {
    private Singleton mSingleton;
    private Singleton() {
    }

    public Singleton getInstantse(){
        if (mSingleton==null){
            mSingleton=new Singleton();
        }
        return mSingleton;
    }
}
