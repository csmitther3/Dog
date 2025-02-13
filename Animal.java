public abstract class Animal {
    protected int age;
    public Animal() {
        this.age = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public abstract void eat();
}