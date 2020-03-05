package sample;

import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.skins.GaugeSkin;

class PureFunctions {
    static String skinTypeToString(Gauge.SkinType type) {
        switch (type) {
            case SLIM:
                return "Slim";
            case SIMPLE_SECTION:
                return "Simple Section";
            case TILE_SPARK_LINE:
                return "Line Graph";
            case MODERN:
                return "Modern";
            case AMP:
                return "Scientific Box";
            case QUARTER:
                return "Quarter Gauge";
            case HORIZONTAL:
                return "Horizontal Half";
            case VERTICAL:
                return "Vertical Half";
            case GAUGE:
                return "Default Gauge";
            default:
                return null;
        }
    }

    //Returns number of decimal places needed to display a given heading
    static int getDecimals(String val) {
        switch (val) {
            case "HR":
                return 0;
            case "SBP":
                return 0;
            case "DBP":
                return 0;
            case "MAP":
                return 1;
            case "CVP":
                return 0;
            case "VT":
                return 0;
            default:
                return 0;
        }
    }

    //Returns the maximum value a heading should ever have
    static int getMaxValue(String val) {
        switch (val) {
            case "HR":
                return 200;
            case "SBP":
                return 140;
            case "DBP":
                return 100;
            case "MAP":
                return 100;
            case "CVP":
                return 10;
            case "VT":
                return 600;
            default:
                return -1;
        }

    }

    //Returns the unit for a given heading
    static String getUnit(String val) {
        switch (val) {
            case "HR":
                return "BPM";
            case "SBP":
                return "SBP";
            case "DBP":
                return "DBP";
            case "MAP":
                return "MAP";
            case "CVP":
                return "CVP";
            case "VT":
                return "VT";
            default:
                return "N/A";
        }
    }

    static Gauge.SkinType translateStringToGaugeType(String title) {
        switch (title) {
            case "Slim":
                return Gauge.SkinType.SLIM;
            case "Simple Section":
                return Gauge.SkinType.SIMPLE_SECTION;
            case "Line Graph":
                return Gauge.SkinType.TILE_SPARK_LINE;
            case "Modern":
                return Gauge.SkinType.MODERN;
            case "Scientific Box":
                return Gauge.SkinType.AMP;
            case "Quarter Gauge":
                return Gauge.SkinType.QUARTER;
            case "Horizontal Half":
                return Gauge.SkinType.HORIZONTAL;
            case "Vertical Half":
                return Gauge.SkinType.VERTICAL;
            case "Default Gauge":
                return Gauge.SkinType.GAUGE;
            default:
                return null;
        }
    }
}