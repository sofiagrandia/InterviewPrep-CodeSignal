package codeSignalInterviewPractice;

/*You are climbing a staircase that has n steps. You can take the steps either 1 or 2 at a time. Calculate how many distinct ways you can climb to the top of the staircase.

Example

For n = 1, the output should be climbingStairs(n) = 1;

For n = 2, the output should be climbingStairs(n) = 2.

You can either climb 2 steps at once or climb 1 step two times.*/
//TIME: 10-25 minss
public class ClimbingStairs {
    //Assuming the order doesn't matter
    public static int climbingStairsNoOrder(int numberOfStairs){
        int divTwo = numberOfStairs/2;

        if(numberOfStairs == 1){
            return 1;
        }else{
            return divTwo + 1;
        }
    }

    public static int climbingStairsOrder(int numberOfStairs){
        int fib=0;
        int fibNext=1;


        for(int i = 0; i <numberOfStairs; i ++){

            int temp = fibNext;
            fibNext = fib + fibNext;
            fib = temp;
        }
        return fibNext;
    }

}
