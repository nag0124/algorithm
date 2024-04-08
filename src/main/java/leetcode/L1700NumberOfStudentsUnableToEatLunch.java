package leetcode;

public class L1700NumberOfStudentsUnableToEatLunch {

    public int countStudents(int[] students, int[] sandwiches) {
        int[] sdCnt = new int[2];
        for (int i : students) sdCnt[i]++;
        int remain = sandwiches.length;

        for (int i : sandwiches) {
            if (sdCnt[i] == 0) break;
            sdCnt[i]--;
            remain--;
        }
        return remain;
    }

}
