package lesson2.line;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lines {
    private List<Line> lines = new ArrayList<>();

    void addLine(Line line) {
        lines.add(line);
    }

    double gedSumLine() {
        if (lines.isEmpty()) throw new IllegalArgumentException();
        return lines.stream().mapToDouble(Line::getLineLength).reduce((x1, x2) -> x1 + x2).orElse(0);
//        double result = 0;
//        for (Line line : lines) {
//            result += line.getLineLength();
//        }
//        return result;
    }

    Line getMaxLine() {
        if (lines.isEmpty()) throw new IllegalArgumentException();
        return lines.stream().max(Comparator.comparingDouble(Line::getLineLength)).get();
//        Line result = lines.get(0);
//        for (Line line : lines) {
//            if (result.getLineLength() < line.getLineLength()) {
//                result = line;
//            }
//        }
//        return result;
    }

    public List<Line> getLines() {
        return lines;
    }

    @Override
    public String toString() {
        return "Lines{" +
                "lines=" + lines +
                '}';
    }
}
