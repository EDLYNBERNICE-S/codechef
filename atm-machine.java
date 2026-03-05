/*
Problem: ATM Machine (CodeChef)

Description:
An ATM initially contains K units of money.
N people arrive one by one and each person wants to withdraw Ai money.

Rules:
• If the ATM has at least Ai money → withdrawal succeeds.
• Otherwise → withdrawal fails.

For each person we print:
1 → if the withdrawal is successful
0 → if the withdrawal fails.

The output for each test case is a binary string of length N.

--------------------------------------------------

Example

Input:
2
5 10
3 5 3 2 1
4 6
10 8 6 4

Output:
11010
0010

--------------------------------------------------

Approach:

1. Read number of test cases T.
2. For each test case:
   • Read N (people) and K (ATM balance).
   • Process each withdrawal request sequentially.
3. If Ai ≤ K:
      withdraw money
      reduce K
      append '1'
   else:
      append '0'
4. Print the result string.

This directly simulates how the ATM works.

--------------------------------------------------

Time Complexity:
O(T × N)

T = number of test cases
N = number of people

Each request is processed once.

--------------------------------------------------

Space Complexity:
O(N)

Used only for storing the result string.

--------------------------------------------------
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();
            int K = sc.nextInt();

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < N; i++) {

                int withdrawalAmount = sc.nextInt();

                if (withdrawalAmount <= K) {
                    K -= withdrawalAmount;
                    result.append("1");
                } else {
                    result.append("0");
                }
            }

            System.out.println(result.toString());
        }

        sc.close();
    }
}
