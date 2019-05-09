package Chain_of_Responsibility_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/04/02
 */
public class Client {
    public static void main(String[] args) {
        Approver director = new Director("张无忌");
        Approver vicePresident = new VicePresident("杨过");
        Approver president = new President("郭靖");
        Approver congress = new Congress("董事会");
        //创建职责链
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
        president.setSuccessor(congress);

        //创建采购单
        PurchaseRequest pr1 = new PurchaseRequest(85000,10001,"购买倚天剑");
        director.processRequest(pr1);
    }
}
