public class StudentTest {

    public static void main(String[] args) {

        // PART 1: Mutable Student
        // TODO: Create a MutableStudent object.
        MutableStudent NewMStudent=new MutableStudent("Daniel", 23);

        // TODO: Display the student's original information.
        NewMStudent.displayInfo();

        // TODO: Use the setter methods to change the student's data.
        NewMStudent.setAge(12);
        NewMStudent.setName("Samantha");

        // TODO: Display the student again.
        // Question: Did the SAME object change?
        NewMStudent.displayInfo();

        System.out.println();

        // PART 2: Immutable Student
        // TODO: Create an ImmutableStudent object.
        ImmutableStudent newIStudent=new ImmutableStudent("Nathaniel", 32);

        // TODO: Display the student's information.
        newIStudent.displayInfo();

        // Try to answer this in a comment:
        // Why can you not change the ImmutableStudent object
        // using setter methods?
        //I can't change the object because it has no setter methods and the fields are set as "final" meaning they cannot be changed.

        // PART 3: Compare
        // Add comments that answer:
        // 1. Which class is mutable?
        //MutableStudent
        // 2. Which class is immutable?
        //ImmutableStudent
        // 3. What is the biggest difference you noticed?
        //Immutable classes can't have their information change, and therefore any information entered into the constructor is irreversible.
        //Mutable Classes however are much more forgiving, allowing you to change information, making mistakes reversible.
    }
}
