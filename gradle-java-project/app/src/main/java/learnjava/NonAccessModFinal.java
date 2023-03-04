package learnjava;
/*final" modifier is a non-access modifier that is used to indicate that a variable, method, or class 
cannot be changed once it has been initialized or defined.*/
//In this we are override the final method in final_gfg.then we get error.we can not inherit the final class and method
public class NonAccessModFinal {
    private final String name;

    public NonAccessModFinal(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public void setName(String name2) {
    }
}
class Student extends NonAccessModFinal {
    public Student(String name) {
        super(name);
    }
}
    

    
    

