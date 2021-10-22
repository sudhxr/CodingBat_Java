package Array2;

public class HaveThree {
    public static void main(String[] args) {
        HaveThree test = new HaveThree();
        int[] x= {3, 1, 3, 3};
        System.out.println(test.haveThree(x));
    }

    public boolean haveThree(int[] nums) {
        int count = 0;
        if(nums.length <= 1) { return false; }

        for (int i=0; i<nums.length; i++) {

            if (i==0 && (nums[i]==3 && nums[i+1]!=3)) {
                count +=1;
            }
            if ((i>0 && nums[i-1]!=3) && nums[i] == 3 && (i<nums.length-1 && nums[i+1] != 3) ){
                count += 1;
            }
            if (i==nums.length-1 && (nums[i-1]!=3 && nums[i] == 3) ) {
                count += 1;
            }
        }
        return (count==3);
    }

}
