package patterns.adapter;

public class Main {
    public static void main(String[] args) {
        MyCard myCard = new MyCard();
        PK pk = new PK();
        CartReader cartReader = new CartReader(myCard);
        pk.connectOfUsb(cartReader);
    }
}
