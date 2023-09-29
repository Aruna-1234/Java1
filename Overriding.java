class  Parent{
    void marry() {
        System.out.println("Ammu");
    }
}
    class Child extends Parent{
        void marry() {
            System.out.println("Junnu");
        }
    }

    class Overriding {
        public static void main(String[] args) {
            Child c=new Child();
            c.marry();
        }
    }


