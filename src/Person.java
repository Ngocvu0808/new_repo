public class Person {
    private String name;
    private int age;
    private String caree;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCaree() {
        return caree;
    }

    public void setCaree(String caree) {
        this.caree = caree;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", caree='" + caree + '\'' +
                '}';
    }
}
