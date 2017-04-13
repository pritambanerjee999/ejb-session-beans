package com.baeldung.ejb.stateless.beans;

import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */

@Stateless(name = "StatelessEJB")
@Local
public class StatelessEJB {

    public String name;

}