/**
 *
 */
package ru.aafanasiev.tests;

import ru.aafanasiev.tests.copyclasses.SimpleTests;
import ru.aafanasiev.tests.copyclasses.TestClass1Level;
import ru.aafanasiev.tests.copyclasses.TestClass2Level;
import ru.aafanasiev.tests.copyclasses.TestClass3Level;
import ru.aafanasiev.util.copier.Copier;
import ru.aafanasiev.util.copier.CopierBuilder;

import lombok.extern.slf4j.Slf4j;

/**
 * Test for copier compiler
 *
 * @author <a href="mailto:aafanasiev@umail.ru">Andrey Afanasiev</a>
 */
@Slf4j
public class Test001 {
    private Copier copier = CopierBuilder.builder().build();

    /**
     * @param args
     */
    public static void main(String[] args) {
        Test001 t = new Test001();
        t.init();
    }

    private void init() {
        log.debug("Run test");
        SimpleTests from = new SimpleTests();
        SimpleTests to = new SimpleTests();
        // copier.copy(from, to);

        log.debug("");
        log.debug("==========================================================");
        log.debug("");
        TestClass1Level from1 = new TestClass1Level();
        TestClass1Level to1 = new TestClass1Level();
        // copier.copy(from1, to1);

        log.debug("");
        log.debug("==========================================================");
        log.debug("");
        TestClass2Level from2 = new TestClass2Level();
        TestClass2Level to2 = new TestClass2Level();
        // copier.copy(from2, to2);

        log.debug("");
        log.debug("==========================================================");
        log.debug("");
        TestClass3Level from3 = new TestClass3Level();
        TestClass3Level to3 = new TestClass3Level();
        copier.copy(from3, to3);
    }

}
