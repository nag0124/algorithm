package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class L3169CountDaysWithoutMeetings {

    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        List<int[]> mergedMeetings = new ArrayList<>();
        for (int[] meeting : meetings) {
            if (mergedMeetings.isEmpty() || meeting[0] > mergedMeetings.get(mergedMeetings.size() - 1)[1]) {
                mergedMeetings.add(meeting);
            } else {
                int[] lastMeeting = mergedMeetings.get(mergedMeetings.size() - 1);
                lastMeeting[1] = Math.max(lastMeeting[1], meeting[1]);
            }
        }

        int ans = 0;
        for (int[] meeting : mergedMeetings) {
            ans += (meeting[1] - meeting[0] + 1);
        }

        return days - ans;
    }

}
