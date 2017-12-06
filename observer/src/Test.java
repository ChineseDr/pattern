import newspaperSample.NewsPaper;
import newspaperSample.Observer;
import newspaperSample.Reader;
import newspaperSample.Subject;

public class Test {
    public static void main(String[] args){
        NewsPaper newsPaper=new NewsPaper("晚报");
        Observer o=new Reader();
        newsPaper.attachObserver(o);
        newsPaper.setContext("xinwen");
    }
}
