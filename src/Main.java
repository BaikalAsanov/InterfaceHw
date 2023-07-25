// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Apartment apartment=new Apartment("Moscow",3,8000);
        Hotel hotel=new Hotel("Bishkek",340,3500);
        Dormitory dormitory=new Dormitory("Ekaterinburg",48,4000);
        System.out.println(apartment.toString());
        apartment.UtilityBill();
        System.out.println(hotel.toString());
        hotel.rentalFee();
        System.out.println(dormitory.toString());
        dormitory.rentalFee();
    }
}