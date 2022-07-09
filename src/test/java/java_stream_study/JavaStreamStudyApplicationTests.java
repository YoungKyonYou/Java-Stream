package java_stream_study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
class JavaStreamStudyApplicationTests {

    @Test
    void StreamSetAdd() {
        List<Integer>list1=Arrays.asList(1,2,3);
        List<Integer>list2=Arrays.asList(4,5,6);
        List<Integer>list3=Arrays.asList(7,8,9);
        List<Integer> list4= Arrays.asList(10,0,-1);
        

        Set<Integer> set= Stream.of(list1, list2, list3, list4)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
        
        for(Integer s: set){
            System.out.println("s = " + s);
        }
        List<Integer> list= Stream.of(list1, list2, list3, list4)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet())
                .stream()
                .collect(Collectors.toList());
        for(Integer s: list){
            System.out.println("s = " + s);
        }

    }

}
