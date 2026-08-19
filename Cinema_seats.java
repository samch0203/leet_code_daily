import java.util.*;

class Solution {

    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

        // Store reserved seats row by row
        for (int[] seat : reservedSeats) {

            int row = seat[0];
            int col = seat[1];

            map.putIfAbsent(row, new HashSet<>());
            map.get(row).add(col);
        }

        // All rows are initially assumed to be empty
        // Empty row can fit 2 groups
        int answer = (n - map.size()) * 2;

        // Process only rows having reserved seats
        for (HashSet<Integer> reserved : map.values()) {

            boolean left = true;
            boolean middle = true;
            boolean right = true;

            // Left block: 2,3,4,5
            for (int seat = 2; seat <= 5; seat++) {
                if (reserved.contains(seat)) {
                    left = false;
                    break;
                }
            }

            // Middle block: 4,5,6,7
            for (int seat = 4; seat <= 7; seat++) {
                if (reserved.contains(seat)) {
                    middle = false;
                    break;
                }
            }

            // Right block: 6,7,8,9
            for (int seat = 6; seat <= 9; seat++) {
                if (reserved.contains(seat)) {
                    right = false;
                    break;
                }
            }

            if (left && right) {
                answer += 2;
            } 
            else if (left || middle || right) {
                answer += 1;
            }
        }

        return answer;
    }
}
