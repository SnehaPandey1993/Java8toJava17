package DataStructure.Java8;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Cookies {

    @Test
    public void test1(){
      String s=" ";
      List<Integer> A= (List<Integer>) Stream.of(s.split(" ")).mapToInt(Integer::parseInt);
      int k=291140174;
      int result=cookies(k,A);
        System.out.println(result);
    }
    public static int cookies(int k, List<Integer> A) {
        Collections.sort(A);
        BigInteger count = BigInteger.ZERO;
        while(A.get(0)<k && A.size()>1 ){
            BigInteger min= BigInteger.valueOf(A.remove(0));
            BigInteger secmix=BigInteger.valueOf(A.remove(0));
            BigInteger value= min.add(secmix.multiply(BigInteger.valueOf(2)));
            A.add(value.intValue());
            Collections.sort(A);
            count = count.add(BigInteger.ONE)  ;
        }

        return (A.get(0) >= k) ? count.intValue() : -1;
    }

}

