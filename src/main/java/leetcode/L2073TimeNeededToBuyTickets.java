package leetcode;

public class L2073TimeNeededToBuyTickets {

    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int max = tickets[k];

        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) time += Math.min(tickets[i], max);
            else time+= Math.min(tickets[i], max - 1);
        }
        return time;
    }

}
