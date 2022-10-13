
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.Random;

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
        assertEquals(false,testsetHash.existeElemento("a"));
        testsetHash.remover("obj");
        assertEquals(2,testsetHash.nrosDeLaList());
        testsetHash.removerTodo();

        assertEquals("[obj, "+"obj2, "+"obj1]",testsetHash.mostrar());
    }
    @Test
    public void TestLinkedHasgSet1(){
        EjemploLinkedHashSet testseLinkedHashSet = new EjemploLinkedHashSet();
        testseLinkedHashSet.Añadir("a");
        testseLinkedHashSet.Añadir("c");
        testseLinkedHashSet.Añadir("b");
        testseLinkedHashSet.Añadir("c");
        testseLinkedHashSet.Añadir("d");
        testseLinkedHashSet.Añadir("b");
        assertEquals(true,testseLinkedHashSet.existeElemento("a"));
        testseLinkedHashSet.remover("a");
        assertEquals(3,testseLinkedHashSet.nrosDeLaList());
        testseLinkedHashSet.removerTodo();
        assertEquals("[a, "+"c, "+"b, "+"d]",testseLinkedHashSet.mostrar());

    }
    @Test
    public void TestTreeSet1(){
        EjemploTreeSet testsetTestTreeSet1 = new EjemploTreeSet();
        for (int i=10 ; i>testsetTestTreeSet1.nrosDeLaList() ; i--){
            testsetTestTreeSet1.Añadir(i);
        }
        testsetTestTreeSet1.Añadir(9);
        testsetTestTreeSet1.remover(10);
        assertEquals(true,testsetTestTreeSet1.existeElemento(7));
        testsetTestTreeSet1.removerTodo();
        assertEquals("[6, "+"7, "+"8, "+"9, "+ "18]",testsetTestTreeSet1.mostrar());

    }
    @Test
    public void TestAbstractSet(){
        
        xs testabs = new xs();
        EjemploTreeSet testsetTestTreeSet1 = new EjemploTreeSet();
        for (int i=20 ; i>testabs.cantElemtABS() ; i--){
            //int numero = (int)(Math.random() * 50 + 1);
            testabs.AñadirABS(i);
        }
        for (int i=20 ; i>testsetTestTreeSet1.nrosDeLaList() ; i--){
            //int numero = (int)(Math.random() * 50 + 1);
            testsetTestTreeSet1.Añadir(i);
        }
        //assertEquals("[1, "+"1, "+"1, "+"1, "+ "1]",testsetTestTreeSet1.mostrar());
        //assertEquals("[1, "+"1, "+"1, "+"1, "+ "1]",testabs.mostrarABS());
        testabs.removerList(testsetTestTreeSet1);
        assertEquals("[1, "+"1, "+"1, "+"1, "+ "1]",testabs.mostrarABS());
    }
}
