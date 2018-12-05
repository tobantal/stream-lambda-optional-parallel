package com.da.defaults;

// FORCE: Client14 > Abstract1 > Interface1=Interface4
public class Client14 extends Abstract1 implements Interface1, Interface4 {

    /*
    public void methodA() {
        System.out.println("Inside Method A " + Client14.class);
    }
    */

    public static void main(String[] args) {
        Client14 client14 = new Client14();
        client14.methodA();
    }
}
