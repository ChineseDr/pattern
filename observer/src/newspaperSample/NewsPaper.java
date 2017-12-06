package newspaperSample;

import java.util.ArrayList;
import java.util.List;

public class NewsPaper implements Subject{
    private List<Observer> list=new ArrayList<Observer>();
    private String name;
    private String context;

    public NewsPaper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
        notifyObserver();
    }

    @Override
    public void attachObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer reader: list) {
            ((Reader)reader).readNewspaper(this);
        }
    }
}
