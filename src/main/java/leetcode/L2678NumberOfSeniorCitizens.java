package leetcode;

public class L2678NumberOfSeniorCitizens {

    public int countSeniors(String[] details) {
        int ans = 0;

        for (String detail : details) {
            int age = Integer.parseInt(detail.substring(11, 13));
            if (age > 60) ans++;
        }
        return ans;
    }

}
