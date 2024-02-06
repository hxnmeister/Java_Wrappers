package com.ua.project.wrappers;

import java.util.Random;

public class WrapperTest {
    public static void main(String[] args) {
        Integer i1 = 123123;
        Integer i2 = new Integer(54647);
        Integer i3 = Integer.valueOf(32314);
        Integer i4 = Integer.parseInt("89741");

        Double d1 = 3.123412541312;
        Double d2 = new Double(5643.11134);
        Double d3 = Double.valueOf(4312.123);
        Double d4 = Double.parseDouble("67.221");
        Double d5 = 0.0;
        Double nanValue = d1 / d5;
        Double infinityValue = nanValue;

        Float f1 = 34.2314F;
        Float f2 = new Float(3.123F);
        Float f3 = Float.valueOf(42.12F);
        Float f4 = Float.parseFloat("33.1");

        Character ch1 = 'h';
        Character ch2 = new Character('!');
        Character ch3 = Character.valueOf('i');

        Boolean b1 = false;
        Boolean b2 = new Boolean(false);
        Boolean b3 = Boolean.valueOf(true);
        Boolean b4 = Boolean.parseBoolean("1 > 2");

        Short s1 = 1241;
        Short s2 = new Short((short)9458);
        Short s3 = Short.valueOf((short)3214);
        Short s4 = Short.parseShort("2343");

        Long l1 = 34620L;
        Long l2 = new Long(86756352);
        Long l3 = Long.valueOf(99878909);
        Long l4 = Long.parseLong("5242145");
        Long compare1 = 120L;
        Long compare2 = 120L;
        Long compare3 = 1200L;
        Long compare4 = 1200L;

        Byte by1 = 127;
        Byte by2 = new Byte((byte)45);
        Byte by3 = Byte.valueOf((byte)11);
        Byte by4 = Byte.parseByte("33");

        int convertResult1 = !d1.isInfinite() ? d1.intValue() : 0;
        byte convertResult2 = d2.byteValue();
        long convertResult3 = d3.longValue();
        short convertResult4 = d2.shortValue();
        float convertResult5 = !d3.isNaN() ? d3.byteValue() : 0.0F;

        displayVarData(nanValue, "nanValue");
        displayVarData(infinityValue, "infinityValue");

        System.out.println("-".repeat(20));

        System.out.printf(" compare1 (120) == compare2 (120) = %s%n", compare1 == compare2);
        System.out.printf(" compare3 (1200) == compare4 (1200) = %s%n", compare3 == compare4);
    }

    static private void displayVarData(final Double value, final String varName){
        System.out.printf(" Переменная %s = ", varName);

        if(value.isInfinite()){
            System.out.print("Infinite\n");
            return;
        }
        else if(value.isNaN()){
            System.out.print("NaN\n");
            return;
        }

        System.out.print(value + "\n");
    }
}
