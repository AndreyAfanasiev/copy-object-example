/**
 *
 */
package ru.aafanasiev.tests.copyclasses;

import lombok.Getter;
import lombok.Setter;

/**
 * @author <a href="mailto:aafanasiev@umail.ru">Andrey Afanasiev</a>
 */
@Setter
@Getter
public class TestClass2Level extends TestClass1Level implements BaseInterface<Long> {
    private String name;
    private String department;
}
