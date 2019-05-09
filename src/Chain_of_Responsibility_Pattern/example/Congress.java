package Chain_of_Responsibility_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/04/02
 */
public class Congress extends Approver {

    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        System.out.println("召开董事会审批采购单：" + purchaseRequest.getNumber() + "，金额：" + purchaseRequest.getAmount() +
                "元，采购目的：" + purchaseRequest.getPurpose() + "。");        //处理请求
    }
}
