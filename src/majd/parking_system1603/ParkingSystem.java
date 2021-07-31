package majd.parking_system1603;

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
class ParkingSystem {

    private final static int BIG_CAR = 1;
    private final static int MEDIUM_CAR = 2;
    private final static int SMALL_CAR = 3;

    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case BIG_CAR:
                if (this.big > 0) {
                    this.big--;
                    return true;
                }
                return false;
            case MEDIUM_CAR:
                if (this.medium > 0) {
                    this.medium--;
                    return true;
                }
                return false;
            case SMALL_CAR:
                if (this.small > 0) {
                    this.small--;
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}