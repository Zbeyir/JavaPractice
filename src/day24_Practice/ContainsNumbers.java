package day24_Practice;

public class ContainsNumbers {

    public static void main(String[] args) {

        int[]	arr = {1,2,3,4,5,6,7};
        int num = 10;

        containsNumbers(arr,num);



    }
    public static void containsNumbers(int[] arr , int num){



        for (int each : arr) {

            if (num == each){
                System.out.println(true);
                return;
            }else {
                System.out.println(false);
                return;
            }
        }


    }




}
/*
9. Create a method named contains that passes one integer array and one integer parameters,
 the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
 */