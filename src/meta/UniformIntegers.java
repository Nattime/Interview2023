package meta;

public class UniformIntegers{
    public int getUniformIntegerCountInInterval(long A, long B){
        String r = String.valueOf(B);
        int max = r.length();
        String l = String.valueOf(A);
        int low = l.length();
        int count = 0;
        for(int i = low; i <= max; i++){
            for(char ch = '1'; ch <= '9'; ch++){
                long num = Long.parseLong(String.valueOf(ch).repeat(Math.max(0, i)));
                if(num >= A && num <= B){
                    count += 1;
                }
            }
        }
        return count;
    }
}
