package com.beisiji.design_pattern.prototype.example4;

/**
 * Created by beisiji on 2019/11/15.
 */
public class Client {

    public static void main(String[] args) {

        ProtoType protoType1 =  new ConcreatePrototype1("v1");
        PrototypeManager.add("k1",protoType1);

        ProtoType p1 = PrototypeManager.get("k1").clonePrototype();
        p1.setName("yuan");
        System.out.println("p1 = " + p1 + ", old = " + protoType1);

        ProtoType p2 = PrototypeManager.get("k1").clonePrototype();
        p2.setName("liu");
        System.out.println("p2 = " + p2 + ", old = " + protoType1);

        //获取不到原型对象
//        ProtoType foo = PrototypeManager.get("k2").clonePrototype();

        //修改原型对象
        ConcreatePrototype2 prototype2 = new ConcreatePrototype2("v2");
        PrototypeManager.add("k1",prototype2);

    }
}
