package test_package;

import oocpyoutube.accessmodifier;

public class Main {

    static int checkEven(int num){
        if(num % 2 == 0){
            return num;
        }
        return 0;
    }

    //If we have a lot of condition to check , we can apply inversion over and over again.
    static int caculate(int bottom, int top){
        if(top < bottom){
            return 0; //since we can return here, we don't need to use else so bye bye the else
        }

            int sum = 0;
            for(int num = bottom ; num <= top ; num++){
                sum += checkEven(num);
            }
            return sum;


    }


    public static void main(String[] args) {
        System.out.println(caculate(1, 10));


    }

}
