package Inheritance;

public class MountainBIke extends Bicycle{
        public int seatHeight;

        public MountainBIke(int startHeight, int startSpeed, int startGear) {
                super(startSpeed, startGear);
                this.seatHeight = startHeight;
        }

        public void setHeight(int newValue){
                seatHeight = newValue;
        }






        }
