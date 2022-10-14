
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.Random;

import org.junit.Test;

public class Tests {
    @Test
    public void TestHahsSet1(){

        EjemploHashSet testsetHash = new EjemploHashSet();

        testsetHash.agregar("obj");
        testsetHash.agregar("obj1");
        testsetHash.agregar("obj2");
        testsetHash.agregar("obj");
        testsetHash.agregar("obj1");

        assertEquals(false,testsetHash.existeElemento("a"));

        testsetHash.remover("obj");

        assertEquals(2,testsetHash.nrosDeLaList());

        testsetHash.removerTodo();

        assertEquals("[obj, "+"obj2, "+"obj1]",testsetHash.mostrar());
    }
    @Test
    public void TestLinkedHasgSet1(){

        EjemploLinkedHashSet testseLinkedHashSet = new EjemploLinkedHashSet();

        testseLinkedHashSet.agregar("a");
        testseLinkedHashSet.agregar("c");
        testseLinkedHashSet.agregar("b");
        testseLinkedHashSet.agregar("c");
        testseLinkedHashSet.agregar("d");
        testseLinkedHashSet.agregar("b");

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
            testsetTestTreeSet1.agregar(i);
        }

        testsetTestTreeSet1.agregar(9);
        testsetTestTreeSet1.remover(10);

        assertEquals(true,testsetTestTreeSet1.existeElemento(7));

        testsetTestTreeSet1.removerTodo();

        assertEquals("[6, "+"7, "+"8, "+"9, "+ "18]",testsetTestTreeSet1.mostrar());

    }
    @Test
    public void TestAbstractSet(){
        
        EjemploAbsSet testabs = new EjemploAbsSet();

        EjemploTreeSet testsetTestTreeSet1 = new EjemploTreeSet();

        for (int i=20 ; i>testabs.nrosDeLaListABS() ; i--){
//            int numero = (int)(Math.random() * 50 + 1);
            testabs.agregarABS(i);
        }

        testsetTestTreeSet1.agregar(11);
        testsetTestTreeSet1.agregar(12);
        testsetTestTreeSet1.agregar(13);

//        for (int i=20 ; i>testsetTestTreeSet1.nrosDeLaList() ; i--){
//            int numero = (int)(Math.random() * 50 + 1);
//            testsetTestTreeSet1.agregar(i);
//        }
//        assertEquals("[1, "+"1, "+"1, "+"1, "+ "1]",testsetTestTreeSet1.mostrar());
//        assertEquals("[1, "+"1, "+"1, "+"1, "+ "1]",testabs.mostrarABS());

        testabs.agregarCollection(testsetTestTreeSet1.getImplementoLTreeSet());

//        testabs.removerCollection(testsetTestTreeSet1.getImplementoLTreeSet());

        assertEquals(true,testabs.compruebaCollection(testsetTestTreeSet1.getImplementoLTreeSet()));

        testabs.soloDejarCollection(testsetTestTreeSet1.getImplementoLTreeSet());

        assertEquals("[1, "+"1, "+"1, "+"1, "+ "1]",testabs.mostrarABS());
    }
    @Test
    public void TestHasttable(){

        EjemploHastTable htpersona1 = new EjemploHastTable();

        Persona persona1 = new Persona("juan","peres",10);


    }
}
