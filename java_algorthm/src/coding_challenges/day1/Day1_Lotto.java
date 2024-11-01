import java.util.List;
import java.util.Random;
import java.util.Set;

public class Day1_Lotto {
    
    // 로또번호 생성기
    public static void main(String[] args) {

        Random random = new Random();
        
        int[] lottoNumbers = new int[6];

        for (int i = 0; i <= lottoNumbers.length; i++) {
            
            Set<Integer> set = new HashSet<>();
            
            while (set.size() <= 6) {

                int num = random.nextInt(45) + 1;
                set.add(num);
            }
            
            List<Integer> list = new ArrayList<>(set);
            list.sort(null);

            System.out.println(list);
        }
        
    }
}
