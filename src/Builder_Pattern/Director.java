package Builder_Pattern;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public  Product construct() {
        return builder.getProduct();
    }
}
