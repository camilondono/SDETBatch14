package Class20;

public class Task3 {
    // Write a Java program called Teacher.  Identify features and behaviour of that Class.
    // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own
    // features and behaviour. Test all 4 classes


}
class Teacher{
    protected String name;
    protected int age;
    protected int yearsOfExperience;
    Teacher(String name, int age,int yearsOfExperience){
        this.name=name;
        this.age=age;
        this.yearsOfExperience=yearsOfExperience;

    }
    void teach(){
        System.out.println(name+" is always teaching ");
    }
}
class MathTeacher extends Teacher{
    void teachTheClass (){
        System.out.println("Teaching is the key to impact others lives");
    }
    MathTeacher(String name, int age, int noOfyears){
        super("Camilo",32,10);
    }

}
class ChemistryTeacher extends Teacher{
    boolean teachOrganic;

    ChemistryTeacher(String name, int age, int yearsOfExperience) {
        super(name, age, yearsOfExperience);
    }
    void teachChem(){
        System.out.println(name+ " teach Chemistry");
    }
}
class PianoTeacher extends Teacher{
    String pianoType;
    PianoTeacher(String name, int age, int yearsOfExperience) {
        super(name, age, yearsOfExperience);
        this.pianoType=pianoType;
    }
}