package com.beisiji.design_pattern.prototype.example3;

/**
 * Created by beisiji on 2019/11/15.
 */
public abstract class OrderPrototype {

    private String id;

    private ProductPrototype product;

    public OrderPrototype(String id,ProductPrototype product) {
        this.id = id;
        this.product = product;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    /**
     * 克隆自身的方法
     * @return
     */
    public abstract OrderPrototype cloneOrder();

    @Override
    public String toString() {
        return "OrderPrototype{" +
                "id='" + id + '\'' +
                ", product=" + product +
                '}';
    }
}
