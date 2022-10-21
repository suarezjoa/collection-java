
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Enumeration;
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

        //testsetHash.remover("obj");

        assertEquals(3,testsetHash.nrosDeLaList());

        //testsetHash.removerTodo();

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

        assertEquals("[]",testseLinkedHashSet.mostrar());

    }
    @Test
    public void TestTreeSet1(){

        EjemploTreeSet testsetTestTreeSet1 = new EjemploTreeSet();

        //for (int i=10 ; i>testsetTestTreeSet1.nrosDeLaList() ; i--){
        //    testsetTestTreeSet1.agregar(i);
        //}
        testsetTestTreeSet1.agregar(1);
        testsetTestTreeSet1.agregar(3);
        testsetTestTreeSet1.agregar(5);
        testsetTestTreeSet1.agregar(4);
        testsetTestTreeSet1.agregar(1);
        testsetTestTreeSet1.agregar(2);


        testsetTestTreeSet1.agregar(9);
        testsetTestTreeSet1.remover(2);

        assertEquals(true,testsetTestTreeSet1.existeElemento(1));

        //testsetTestTreeSet1.removerTodo();

        assertEquals("[1, "+"3, "+"4, "+"5, "+ "9]",testsetTestTreeSet1.mostrar());

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

        assertEquals("[11, "+"12, "+"13]",testabs.mostrarABS());
    }
    @Test
    public void TestHasttable(){

        EjemploHastTable htpersona1 = new EjemploHastTable();


        
        Persona persona1 = new Persona("pancho","piedra",12);
        Persona persona2 = new Persona("pepe","pipipi",18);
        Persona persona3 = new Persona("nashe","dea",20);


        htpersona1.agregar("soygood", persona1);
        htpersona1.agregar("sicosiado", persona2);
        htpersona1.agregar("dea", persona3);

        htpersona1.eliminar("dea");

        assertEquals(persona1,htpersona1.mostrarElemento("soygood"));
        assertEquals(("["+persona2+", "+persona1+"]") ,htpersona1.mostrarTabla());

    }
}
