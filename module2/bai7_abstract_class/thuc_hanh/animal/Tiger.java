package bai7_abstract_class.thuc_hanh.animal;

public class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }

    @Override
    public String howToEat() {
        return null;
    }
}
