package DataStructure.Java8;

import org.junit.Test;

import java.math.BigInteger;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.time.temporal.ChronoUnit;

public class Solution1 {




    //1.Print list of object which are not null
    @Test

    public void listR() {
        List<Students> st = new ArrayList<>();
        st.add(new Students(1, "Sneha", "IT"));
        st.add(new Students(2, "Aashish", "CSE"));
        st.add(new Students(3, "Rahul", "ECE"));
        st.add(new Students(0, "", ""));

        st.stream().filter(Objects::nonNull).forEach(s -> System.out.println(s.name + " " + s.subject + " " + s.rollId));
    }

//2.Given a list of integers, separate odd and even numbers?
@Test
    public void evenOdd(){
        List<Integer> arr=Arrays.asList(12,23,34,45,43);

        Map<Boolean,List<Integer>> oddEven=arr.stream().collect(Collectors.partitioningBy(i->i%2==0));
        Set<Map.Entry<Boolean,List<Integer>>> entrySet=oddEven.entrySet();
       for (Map.Entry<Boolean,List<Integer>> entry:entrySet){
           if(entry.getKey()){
               System.out.println("Even number");

           }else {
               System.out.println("Odd number");
           }
           List<Integer> li=entry.getValue();
           for (int i:li){
               System.out.println(i+" ");
           }
       }

    }

    //3) How do you remove duplicate elements from a list using Java 8 streams?
    @Test
    public void dupRemove(){
        List<String> arr=Arrays.asList("Java","Micro","Java","C#","say");
        List<String> li=arr.stream().distinct().collect(Collectors.toList());
        String s=li.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
        System.out.println(li+ " "+s+" ");

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
       String list= listOfStrings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.joining());
        System.out.println(list);
        listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

    }

    //4) How do you find frequency of each character in a string using Java 8 streams?
    @Test
    public void freqChar(){
        String s="Get More Information";
       // Map<Character,Long> ch=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<String,Long> ch=Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(ch);
    }
    //5) How do you find frequency of each element in an array or a list?
    @Test
    public void FreqString(){
      List<String> set=Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
      Map<String,Long> sch= set.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(sch);
    }
    //6) How do you sort the given list of decimals in reverse order?
    @Test
    public void sortDeci(){

        List<Double> list=Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
    //7) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
    @Test
    public void stringJoin(){
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String s=listOfStrings.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(s+" ");

    }
    //8)From the given list of integers, print the numbers which are multiples of 5?
    @Test
    public void multiFive(){
        List<Integer> len=Arrays.asList(24,45,44,78,90,50);
        len.stream().filter(s->s % 5==0).forEach(System.out::println);
        int max=len.stream().max(Comparator.naturalOrder()).get();

        int secmax=len.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        int min=len.stream().min(Comparator.naturalOrder()).get();
        System.out.println(max+" "+secmax+" "+min);
        List<Integer> first3=len.stream().sorted(Comparator.naturalOrder()).limit(3).collect(Collectors.toList());
        System.out.println(first3);
        List<Integer> last3=len.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println(last3);
    }
    //9)How do you merge two unsorted arrays into single sorted array using Java 8 streams?
    @Test
    public void mergeSorted(){
        int[] a={2,4,7,12,23,34};
        int[] b={1,3,5,10,11,21,34,34};
        int[] c= IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
        int[] d= IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().distinct().toArray();
                Arrays.stream(a).filter(Arrays.asList(b)::contains).forEach(System.out::println);
        //System.out.println(Arrays.toString(a));
       // System.out.println(Arrays.toString(b));
    }
    //10)Find sum of all digits of a number in Java 8?

    @Test
    public void sumDigit(){
        int i=15623;
        Integer sum=Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sum);
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        int total=Arrays.stream(a).sum();
        System.out.println("sum "+total);
        double avg=Arrays.stream(a).average().getAsDouble();
        System.out.println("Average "+avg);
        //Anagram
        String s1="RaceCar";
        String s2="CarRace";
        s1= Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2=Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if(s1.equals(s2)){
            System.out.println("Anagram is true");
        }else {
            System.out.println("Anagram is false");
        }
    }

    @Test
    public void localDate() throws ParseException {
        LocalDate birthday=LocalDate.of(1990,8,25);
        LocalDate today=LocalDate.now();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf1=new SimpleDateFormat("EEEEE");
        Date d=sdf.parse(String.valueOf(birthday));
        String s=sdf1.format(d);
        System.out.println(s);
        System.out.println(ChronoUnit.YEARS.between(birthday,today));
        Stream.iterate(new int[]{1,0},f->new int[]{f[1],f[1]+2}).limit(10).map(f->f[0]).forEach(i-> System.out.println(i+" "));
    }
    @Test
    public  void lonelyinteger() {
        List<Integer> a=new ArrayList<>();
        a.add(4);a.add(9);a.add(95);
        a.add(4);a.add(9);a.add(95);
        a.add(93);
        List<Integer> unique=a.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(x->x.getValue()<2).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(unique);
        a.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(s->s.getValue()>2).map(Map.Entry::getKey).collect(Collectors.toList());
        unique.indexOf(0);
        /*int first=0,second=0;
            for(int i=0;i<arr.size();i++){
                first+=arr.get(i).get(i);
                second+=arr.get(i).get(arr.size()-1-i);*/

            //return Math.abs(first-second);
        //}
    }
@Test
    public void subtract(){
        List<Integer> arr= new ArrayList<>();
        arr.add(256741038);
    arr.add(623958417);
    arr.add(467905213);
    arr.add(714532089);
    arr.add(938071625);

    BigInteger sum= BigInteger.valueOf(arr.stream().mapToLong(Integer::intValue).sum());
    System.out.println(sum);
    BigInteger min=BigInteger.valueOf(arr.stream().min(Comparator.naturalOrder()).get());
    System.out.println(min);

    BigInteger max=BigInteger.valueOf(arr.stream().max(Comparator.naturalOrder()).get());
    System.out.println(max);

    System.out.println((sum.subtract(max))+" "+(sum.subtract(min)));
}


}