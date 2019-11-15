package com.beisiji.design_pattern.prototype.example3;

/**
 * Created by beisiji on 2019/11/15.
 */
public abstract class ProductPrototype {

    private String productName;

    public ProductPrototype(String productName) {
        this.productName = productName;
    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public abstract ProductPrototype cloneProduct();

    @Override
    public String toString() {
        return "ProductPrototype{" +
                "productName='" + productName + '\'' +
                '}';
    }
}
