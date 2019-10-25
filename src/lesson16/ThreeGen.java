package lesson16;

public class ThreeGen <T,V,K> {
    private T ob1;
    private V ob2;
    private K ob3;

    public ThreeGen(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }

    public T getOb1() {
        return ob1;
    }

    public void setOb1(T ob1) {
        this.ob1 = ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public void setOb2(V ob2) {
        this.ob2 = ob2;
    }

    public K getOb3() {
        return ob3;
    }

    public void setOb3(K ob3) {
        this.ob3 = ob3;
    }

    public void showTypes(){
        System.out.println(ob1.getClass().getName()+" = "+ob1);
        System.out.println(ob2.getClass().getName()+" = "+ob2);
        System.out.println(ob3.getClass().getName()+" = "+ob3);
    }

    public static void main(String[] args) {
        ThreeGen<Integer, String,Double> threeGen=new ThreeGen<>(15,"AAA",26.65);
        threeGen.showTypes();
    }
}
