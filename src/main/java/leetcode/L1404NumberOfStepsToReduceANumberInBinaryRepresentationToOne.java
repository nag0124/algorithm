package leetcode;

public class L1404NumberOfStepsToReduceANumberInBinaryRepresentationToOne {

    public int numSteps(String s) {
        int answer = 0;
        int carry = 0;
        char[] chars = s.toCharArray();

        for(int i = s.length() - 1; i > 0; i--){
            answer++;
            if(chars[i] - '0' + carry == 1){
                carry = 1;
                answer ++;
            }
        }
        return answer + carry;
    }

}
