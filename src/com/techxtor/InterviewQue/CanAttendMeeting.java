package com.techxtor.InterviewQue;

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
        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);

/*        for (int[] interval : intervals) {
            for (int i : interval) {
                System.out.print(i + " ");
            }
            System.out.println();
        }*/

        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] > intervals[i + 1][0])
                return false;
        }
        return true;
    }
}
