package com.beisiji.design_pattern.prototype.example3;

/**
 * Created by beisiji on 2019/11/15.
 */
public class ConcreateProductPrototype extends ProductPrototype implements Cloneable {


    public ConcreateProductPrototype(String productName) {
        super(productName);
    }

    @Override
    public ProductPrototype cloneProduct() {
        ProductPrototype productPrototype = null;
        try {
            productPrototype = (ProductPrototype)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return productPrototype;
    }
}
