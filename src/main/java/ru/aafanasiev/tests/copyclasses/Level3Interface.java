/**
 *
 */
package ru.aafanasiev.tests.copyclasses;

import java.io.Serializable;

/**
 * @author <a href="mailto:aafanasiev@umail.ru">Andrey Afanasiev</a>
 */
public interface Level3Interface<T extends Serializable> {
    T getCode();

    void setCode(T code);
}
