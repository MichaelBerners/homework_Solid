package lsp;

public class SortMain {
    public static void main(String[] args) {
        //SortService sortService = new SortService(new Sort(new Initialization()));
        //sortService.getSort();

        SortService sortService1 = new SortService(new SortExt(new Initialization()));
        sortService1.getSort();
    }

}
