package edu.Domile;

import java.util.Arrays;

public class Cooking {
    public static class Units {
        public static final String OZ = "OZ";
        public static final String POUND = "POUND";
        public static final String GALLON = "GALLON";
        public static final String QUART = "QUART";
        public static final String PINT = "PINT";
        public static final String CUP = "CUP";
        public static final String FL_OUNCE = "Fl-OUNCE";
        public static final String TBSP = "TBSP";
        public static final String TSP = "TSP";
        public static final String ML = "ML";

        public static String[] getValues() {
        String[] units = {OZ, POUND, GALLON, QUART, PINT, CUP, FL_OUNCE, TBSP, TSP, ML};
        return units;
        }

        public static Boolean isValid(String unit){
            Boolean isInputMatching = (Arrays.asList((Units.getValues()))).stream().anyMatch(a-> a.equals(unit));
            return isInputMatching;
        }
    }
        public static class Amounts{
            public static final float OZ = 28;
            public static final float POUND = 454;
            public static final float GALLON = 3800;
            public static final float QUART = 950;
            public static final float PINT = 473;
            public static final float CUP = 237;
            public static final float FL_OUNCE = 30;
            public static final float TBSP = 15;
            public static final float TSP = 5;
            public static final float ML = 1;

            public static float convertUnit(String unit) {
                float result = 0;
                switch (unit) {
                    case Units.OZ:
                        result = OZ;
                         break;
                    case Units.POUND:
                        result = POUND;
                        break;
                    case Units.GALLON:
                         result = GALLON;
                    case Units.QUART:
                        result = QUART;
                    case Units.PINT:
                        result = PINT;
                    case Units.CUP:
                        result = CUP;
                    case Units.FL_OUNCE:
                        result = FL_OUNCE;
                    case Units.TBSP:
                        result = TBSP;
                    case Units.TSP:
                        result = TSP;
                    case Units.ML:
                        result = ML;
                } return result;
            }
        }

    }


