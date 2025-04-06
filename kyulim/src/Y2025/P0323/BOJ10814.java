package Y2025.P0323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BOJ10814 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            int age = Integer.parseInt(str[0]);
            String name = str[1];
            personList.add(new Person(age, name, i));
        }

        br.close();

        personList.sort(Comparator.comparingInt(p -> p.age));

        for (Person p : personList) {
            System.out.println(p.age + " " + p.name);
        }
    }

    static class Person {

        int age;
        String name;
        int index;

        public Person(int age, String name, int index) {
            this.age = age;
            this.name = name;
            this.index = index;
        }
    }
}
