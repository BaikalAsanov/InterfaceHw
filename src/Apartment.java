public class Apartment extends Housing implements UtilityBillAble{
    private int utilityBillPrice;
    public Apartment(String address, int numberOfPeople, int utilityBillPrice) {
        super(address, numberOfPeople);
        this.utilityBillPrice=utilityBillPrice;
    }

    public int getUtilityBillPrice() {
        return utilityBillPrice;
    }

    public void setUtilityBillPrice(int utilityBillPrice) {
        this.utilityBillPrice = utilityBillPrice;
    }

    @Override
    public void UtilityBill() {
        System.out.println("They pay utility bills  "+getUtilityBillPrice());
    }
}
