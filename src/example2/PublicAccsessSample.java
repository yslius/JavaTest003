package example2;

import example.Cat;

public class PublicAccsessSample {
    public static void main(String[] args) {
        Cat tama = new Cat();
        tama.setName("タマ");
        tama.setAge(3);

        tama.eat();
        tama.playToy("ボール");
        tama.introduceMyself();
    }
}
