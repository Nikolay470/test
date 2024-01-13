package calculator.model;

public class CalcModel {
    private String operator;

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public float Sum(float first, float second) {
        return first + second;
    }

    public float Difference(float first, float second) {
        return first - second;
    }
    public float Solution(float first, float second) {
        return first * second;
    }
    public float Share(float first, float second) {
        return first + second;
    }
}
