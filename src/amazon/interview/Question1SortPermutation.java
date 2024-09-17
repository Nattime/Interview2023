package amazon.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Amazon recently conducted interviews where the candidates were asked to sort the permutation p of length n. The ith
 * candidate sorted the permutation in moves[i] moves. To verify the results once more, the interviewers want to find if
 * it is possible to sort the permutation in the given number of moves. Given the original permutation array p and the
 * number of moves made by each of the q candidates, find whether you can sort the permutation p by performing exactly
 * moves[i] moves. In one move you can swap values at any two distinct indices. Return the answer as a binary string of
 * length q. The value at the ith index should be 1 if it is possible to sort the permutation p in exactly moves[i] moves,
 * or 0 otherwise.
 *
 * Note: A permutation is a sequence of n distinct integers such that each integer between [1, n] appears exactly once.
 * For example, [1,3,2,4] is a permutation of size 4, but [1,3,4,5] or [1,2,2,4] are not.
 */
public class Question1SortPermutation{
    class Pair{
        int f;
        int s;

        Pair(int f, int s){
            this.f = f;
            this.s = s;
        }
    }

    public String sortPermutation(List<Integer> list, List<Integer> moves){
        int minMoves = minimumMoves(list);
        StringBuilder ret = new StringBuilder();
        for(Integer iter : moves){
            if(minMoves > iter){
                ret.append("0");
            }else{
                if((iter - minMoves) % 2 == 0){
                    ret.append("1");
                }else{
                    ret.append("0");
                }
            }
        }
        return ret.toString();
    }

    private int minimumMoves(List<Integer> list){
        int n = list.size();
        ArrayList<Pair> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new Pair(list.get(i), i));
        }
        arr.sort((o1, o2)->Integer.compare(o1.f, o2.s));
        boolean[] hasVisited = new boolean[n];
        Arrays.fill(hasVisited, false);
        int ret = 0;
        for(int i = 0; i < n; i++){
            if(hasVisited[i] || arr.get(i).s == i){
                continue;
            }
            int size = 0;
            int j = i;
            while(!hasVisited[j]){
                hasVisited[j] = true;
                j = arr.get(j).s;
                size++;
            }
            if(size > 0){
                ret += (size - 1);
            }
        }
        return ret;
    }
}
