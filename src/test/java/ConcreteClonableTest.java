import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcreteClonableTest {
    @Test
    public void ShouldCreateConcreteClass(){
        ConcreteClonable concrete = new ConcreteClonable("name1" , 30);
    }

    @Test
    public void ShouldCloneNewlyCreatedObject(){
        Clonable concrete = new ConcreteClonable("name1" , 30);
        Clonable cloned = concrete.clone();
    }

    @Test
    public void ClonedObject_ShouldNotBeNull(){
        Clonable concrete = new ConcreteClonable("name1" , 30);
        Clonable cloned = concrete.clone();
        assertNotNull(cloned);
    }

    @Test
    public void ClonedObject_ShouldNotBeTheSame(){
        Clonable concrete = new ConcreteClonable("name1" , 30);
        Clonable cloned = concrete.clone();
        assertNotSame(concrete , cloned);
    }

    @Test
    public void ClonedObject_ShouldBeEqual(){
        Clonable concrete = new ConcreteClonable("name1" , 30);
        Clonable cloned = concrete.clone();
        assertEquals( concrete,cloned);
    }
}