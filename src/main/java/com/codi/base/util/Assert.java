/**
 * @Title:Assert.java
 * @Package:com.yuhoo.power4j.base.validate
 * @Description:TODO
 * @version 1.0
 *
 */
package com.codi.base.util;

import java.util.Collection;
import java.util.Map;

/**
 * @ClassName:Assert
 * @Desctiption:TODO
 * @author Shangdu Lin
 * 
 */
public abstract class Assert {
    /**
     * Assert a boolean expression, throwing
     * <code>IllegalArgumentException</code> if the test result is
     * <code>false</code>.
     * 
     * <pre>
     * Assert.isTrue(i &gt; 0, &quot;The value must be greater than zero&quot;);
     * </pre>
     * 
     * @param expression
     *            a boolean expression
     * @param message
     *            the exception message to use if the assertion fails
     * @throws IllegalArgumentException
     *             if expression is <code>false</code>
     */
    public static void isTrue(boolean expression, String message) {
	if (!expression) {
	    throw new IllegalArgumentException(message);
	}
    }

    /**
     * Assert a boolean expression, throwing
     * <code>IllegalArgumentException</code> if the test result is
     * <code>false</code>.
     * 
     * <pre>
     * Assert.isTrue(i &gt; 0);
     * </pre>
     * 
     * @param expression
     *            a boolean expression
     * @throws IllegalArgumentException
     *             if expression is <code>false</code>
     */
    public static void isTrue(boolean expression) {
	isTrue(expression, "[Assertion failed] - this expression must be true");
    }

    /**
     * Assert that an object is not null.
     * 
     * <pre>
     * Assert.notNull(clazz, &quot;The class must not be null&quot;);
     * </pre>
     * 
     * @param object
     *            the object to check
     * @param message
     *            the exception message to use if the assertion fails
     * @throws IllegalArgumentException
     *             if the object is <code>null</code>
     */
    public static void notNull(Object object, String message) {
	if (object == null) {
	    throw new IllegalArgumentException(message);
	}
    }

    /**
     * Assert that an object is not null.
     * 
     * <pre>
     * Assert.notNull(clazz);
     * </pre>
     * 
     * @param object
     *            the object to check
     * @throws IllegalArgumentException
     *             if the object is <code>null</code>
     */
    public static void notNull(Object object) {
	notNull(object,
		"[Assertion failed] - this argument is required; it cannot be null");
    }

    /**
     * Assert that a string is not empty; that is, it must not be null and not
     * empty.
     * 
     * <pre>
     * Assert.hasLength(name, &quot;Name must not be empty&quot;);
     * </pre>
     * 
     * @param text
     *            the string to check
     * @see StringUtils#hasLength
     */
    public static void hasLength(String text, String message) {
	if (text == null || text.length() < 1)  {
	    throw new IllegalArgumentException(message);
	}
    }

    /**
     * Assert that a string is not empty; that is, it must not be null and not
     * empty.
     * 
     * <pre>
     * Assert.hasLength(name);
     * </pre>
     * 
     * @param text
     *            the string to check
     * @see StringUtils#hasLength
     */
    public static void hasLength(String text) {
	hasLength(
		text,
		"[Assertion failed] - this string argument must have length; it cannot be null or empty");
    }

    /**
     * Assert that a string has valid text content; that is, it must not be null
     * and must contain at least one non-whitespace character.
     * 
     * <pre>
     * Assert.hasText(name, &quot;Name must not be empty&quot;);
     * </pre>
     * 
     * @param text
     *            the string to check
     * @see StringUtils#hasText
     */
    public static void hasText(String text, String message) {
	if (text == null || text.trim().length() < 1) {
	    throw new IllegalArgumentException(message);
	}
    }

    /**
     * Assert that a string has valid text content; that is, it must not be null
     * and must contain at least one non-whitespace character.
     * 
     * <pre>
     * Assert.hasText(name, &quot;Name must not be empty&quot;);
     * </pre>
     * 
     * @param text
     *            the string to check
     * @see StringUtils#hasText
     */
    public static void hasText(String text) {
	hasText(
		text,
		"[Assertion failed] - this string argument must have text; it cannot be null, empty, or blank");
    }

    /**
     * Assert that an array has elements; that is, it must not be
     * <code>null</code> and must have at least one element.
     * 
     * <pre>
     * Assert.notEmpty(array, &quot;The array must have elements&quot;);
     * </pre>
     * 
     * @param array
     *            the array to check
     * @param message
     *            the exception message to use if the assertion fails
     * @throws IllegalArgumentException
     *             if the object array is <code>null</code> or has no elements
     */
    public static void notEmpty(Object[] array, String message) {
	if (array == null || array.length == 0) {
	    throw new IllegalArgumentException(message);
	}
    }
    
    
	public static void notEmpty(String s, String message) {
		if (s == null || "".equals(s)) {
			throw new IllegalArgumentException(message);
		}
	}

