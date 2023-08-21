package summaryFriday._18_08_2023.MapAndStreamOperation;

import java.util.List;

public class EvenOddLists {
    private final List<Integer> oddList;
    private final List<Integer> evenList;

    public EvenOddLists(List<Integer> oddList, List<Integer> evenList) {
        this.oddList = oddList;
        this.evenList = evenList;
    }

    public List<Integer> getOddList() {
        return oddList;
    }

    public List<Integer> getEvenList() {
        return evenList;
    }
}
