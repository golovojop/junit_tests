/**
 * Материалы:
 * https://semaphoreci.com/community/tutorials/stubbing-and-mocking-with-mockito-2-and-junit
 */

package edu.barabu.junit_test;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class RemoteCalculatorManagerMockTest {

    /**
     *  Global declaration !!!
     */


    /**
     * Мокаем класс - источник данных. Теперь все инстансы данного класса в рамках данного теста
     * будут создаваться замоканными.
     */
    //@Mock
    //RemoteCalculator rcalc;

    //@Rule public MockitoRule mockitoRule = MockitoJUnit.rule();


    @Test
    public void testAssert(){

        /**
         * Альтернатива для кода в строках 23-26
         */
        RemoteCalculator rcalc = mock(RemoteCalculator.class);

        /**
         * Инстанс тестируемого класса. Мы обязательно должны подсунуть в
         * тестируемый класс наш mock-объект. Я почему-то думал, что после
         * директивы @Mock это будет происходить автоматическии.
         */
        RemoteCalculatorManager rcm = new RemoteCalculatorManager(rcalc);

        /**
         * Конструкция "when(methodA(args)).thenReturn(result)
         * говорит mock-объекту о том какой результат он должен вернуть, если
         * будет вызван метод methodA c конкретным значением аргумента, в данном
         * случае a = 5, b = 6.
         */
        when(rcalc.responder(RemoteCalculator.OP_ADD, 5, 6)).thenReturn(11);

        /**
         * Теперь мы можем вызвать интересующий нас метод в инстансе тестируемого
         * класса, чтобы проверить реакцию тестируемого объекта на результат из мок-объекта.
         */
        assertEquals(11, rcm.add(5, 6));
    }

    @Test
    public void testVerify(){

        /**
         * Альтернатива для кода в строках 23-26
         */
        RemoteCalculator rcalc = mock(RemoteCalculator.class);

        /**
         * Инстанс тестируемого класса.
         */
        RemoteCalculatorManager rcm = new RemoteCalculatorManager(rcalc);

        /**
         * Конструкция "when(methodA(args)).thenReturn(result)
         * говорит mock-объекту о том какой результат он должен вернуть, если
         * будет вызван метод methodA c конкретным значением аргумента, в данном
         * случае a = 5, b = 6.
         */
        when(rcalc.responder(RemoteCalculator.OP_ADD, 5, 6)).thenReturn(11);

        /**
         * Теперь мы можем вызвать интересующий нас метод в инстансе тестируемого
         * класса, чтобы проверить реакцию тестируемого объекта на результат из мок-объекта.
         */
        rcm.add(5, 6);

        verify(rcalc).responder(RemoteCalculator.OP_ADD, 5, 6);
    }
}
