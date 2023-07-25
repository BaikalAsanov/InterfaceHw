public class Hotel extends Housing implements RentalFeeAble{
    private int rentalFeePrice;
    public Hotel(String address, int numberOfPeople, int rentalFeePrice) {
        super(address, numberOfPeople);
        this.rentalFeePrice=rentalFeePrice;
    }

    public int getRentalFeePrice() {
        return rentalFeePrice;
    }

    public void setRentalFeePrice(int rentalFeePrice) {
        this.rentalFeePrice = rentalFeePrice;
    }

    @Override
    public void rentalFee() {
        System.out.println("They pay per day for renting a room: "+getRentalFeePrice()+".");
    }
}
