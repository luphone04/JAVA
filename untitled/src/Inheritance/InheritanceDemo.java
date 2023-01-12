package Inheritance;

class InheritanceDemo {
    public static void main(String[] args){
        MountainBIke mountainBike = new MountainBIke(20, 10,1);
        System.out.println(mountainBike.seatHeight);
        System.out.println(mountainBike.gear);
        System.out.println(mountainBike.speed);

        mountainBike.speedUp(1);
        mountainBike.setHeight(10);
        mountainBike.setGear(2);
        System.out.println(mountainBike.seatHeight);
        System.out.println(mountainBike.gear);
        System.out.println(mountainBike.speed);

    }
}
