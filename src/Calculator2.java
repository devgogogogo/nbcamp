import java.util.ArrayList;
import java.util.List;

public class Calculator2 {

    private List<Double> resultNums = new ArrayList<>();


    public List<Double> getResultNums() {
        return resultNums;
    }

    public void removeResult() {
        if (!resultNums.isEmpty()) {
            resultNums.remove(0);
        } else {
            System.out.println("삭제할 데이터가 없습니다.");
        }
    }

    public void setResultNums(List<Double> resultNums) {
        this.resultNums = resultNums;
    }

    public double plus(double a, double b) {
        double result = a + b;
        resultNums.add(result);
        return result;
    }
    public double minus(double a, double b) {
        double result = a - b;
        resultNums.add(result);
        return result;
    }
    public double multi(double a, double b) {
        double result = a * b;
        resultNums.add(result);
        return result;
    }
    public double div(double a, double b) {
        double result = a / b;
        resultNums.add(result);
        return result;
    }
    public double rest(double a, double b) {
        double result = a % b;
        resultNums.add(result);
        return result;
    }
}
