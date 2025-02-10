# LL:

Git:
    - gitignore Statements can be negated by using !
        - all parent folders must be "reactivated"

Java:

    - Datatypes:
        - primitive Datatypes start with an lowercase character and can't be null.

    - Bit-Manipulation:
        - Operators: AND & , OR |, XOR ^, NOT ~
        - Bit-shift: 
            - (signed shift) >> x : shift by x places (<< 2 equals multiplikation by 2)
            - (unsigned) >>> x : shifts no mater the amplitude ( -12 >>> 2 equals 1073741821)

    - Comparator: written like: (<Class>::compareTo). e.g.: (ProductionRemoteControlCar::compareTo).

    - Generics:
        - when importing a Generic interface, the Class has to be defined in <> Bracktes in the import itself. 

    - if-Statements:
        - can be written in a single line while not using {}.

    - ternary operator:
        - dont use variable--, beacause only variable (wihtout reduction) is returned.

    - String:
        - .format:
            - escape for % is: %%.

    - boolean-Statements: 
        - AND binds stronger than OR.

    - Array-Lists:
        - remove removes the first of the matching Elements.

    - Arrays:
        - can be iterated by an for-each loop. 

    - Switch-Statements:

        - arrow notation has no breaks.
        - it is possible to write every possible outcome as a Value to a Variable.
            -> example:
                int result =
                    switch (operation) {
                        case "+" -> x;
                        case "*" -> y;
                        case "/" -> y;
                        ...
                    };
        - all kind of Switch-versions are more or less equally performant.
        - multiple cases can be written into one value
            -> example:
                switch (speed) {
                case 1: case 2: case 3: case 4:
                    return 1.0;
                case 5: case 6: case 7: case 8:
                    return .9;
                case 9:
                    return .8;
                default:
                    return .77;
                }


KI:
    - O3 ist extrem stark. 


