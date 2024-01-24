package patterns.adapter;

public class CartReader implements ConnectUsb{
    private MyCard myCard;

    public CartReader(MyCard myCard) {
        this.myCard = myCard;
    }
    @Override
    public void connectUsb() {
        myCard.insert();
        myCard.copyData();
    }
}
