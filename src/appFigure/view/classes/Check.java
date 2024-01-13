package appFigure.view.classes;

import java.util.HashMap;

public class Check {
    public static boolean checkType(int type) {
        if (type >= 1 && type <= 4) {
            return true;
        }
        return false;
    }

    public static boolean checkParams(HashMap<String, Float> params) {
        for (Float value : params.values()) {
            if (value <= 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkOperation(int operation) {
        if (operation == 1 || operation ==2) {
            return true;
        }
        return false;
    }
}
