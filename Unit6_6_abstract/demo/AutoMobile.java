package Unit6_6_abstract.demo;

class AutoMobile extends Vehicle{
    @Override
    public void run() {
        System.out.println("重写run方法--子类的run方式--汽油驱动");
    }
}
