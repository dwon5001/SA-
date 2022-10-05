public class Main {
    public static void main(String[] args) {
        Bus school = new Bus(10);
        Bus tayo = new Bus(20);

        tayo.boardPassenger(2);
        tayo.changeFuel(-50);
        tayo.changeStatus();
        tayo.changeFuel(10);
        tayo.changeStatus();
        tayo.boardPassenger(45);
        tayo.boardPassenger(5);
        tayo.changeFuel(-55);

        Taxi call = new Taxi(30);
        Taxi kakao = new Taxi(40);

        kakao.boardPassenger(2, "서울역", 2);
        kakao.changeFuel(-80);
        kakao.payTheBill();
        kakao.boardPassenger(5, "가양역", 5);
        kakao.boardPassenger(3, "구로디지털단지역", 12);
        kakao.changeFuel(-20);
        kakao.payTheBill();
    }
}