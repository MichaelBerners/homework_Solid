package lsp;

public class Sort {

    Initialization initialization;
    int[] nums;

    public Sort(Initialization initialization) {
        this.initialization = initialization;
        nums = initialization.setInit();
    }


    public int[] sorter() {
        System.out.println("метод сортировки");
        boolean tf = true;
        int t;

        while (tf) {
            tf = false;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    t = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = t;
                    tf = true;
                }
            }
        }

        System.out.println("Поздравляем, массив отсортирован");
        return nums;

    }

    public void getNums(int[] nums) {
        for(int x : nums)
            System.out.print(x + "\t");
    }

}
