package com.miguelgaeta.tupler;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Miguel Gaeta on 5/20/15.
 */
@SuppressWarnings({"UnusedDeclaration", "DefaultFileTemplate"})
@AllArgsConstructor(access = AccessLevel.PACKAGE) @ToString @EqualsAndHashCode
public class Tuple5<A, B, C, D, E> {

    public final A d1;
    public final B d2;
    public final C d3;
    public final D d4;
    public final E d5;
}