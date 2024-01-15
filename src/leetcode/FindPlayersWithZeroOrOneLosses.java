package leetcode;

import java.util.*;

/**
 * 2225. Find Players With Zero or One Losses
 */
public class FindPlayersWithZeroOrOneLosses{
    public List<List<Integer>> findWinners(int[][] matches){
        Set<Integer> numbers = new HashSet<>();
        Set<Integer> oneLose = new HashSet<>();
        Set<Integer> moreLose = new HashSet<>();

        for(int[] iter : matches){
            int num = iter[1];
            if(oneLose.contains(num)){
                oneLose.remove(num);
                moreLose.add(num);
            }else if(!moreLose.contains(num)){
                oneLose.add(num);
            }
            numbers.add(iter[0]);
        }

        List<List<Integer>> ret = new LinkedList<>();
        numbers.removeAll(oneLose);
        numbers.removeAll(moreLose);
        List<Integer> numList = new ArrayList<>(numbers.stream().toList());
        Collections.sort(numList);
        List<Integer> oneList = new ArrayList<>(oneLose.stream().toList());
        Collections.sort(oneList);
        ret.add(numList);
        ret.add(oneList);
        return ret;
    }
}
