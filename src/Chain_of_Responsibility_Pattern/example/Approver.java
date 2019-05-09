package Chain_of_Responsibility_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/04/02
 * 审批者类：抽象处理者
 */
public abstract class Approver {
    protected Approver successor;//定义后继对象
    protected String name;//审批者姓名

    public Approver(String name) {
        this.name = name;
    }


    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
