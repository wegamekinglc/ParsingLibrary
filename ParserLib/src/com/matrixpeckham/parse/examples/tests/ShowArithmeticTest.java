package com.matrixpeckham.parse.examples.tests;

import static com.matrixpeckham.parse.examples.arithmetic.ArithmeticParser.start;
import com.matrixpeckham.parse.parse.tokens.TokenTester;
import java.util.logging.Logger;

/*
 * Copyright (c) 2000 Steven J. Metsker. All Rights Reserved.
 *
 * Steve Metsker makes no representations or warranties about
 * the fitness of this software for any particular purpose,
 * including the implied warranty of merchantability.
 */
/**
 * Test the <code>ArithmeticParser</code> class.
 *
 * @author Steven J. Metsker
 *
 * @version 1.0
 */
public class ShowArithmeticTest {

    /**
     * Test the <code>ArithmeticParser</code> class.
     *
     * @param args
     */
    public static void main(String[] args) {
        new TokenTester<>(start()).test();
    }

    private static final Logger LOG
            = Logger.getLogger(ShowArithmeticTest.class.getName());

}
