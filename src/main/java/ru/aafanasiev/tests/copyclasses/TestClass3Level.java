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
public class TestClass3Level extends TestClass2Level implements Level3Interface<String> {
    String code;
    Long departmentId;
}
