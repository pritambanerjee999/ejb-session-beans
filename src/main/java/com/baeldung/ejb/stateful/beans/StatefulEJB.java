package com.baeldung.ejb.stateful.beans;

import javax.ejb.Local;
import javax.ejb.Stateful;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */

@Local
@Stateful(name = "StatefulEJB")

public class StatefulEJB {

    public String name;

}