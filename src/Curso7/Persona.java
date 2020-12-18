package Curso7;

public class Persona {
    private String name;
    private int age;
    private String gender;
    public Persona(){
        System.out.println("la persona contructora");
    }
    public Persona(String name){
        System.out.println("la 2da persona contructora, su nombre es ");

    }


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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
