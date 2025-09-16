import java.util.*;

public class Aaa {
    public static void main(String[] args) {
        String input = "Java is great and Java is powerful";

        // 1
        String[] words = input.toLowerCase().split("\\s+");
        Set<String> unique = new LinkedHashSet<>(Arrays.asList(words));
        System.out.println("1. " + unique);

        // 2
        String longest = "";
        for (String w : words) {
            if (w.length() > longest.length()) longest = w;
        }
        System.out.println("2. " + longest);

        // 3
        int vowels = 0, consonants = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("3. Vowels: " + vowels + ", Consonants: " + consonants);

        // 4
        String pal = "Race car".replaceAll("\\s+", "").toLowerCase();
        String rev = new StringBuilder(pal).reverse().toString();
        System.out.println("4. " + pal.equals(rev));

        // 5
        String s = "hello world", sub = "world";
        int index = -1;
        for (int i = 0; i <= s.length() - sub.length(); i++) {
            if (s.substring(i, i + sub.length()).equals(sub)) {
                index = i; break;
            }
        }
        System.out.println("5. " + index);

        // 6
        int[] arr = {5, 2, 9, 1, 5, 6};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("6. " + Arrays.toString(arr));

        // 7
        String s2 = "a12bc34d5";
        int sum = 0, num = 0;
        for (char c : s2.toCharArray()) {
            if (Character.isDigit(c)) num = num * 10 + (c - '0');
            else { sum += num; num = 0; }
        }
        sum += num;
        System.out.println("7. " + sum);

        // 8
        int[] arr2 = {1, 2, 3, 2, 4, 5, 1};
        Set<Integer> seen = new HashSet<>(), dups = new HashSet<>();
        for (int n : arr2) if (!seen.add(n)) dups.add(n);
        System.out.println("8. " + dups);

        // 9
        String a1 = "listen", a2 = "silent";
        char[] aa = a1.toCharArray(), bb = a2.toCharArray();
        Arrays.sort(aa); Arrays.sort(bb);
        System.out.println("9. " + Arrays.equals(aa, bb));

        // 10
        System.out.println("10. " + "a b  c\td \n e".replaceAll("\\s+", ""));

        // 11
        String freq = "aabbccc";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : freq.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        System.out.println("11. " + map);

        // 12
        int n = 10, f1 = 0, f2 = 1;
        System.out.print("12. ");
        for (int i = 0; i < n; i++) {
            System.out.print(f1 + " ");
            int t = f1 + f2; f1 = f2; f2 = t;
        }
        System.out.println();

        // 13
        System.out.print("13. ");
        for (int i = 2; i <= 30; i++) {
            boolean prime = true;
            for (int j = 2; j * j <= i; j++) if (i % j == 0) prime = false;
            if (prime) System.out.print(i + " ");
        }
        System.out.println();

        // 14
        int[] arr3 = {1, 2, 3, 4, 5};
        int evenSum = 0;
        for (int i = 0; i < arr3.length; i += 2) evenSum += arr3[i];
        System.out.println("14. " + evenSum);

        // 15
        int[] arr4 = {5, 2, 9, 1, 7};
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < arr4.length; i++) {
            if (arr4[i] < arr4[minIdx]) minIdx = i;
            if (arr4[i] > arr4[maxIdx]) maxIdx = i;
        }
        int tmp = arr4[minIdx]; arr4[minIdx] = arr4[maxIdx]; arr4[maxIdx] = tmp;
        System.out.println("15. " + Arrays.toString(arr4));

        // 16
        String str = "hello"; char[] ch = str.toCharArray();
        for (int i = 0, j = ch.length - 1; i < j; i++, j--) {
            char t = ch[i]; ch[i] = ch[j]; ch[j] = t;
        }
        System.out.println("16. " + new String(ch));

        // 17
        int[] arr5 = {1, 2, 2, 3, 4, 4, 5};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int x : arr5) set.add(x);
        System.out.println("17. " + set);

        // 18
        int[] arr6 = {10, 5, 8, 20, 20, 15};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : arr6) {
            if (x > first) { second = first; first = x; }
            else if (x > second && x < first) second = x;
        }
        System.out.println("18. " + second);

        // 19
        int[] a = {1, 2, 3}, b = {3, 4, 5};
        LinkedHashSet<Integer> merged = new LinkedHashSet<>();
        for (int x : a) merged.add(x);
        for (int x : b) merged.add(x);
        System.out.println("19. " + merged);

        // 20
        String toSplit = "apple,banana,orange";
        List<String> parts = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (char c : toSplit.toCharArray()) {
            if (c == ',') { parts.add(sb.toString()); sb.setLength(0); }
            else sb.append(c);
        }
        parts.add(sb.toString());
        System.out.println("20. " + parts);
    }
}
