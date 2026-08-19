import java.lang.*;
import java.util.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int t = sc.nextInt();
			while (t-- > 0) {
				String s = sc.next();
				if (isLapindrome(s)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
		sc.close();
	}
	private static boolean isLapindrome(String s) {
		int n = s.length();
		int mid = n / 2;
		int[] freq = new int[26];
		for (int i = 0; i < mid; i++) {
			freq[s.charAt(i) - 'a']++;
		}
		int rightStart = (n % 2 == 0) ? mid : mid + 1;
		for (int i = rightStart; i < n; i++) {
			freq[s.charAt(i) - 'a']--;
		}
		for (int count : freq) {
			if (count != 0) {
				return false;
			}
		}
		return true;
	}
}
