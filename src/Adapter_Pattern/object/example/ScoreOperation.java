package Adapter_Pattern.object.example;

/**
 * @author hongfei.shen
 * @date 2019/03/21
 * ScoreOperation接口充当抽象目标接口
 */
public interface ScoreOperation {

    public int[] sort(int array[]); //成绩排序

    public int search(int array[], int key); //成绩查找
}
