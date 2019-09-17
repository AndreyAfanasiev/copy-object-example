/**
 *
 */
package ru.aafanasiev.tests.copyclasses;

import java.io.Serializable;

/**
 * Base Parametrise interface
 *
 * @author <a href="mailto:aafanasiev@umail.ru">Andrey Afanasiev</a>
 */
public interface BaseInterface<T extends Serializable> {
    T getId();

    void setId(T id);
}
