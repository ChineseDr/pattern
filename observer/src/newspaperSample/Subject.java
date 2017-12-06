package newspaperSample;

public interface Subject {
    void attachObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObserver();
}
