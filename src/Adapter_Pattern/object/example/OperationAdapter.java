package Adapter_Pattern.object.example;

/**
 * @author hongfei.shen
 * @date 2019/03/21
 * 操作适配器：适配器
 */
public class OperationAdapter implements ScoreOperation {

    private QuickSort quickSort;//定义适配者QuickSort对象
    private BinarySearch binarySearch;//定义适配者BinarySearch对象

    public OperationAdapter() {
        this.quickSort = new QuickSort();
        this.binarySearch = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return quickSort.quickSort(array);//调用适配者类QuickSort的排序方法
    }

    @Override
    public int search(int[] array, int key) {
        return binarySearch.binarySearch(array, key);//调用适配者类BinarySearch的查找方法
    }
}
