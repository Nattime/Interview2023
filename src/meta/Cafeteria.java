package meta;

import java.util.Arrays;

/**
 * A cafeteria table consists of a row of NN seats, numbered from 11 to NN from left to right. Social distancing guidelines require that every diner be seated such that KK seats to their left and KK seats to their right (or all the remaining seats to that side if there are fewer than KK) remain empty.
 * There are currently MM diners seated at the table, the iith of whom is in seat SiSi​. No two diners are sitting in the same seat, and the social distancing guidelines are satisfied.
 * Determine the maximum number of additional diners who can potentially sit at the table without social distancing guidelines being violated for any new or existing diners, assuming that the existing diners cannot move and that the additional diners will cooperate to maximize how many of them can sit down.
 * Please take care to write a solution which runs within the time limit.
 * Constraints
 * 1≤N≤10151≤N≤1015
 * 1≤K≤N1≤K≤N
 * 1≤M≤500,0001≤M≤500,000
 * M≤NM≤N
 * 1≤Si≤N1≤Si​≤N
 */
public class Cafeteria{
    public long getMaxAdditionalDinersCount(long N, long K, int M, long[] S){
        Arrays.sort(S);
        long ret = 0;
        long l = 1;
        long r = 0;
        for(int i = 0; i < M; ++i){
            r = S[i] - K - 1;
            ret += l > r ? 0 : (r - l) / (K + 1) + 1;
            l = S[i] + K + 1;
        }
        ret += l > N ? 0 : (N - l) / (K + 1) + 1;
        return ret;
    }
}
