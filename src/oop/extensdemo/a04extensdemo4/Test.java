package oop.extensdemo.a04extensdemo4;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.ziShow();
    }
}

class Fu{
    String name = "fu";
}

class Zi extends Fu{
    String name = "zi";
    public void ziShow(){
        String name = "zishow";
        System.out.println(name);//zishow
        System.out.println(this.name);//zi
        System.out.println(super.name);//fu
    }
}
