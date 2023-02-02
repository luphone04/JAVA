package AbstractInterface.Interface;

public abstract class Ball implements Comparable<Ball>{
    String brandName;
    int weight;

    public Ball(String brandName , int weight){
        this.brandName = brandName;
        this.weight = weight;
    }

    public String getBrandName() {
        return brandName;
}

        public int getWeight () {
            return weight;
        }


        public abstract void bounce ();

        public int compareTo(Ball ball) {
            if (this.weight > ball.weight) {
                return 1;
            } else if (this.weight < ball.weight) {
                return -1;
            } else {
                return 0;
            }
        }


    }