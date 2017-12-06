package newspaperSample;

public class Reader extends Observer{
    public void readNewspaper(Subject subject){
        ((NewsPaper)subject).getContext();
        System.out.println("jjj"+((NewsPaper)subject).getContext());
    }
}
