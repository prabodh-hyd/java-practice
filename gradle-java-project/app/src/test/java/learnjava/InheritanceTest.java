package learnjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InheritanceTest {
    @Test
    public void testInheritance(){
        Animals an=new Animals();
        assertEquals("An animal is eating...", an.eat());

    }
    @Test
    public void testAnimalMove() {
        Animals animal = new Animals();
        assertEquals("An animal is moving...", animal.move());
    }
    @Test
    public void testDogBark() {
        Dog dog = new Dog();
        assertEquals("A dog is barking...", dog.bark());
    }
    @Test
    public void testDogMove() {
        Dog dog = new Dog();
        assertEquals("A dog is running...", dog.move());
    }
}
