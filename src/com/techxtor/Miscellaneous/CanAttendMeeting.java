package com.techxtor.Miscellaneous;

import java.util.Arrays;

public class CanAttendMeeting {
    public static void main(String[] args) {
        int[][] intervals = {{2, 4}, {3, 8}, {1, 9}};
        if (canAttendMeetings(intervals)) {
            System.out.println("Yes, Can attend Meeting");
        } else {
            System.out.println("No, Can not attend Meeting");
        }
    }

    static boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] > intervals[i + 1][0])
                return false;
        }
        return true;
    }
}
