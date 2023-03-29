/*Nama : A. Nur Aliyyah
  Nim : 13020210016*/
  
interface A {
    public void aaa();
}

interface B extends A {
    public void aaa();
}

class Central0016 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0016 obj = new Central0016();
        obj.aaa();
        System.out.println("main");
    }
}