public abstract class Housing {
    private String address;
    private int numberOfPeople;

    public Housing(String address, int numberOfPeople) {
        this.address = address;
        this.numberOfPeople = numberOfPeople;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public String toString() {
        return "Housing{" +
                "Address= " + address + '\'' +
                ", number of people= " + numberOfPeople +
                '}';
    }
}
