
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import org.junit.Test;

public class Tests {
    @Test
    public void TestHahsSet1(){
        EjemploHashSet testsetHash = new EjemploHashSet();
        testsetHash.Añadir("obj");
        testsetHash.Añadir("obj1");
        testsetHash.Añadir("obj2");
        testsetHash.Añadir("obj");
        testsetHash.Añadir("obj1");
        assertEquals("[obj, "+"obj2, "+"obj1]",testsetHash.mostrar());
    }
    @Test
    public void TestLinkedHasgSet1(){
        EjemploLinkedHashSet testsetTestTreeSet1 = new EjemploLinkedHashSet();
        testsetTestTreeSet1.Añadir("a");
        testsetTestTreeSet1.Añadir("c");
        testsetTestTreeSet1.Añadir("b");
        testsetTestTreeSet1.Añadir("c");
        testsetTestTreeSet1.Añadir("d");
        testsetTestTreeSet1.Añadir("b");
        assertEquals("[a, "+"c, "+"b, "+"d]",testsetTestTreeSet1.mostrar());

    }
    @Test
    public void TestTreeSet1(){
        EjemploTreeSet testsetTestTreeSet1 = new EjemploTreeSet();
        testsetTestTreeSet1.Añadir(1);
        testsetTestTreeSet1.Añadir(3);
        testsetTestTreeSet1.Añadir(4);
        testsetTestTreeSet1.Añadir(5);
        testsetTestTreeSet1.Añadir(2);
        testsetTestTreeSet1.Añadir(1);
        assertEquals("[1, "+"2, "+"3, "+"4, "+ "5]",testsetTestTreeSet1.mostrar());

    }

}
