package leetcode;

/**
 * 2491. Divide Players Into Teams of Equal Skill
 */
public class DividePlayersIntoTeamsOfEqualSkill{
    public long dividePlayers(int[] skill){
        if(skill.length % 2 == 1){
            return -1;
        }
        int[] freq = new int[1001];
        int totalSum = 0;
        for(int iter : skill){
            totalSum += iter;
            freq[iter]++;
        }
        if(totalSum % (skill.length / 2) != 0){
            return -1L;
        }
        int sum = totalSum / (skill.length / 2);
        long ret = 0L;
        for(int iter : skill){
            int dif = sum - iter;
            if(freq[dif] == 0){
                return -1L;
            }
            freq[dif]--;
            ret += ((long)dif * (long)iter);
        }
        return ret / 2;
    }
}