    /**
     * Assert that an array has elements; that is, it must not be
     * <code>null</code> and must have at least one element.
     * 
     * <pre>
     * Assert.notEmpty(array);
     * </pre>
     * 
     * @param array
     *            the array to check
     * @throws IllegalArgumentException
     *             if the object array is <code>null</code> or has no elements
     */
    public static void notEmpty(Object[] array) {
	notEmpty(
		array,
		"[Assertion failed] - this array must not be empty: it must contain at least 1 element");
    }

    /**
     * Assert that a collection has elements; that is, it must not be
     * <code>null</code> and must have at least one element.
     * 
     * <pre>
     * Assert.notEmpty(collection, &quot;Collection must have elements&quot;);
     * </pre>
     * 
     * @param collection
     *            the collection to check
     * @param message
     *            the exception message to use if the assertion fails
     * @throws IllegalArgumentException
     *             if the collection is <code>null</code> or has no elements
     */
    public static void notEmpty(Collection<?> collection, String message) {
	if (collection == null || collection.isEmpty()) {
	    throw new IllegalArgumentException(message);
	}
    }

    /**
     * Assert that a collection has elements; that is, it must not be
     * <code>null</code> and must have at least one element.
     * 
     * <pre>
     * Assert.notEmpty(collection, &quot;Collection must have elements&quot;);
     * </pre>
     * 
     * @param collection
     *            the collection to check
     * @throws IllegalArgumentException
     *             if the collection is <code>null</code> or has no elements
     */
    public static void notEmpty(Collection<?> collection) {
	notEmpty(
		collection,
		"[Assertion failed] - this collection must not be empty: it must contain at least 1 element");
    }

    /**
     * Assert that a Map has entries; that is, it must not be <code>null</code>
     * and must have at least one entry.
     * 
     * <pre>
     * Assert.notEmpty(map, &quot;Map must have entries&quot;);
     * </pre>
     * 
     * @param map
     *            the map to check
     * @param message
     *            the exception message to use if the assertion fails
     * @throws IllegalArgumentException
     *             if the map is <code>null</code> or has no entries
     */
    public static void notEmpty(Map<?, ?> map, String message) {
	if (map == null || map.isEmpty()) {
	    throw new IllegalArgumentException(message);
	}
    }

    /**
     * Assert that a Map has entries; that is, it must not be <code>null</code>
     * and must have at least one entry.
     * 
     * <pre>
     * Assert.notEmpty(map);
     * </pre>
     * 
     * @param map
     *            the map to check
     * @throws IllegalArgumentException
     *             if the map is <code>null</code> or has no entries
     */
    public static void notEmpty(Map<?, ?> map) {
	notEmpty(
		map,
		"[Assertion failed] - this map must not be empty; it must contain at least one entry");
    }

    /**
     * Assert that the provided object is an instance of the provided class.
     * 
     * <pre>
     * Assert.instanceOf(Foo.class, foo);
     * </pre>
     * 
     * @param clazz
     *            the required class
     * @param obj
     *            the object to check
     * @throws IllegalArgumentException
     *             if the object is not an instance of clazz
     * @see Class#isInstance
     */
    public static void isInstanceOf(Class<?> clazz, Object obj) {
	isInstanceOf(clazz, obj, "");
    }

    /**
     * Assert that the provided object is an instance of the provided class.
     * 
     * <pre>
     * Assert.instanceOf(Foo.class, foo);
     * </pre>
     * 
     * @param clazz
     *            the required class
     * @param obj
     *            the object to check
     * @param message
     *            a message which will be prepended to the message produced by
     *            the function itself, and which may be used to provide context.
     *            It should normally end in a ":" or ". " so that the function
     *            generate message looks ok when prepended to it.
     * @throws IllegalArgumentException
     *             if the object is not an instance of clazz
     * @see Class#isInstance
     */
    public static void isInstanceOf(Class<?> clazz, Object obj, String message) {
	Assert.notNull(clazz,
		"The clazz to perform the instanceof assertion cannot be null");
	Assert.isTrue(clazz.isInstance(obj), message + "Object of class '"
		+ (obj != null ? obj.getClass().getName() : "[null]")
		+ "' must be an instance of '" + clazz.getName() + "'");
    }

    /**
     * Assert a boolean expression, throwing <code>IllegalStateException</code>
     * if the test result is <code>false</code>. Call isTrue if you wish to
     * throw IllegalArgumentException on an assertion failure.
     * 
     * <pre>
     * Assert.state(id == null, &quot;The id property must not already be initialized&quot;);
     * </pre>
     * 
     * @param expression
     *            a boolean expression
     * @param message
     *            the exception message to use if the assertion fails
     * @throws IllegalStateException
     *             if expression is <code>false</code>
     */
    public static void state(boolean expression, String message) {
	if (!expression) {
	    throw new IllegalStateException(message);
	}
    }

    /**
     * Assert a boolean expression, throwing <code>IllegalStateException</code>
     * if the test result is <code>false</code>. Call isTrue if you wish to
     * throw IllegalArgumentException on an assertion failure.
     * 
     * <pre>
     * Assert.state(id == null);
     * </pre>
     * 
     * @param expression
     *            a boolean expression
     * @throws IllegalStateException
     *             if expression is <code>false</code>
     */
    public static void state(boolean expression) {
	state(expression,
		"[Assertion failed] - this state invariant must be true");
    }
}
