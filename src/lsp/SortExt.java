package lsp;

public class SortExt extends Sort {

    public SortExt(Initialization initialization) {
        super(initialization);
    }

    @Override
    public int[] sorter() {
        System.out.println("Переопределенный метод сортировки");
        int t;

        for(int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                }
            }
        }
        //throw new NumberFormatException(); Нарушение принципа LCP
        return nums;
    }
}