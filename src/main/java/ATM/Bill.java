package ATM;

public interface Bill {
    void setNext(Bill bil);
    void process(int amount);
}
