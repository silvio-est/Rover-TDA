package org.liz.test.models;

import java.util.Arrays;

public enum CommandEnum {
    Avanazar('A'),
    Retroceder('R'),
    GirarIzquierda('I'),
    GirarDerecha('D');

    private Character code;

    CommandEnum(Character code) {
        this.code = code;
    }


    public static boolean isCode(Character command){
        return Arrays.stream(CommandEnum.values()).
                anyMatch(commandEnum -> command == commandEnum.code);
    }
}
