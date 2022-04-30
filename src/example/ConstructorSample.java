package example;

public class ConstructorSample {
    public static void main(String[] args) {
        System.out.println("--- new Cat(\"タマ\")でインスタンスを生成する ---");
        Cat tama = new Cat("タマ");

        System.out.println();
        System.out.println("--- インスタンス生成直後、自己紹介させる ---");
        tama.introduceMyself();
    }
}
