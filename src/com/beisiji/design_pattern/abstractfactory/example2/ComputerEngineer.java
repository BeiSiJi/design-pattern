package com.beisiji.design_pattern.abstractfactory.example2;

/**
 * Created by beisiji on 2019/7/31.
 * 装机工程师
 * 返回对应的产品簇，相当于抽象工厂的实现类
 */
public class ComputerEngineer {


    /**
     * cpu引用
     */
    private CPUApi cpu = null;

    /**
     * 主板引用
     */
    private MainBoardApi mainBoard = null;


    public void makeCompulter(AbstractFactory factory){
        //1.选择好装机的配件
        this.prepareHardwares(factory);

        //2.组装机器

        //3.付钱

        //

    }



    private void prepareHardwares(AbstractFactory factory){

        //根据具体工厂创建对应产品的示例
        this.cpu = factory.createCpu();
        this.mainBoard = factory.createMainBoard();

        //校验是否合格
        this.cpu.calculate();
        this.mainBoard.installCPU();
    }


}
