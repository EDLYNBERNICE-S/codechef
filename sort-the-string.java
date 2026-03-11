/*
Problem: Sort the String (CodeChef)

Description:
You are given a binary string S of length N consisting of '0's and '1's.

In one operation, you can choose any substring of S and reverse it.

The goal is to determine the minimum number of operations required
to sort the string so that all '0's come first followed by all '1's.

Example:
Input:
4
3
000
4
1001
4
1010
6
010101

Output:
0
1
2
2


Approach:
To sort the binary string, we want the final format to be:

000...111

Each time the pattern "10" appears, it indicates a place where
a '1' appears before a '0', which breaks the sorted order.

By reversing appropriate substrings, each "10" pattern requires
one operation to fix.

Therefore, the minimum number of operations required is simply
the count of occurrences of "10" in the string.


Example Walkthrough:

S = "1010"

Pairs:
10 → count = 1
01 → ignore
10 → count = 2

Minimum operations = 2


Time Complexity:
O(N) per test case

We traverse the string once to count "10" occurrences.


Space Complexity:
O(1)

Only a few integer variables are used.
*/

import java.util.*;

class Codechef {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String s = sc.next();

            int operations = 0;

            for (int i = 0; i < n - 1; i++) {

                if (s.charAt(i) == '1' && s.charAt(i + 1) == '0') {
                    operations++;
                }

            }

            System.out.println(operations);
        }

        sc.close();
    }
}
