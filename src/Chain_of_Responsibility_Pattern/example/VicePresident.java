package Chain_of_Responsibility_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/04/02
 */
public class VicePresident extends Approver {
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() < 10000) {
            System.out.println("副董事长" + this.name + "审批采购单：" + purchaseRequest.getNumber() + "，金额：" + purchaseRequest.getAmount() +
                    "元，采购目的：" + purchaseRequest.getPurpose() + "。");
        } else {
            this.successor.processRequest(purchaseRequest);
        }
    }
}
