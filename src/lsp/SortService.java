package lsp;

public class SortService {

    private Sort sort;

    public SortService(Sort sort) {
        this.sort = sort;
    }

    public void getSort() {
        sort.getNums(sort.sorter());
    }
}
