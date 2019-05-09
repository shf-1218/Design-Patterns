package Chain_of_Responsibility_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/04/02
 * 主任类：具体处理者
 */
public class Director extends Approver {

    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() < 5000) {
            System.out.println("主任" + this.name + "审批采购单：" + purchaseRequest.getNumber() + "，金额：" + purchaseRequest.getAmount() +
                    "元，采购目的：" + purchaseRequest.getPurpose() + "。");
        } else {
            this.successor.processRequest(purchaseRequest);
        }
    }
}
