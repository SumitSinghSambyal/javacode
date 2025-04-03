public class InnerOuter {
    static int a =20;
    class B{
        private int a =10;
        void who(){
            B.C c = new B().new C();
            System.out.println("I am C "+c.a);
        }
        class C{
            int a =30;
            void who(){
                C c = new C();
                System.out.println("I am C "+c.a);
            }
        }
    }
    public static void main(String args[]){
        InnerOuter i = new InnerOuter();
        InnerOuter.B b = i.new B();
        InnerOuter.B.C c = b.new C();
        //we can cannot declare any static data member in inner class till version 16, after v16, we can do it.
        //we can access directly outer class members in inner class
        //we cannot access data of inner class data directly in outside class
        //if we want to access inner class data then we have to create a object of inner class
        //for sub functions to reuse only under one func then we create inner class under func,
        // then we can create sub func in inner class, and use it in main func to use it.
        b.who();
        c.who();
    }
}
